package br.edu.ifg.luziania.programacaoiiijavafx.poo;

import br.edu.ifg.luziania.programacaoiiijavafx.Usuario;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsuarioApplication extends Application {

    private ObservableList<Usuario> listaUsuarios =
            FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {

        // =============================
        // CONTROLES
        // =============================

        Label lblNome = new Label("Nome:");
        TextField txtNome = new TextField();

        Label lblSenha = new Label("Senha:");
        PasswordField txtSenha = new PasswordField();

        Label lblDesc = new Label("Descrição:");
        TextArea txtDesc = new TextArea();
        txtDesc.setPrefRowCount(3);

        // RadioButton (Sexo)
        ToggleGroup grupoSexo = new ToggleGroup();
        RadioButton rbMasculino = new RadioButton("Masculino");
        RadioButton rbFeminino = new RadioButton("Feminino");

        rbMasculino.setToggleGroup(grupoSexo);
        rbFeminino.setToggleGroup(grupoSexo);

        // ComboBox
        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll("Java", "Python", "C++");
        combo.setValue("Java");

        // CheckBox
        CheckBox cbTermos = new CheckBox("Aceito os termos");

        // Botões
        Button btnAdicionar = new Button("Adicionar");
        Button btnRemover = new Button("Remover");

        // =============================
        // TABLEVIEW
        // =============================

        TableView<Usuario> tabela = new TableView<>();

        TableColumn<Usuario, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

        TableColumn<Usuario, String> colSexo = new TableColumn<>("Sexo");
        colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Usuario, String> colLing = new TableColumn<>("Linguagem");
        colLing.setCellValueFactory(new PropertyValueFactory<>("linguagem"));

        TableColumn<Usuario, Boolean> colTermos = new TableColumn<>("Termos");
        colTermos.setCellValueFactory(new PropertyValueFactory<>("termos"));

        tabela.getColumns().addAll(colNome, colSexo, colLing, colTermos);
        tabela.setItems(listaUsuarios);

        // =============================
        // EVENTOS
        // =============================

        btnAdicionar.setOnAction(e -> {

            String nome = txtNome.getText();
            String senha = txtSenha.getText();
            String desc = txtDesc.getText();

            RadioButton selecionado =
                    (RadioButton) grupoSexo.getSelectedToggle();

            String sexo = (selecionado != null) ?
                    selecionado.getText() : "";

            String linguagem = combo.getValue();
            boolean termos = cbTermos.isSelected();

            Usuario user = new Usuario(
                    nome, senha, desc, sexo, linguagem, termos
            );

            listaUsuarios.add(user);

            // Limpar campos
            txtNome.clear();
            txtSenha.clear();
            txtDesc.clear();
            grupoSexo.selectToggle(null);
            cbTermos.setSelected(false);
        });

        btnRemover.setOnAction(e -> {
            Usuario selecionado =
                    tabela.getSelectionModel().getSelectedItem();

            if (selecionado != null) {
                listaUsuarios.remove(selecionado);
            }
        });

        // =============================
        // LAYOUT
        // =============================

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(10));

        form.add(lblNome, 0, 0);
        form.add(txtNome, 1, 0);

        form.add(lblSenha, 0, 1);
        form.add(txtSenha, 1, 1);

        form.add(lblDesc, 0, 2);
        form.add(txtDesc, 1, 2);

        form.add(new Label("Sexo:"), 0, 3);
        HBox sexoBox = new HBox(10, rbMasculino, rbFeminino);
        form.add(sexoBox, 1, 3);

        form.add(new Label("Linguagem:"), 0, 4);
        form.add(combo, 1, 4);

        form.add(cbTermos, 1, 5);

        HBox botoes = new HBox(10, btnAdicionar, btnRemover);

        VBox root = new VBox(10, form, botoes, tabela);
        root.setPadding(new Insets(10));

        // =============================
        // SCENE
        // =============================

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("Cadastro de Usuários - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
