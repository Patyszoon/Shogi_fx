package Myapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import plansza.Board;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private Scene scenaPowitalna;
    private Scene scenaMenu;
    private Scene scenaGry;
    private Scene scenaOpcje;
    private Scene scenaStatystyki;
    private Scene scenaWyboru;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        pokazScenaPowitalna();
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

    public void pokazScenaGry() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenaGry.fxml"));
        AnchorPane root = loader.load();

        ScenaGryController controllerScenaGry = loader.getController();
        controllerScenaGry.setMainApp(this);

        scenaGry = new Scene(root);
        primaryStage.setScene(scenaGry);
        primaryStage.setTitle("SHOGI GRA");
        //Board plansza = new Board();
        //primaryStage.add(plansza);





        //#####################################################################################


        /*JFrame okno = new JFrame();
        okno.setLayout(new GridBagLayout());
        okno.setMinimumSize(new Dimension(800, 800));
        okno.setTitle("Shogi");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLocationRelativeTo(null);

        Board plansza = new Board();
        okno.add(plansza);

        okno.setVisible(true);*/


        //###################################################################################


        /*JFrame okno = new JFrame();
        okno.setLayout(new GridBagLayout());
        Button przycisk = new Button("Wyjście");
        okno.setMinimumSize(new Dimension(1000, 800));
        okno.setTitle("Shogi");
        okno.add(przycisk);
        przycisk.setOnAction(e -> primaryStage.close());
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLocationRelativeTo(null);

        Board plansza = new Board();
        okno.add(plansza);

        okno.setVisible(true);*/



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