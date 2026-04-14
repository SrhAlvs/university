package br.edu.ifg.luziania.programacaoiiijavafx.mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UsuarioApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

//        FXMLLoader loader = new FXMLLoader(UsuarioApplication.class.getResource("usuario-view.fxml"));
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/br/edu/ifg/luziania/p3/usuario-view.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Cadastro de Usuários - JavaFX (FXML)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
