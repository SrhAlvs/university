package br.edu.ifg.luziania.programacaoiiijavafx.mvc;

import br.edu.ifg.luziania.programacaoiiijavafx.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
        import javafx.scene.control.cell.PropertyValueFactory;

public class UsuarioController {

    @FXML private TextField txtNome;
    @FXML private PasswordField txtSenha;
    @FXML private TextArea txtDescricao;

    @FXML private RadioButton rbMasculino;
    @FXML private RadioButton rbFeminino;

    @FXML private ComboBox<String> comboLinguagem;
    @FXML private CheckBox cbTermos;

    @FXML private TableView<Usuario> tabela;
    @FXML private TableColumn<Usuario, String> colNome;
    @FXML private TableColumn<Usuario, String> colSexo;
    @FXML private TableColumn<Usuario, String> colLinguagem;
    @FXML private TableColumn<Usuario, Boolean> colTermos;

    private ToggleGroup grupoSexo;
    private ObservableList<Usuario> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Configurar RadioButtons
        grupoSexo = new ToggleGroup();
        rbMasculino.setToggleGroup(grupoSexo);
        rbFeminino.setToggleGroup(grupoSexo);

        // ComboBox
        comboLinguagem.getItems().addAll("Java", "Python", "C++");
        comboLinguagem.setValue("Java");

        // TableView
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        colLinguagem.setCellValueFactory(new PropertyValueFactory<>("linguagem"));
        colTermos.setCellValueFactory(new PropertyValueFactory<>("termos"));

        tabela.setItems(lista);
    }

    @FXML
    private void adicionar() {

        RadioButton selecionado =
                (RadioButton) grupoSexo.getSelectedToggle();

        String sexo = (selecionado != null)
                ? selecionado.getText()
                : "";

        Usuario u = new Usuario(
                txtNome.getText(),
                txtSenha.getText(),
                txtDescricao.getText(),
                sexo,
                comboLinguagem.getValue(),
                cbTermos.isSelected()
        );

        lista.add(u);

        limparCampos();
    }

    @FXML
    private void remover() {
        Usuario u = tabela.getSelectionModel().getSelectedItem();
        if (u != null) {
            lista.remove(u);
        }
    }

    private void limparCampos() {
        txtNome.clear();
        txtSenha.clear();
        txtDescricao.clear();
        grupoSexo.selectToggle(null);
        cbTermos.setSelected(false);
    }
}