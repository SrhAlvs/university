module br.edu.ifg.luziania.programacaoiiijavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens br.edu.ifg.luziania.programacaoiiijavafx to javafx.fxml;
    exports br.edu.ifg.luziania.programacaoiiijavafx;
    exports br.edu.ifg.luziania.programacaoiiijavafx.poo;
    opens br.edu.ifg.luziania.programacaoiiijavafx.poo to javafx.fxml;
    exports br.edu.ifg.luziania.programacaoiiijavafx.mvc;
    opens br.edu.ifg.luziania.programacaoiiijavafx.mvc to javafx.fxml;
}