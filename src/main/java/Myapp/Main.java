package Myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private Scene scenaPowitalna;
    private Scene scenaMenu;
    private Scene scenaOpcje;
    private Scene scenaStatystyki;
    private Scene scenaWyboru;
    private Scene scenaPlanszy;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        pokazScenaPowitalna();

    }

    void pokazScenaRozgrywki() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaRozgrywki.fxml"));
        AnchorPane root = loader.load();


        ScenaRozgrywkiController controllerPlanszy = loader.getController();
        controllerPlanszy.setMainApp(this);

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int szerokosc = gd.getDisplayMode().getWidth();
        int wysokosc = gd.getDisplayMode().getHeight();

        scenaPlanszy = new Scene(root,szerokosc,wysokosc);
        primaryStage.setScene(scenaPlanszy);
        primaryStage.setTitle("SHOGI");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    private void pokazScenaPowitalna() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaPowitalna.fxml"));
        AnchorPane root = loader.load();


        ScenaPowitalnaController controllerScenaPowitalna = loader.getController();
        controllerScenaPowitalna.setMainApp(this);

        scenaPowitalna = new Scene(root);
        primaryStage.setScene(scenaPowitalna);
        primaryStage.setTitle("SHOGI POWITANIE");
        primaryStage.show();
    }

    public void pokazScenaMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaMenu.fxml"));
        AnchorPane root = loader.load();

        ScenaMenuController controllerScenaMenu = loader.getController();
        controllerScenaMenu.setMainApp(this);

        scenaMenu = new Scene(root);
        primaryStage.setScene(scenaMenu);
        primaryStage.setTitle("SHOGI MENU");
    }

    public void pokazScenaWyboru() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaWyboru.fxml"));
        AnchorPane root = loader.load();

        ScenaWyboruController controllerScenaWyboru = loader.getController();
        controllerScenaWyboru.setMainApp(this);

        scenaWyboru = new Scene(root);
        primaryStage.setScene(scenaWyboru);
        primaryStage.setTitle("SHOGI MENU");
    }





    public void pokazScenaOpcje() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaOpcje.fxml"));
        AnchorPane root = loader.load();

        ScenaOpcjeController controllerScenaOpcje = loader.getController();
        controllerScenaOpcje.setMainApp(this);

        scenaOpcje = new Scene(root);
        primaryStage.setScene(scenaOpcje);
        primaryStage.setTitle("SHOGI OPCJE");
    }

    public void pokazScenaStatystyki() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaStatystyki.fxml"));
        AnchorPane root = loader.load();

        ScenaStatystykiController controllerScenaStatystyki = loader.getController();
        controllerScenaStatystyki.setMainApp(this);

        scenaStatystyki = new Scene(root);
        primaryStage.setScene(scenaStatystyki);
        primaryStage.setTitle("SHOGI STATYSTYKI");
    }

    public static void main(String[] args) {
        launch(args);
    }
}