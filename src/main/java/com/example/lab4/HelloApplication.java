package com.example.lab4;

import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.LIGHTGREY;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Dessin4!");

        //Forme de base
        Rectangle rectangleDeFondNoir= new Rectangle(1200,450, BLACK);
        Rectangle rectangleDeFondGris = new Rectangle(600,450, LIGHTGREY);
        Group maisonGris = new Maison(300,225,true);
        Group maisonNoir = new Maison(900,225,false);
        Group oiseau1 = new Oiseau(200,100);
        Group oiseau2 = new Oiseau(150,150);
        Group soleil = new Soleil(450,65);
        Group etoile1 = new Etoile(650,100,2,2);
        Group etoile4 = new Etoile(800,75,4,4);
        Group etoile2 = new Etoile(700,50,5,2);
        Group etoile3 = new Etoile(750,150,3,5);
        Group lune = new Lune(1100,80);

        etoile1.setScaleX(5);
        etoile1.setScaleY(5);

        RotateTransition soleilTournant = new RotateTransition(Duration.seconds(8), soleil);
        soleilTournant.setByAngle(360);
        soleilTournant.setInterpolator(Interpolator.LINEAR);
        soleilTournant.setCycleCount(Timeline.INDEFINITE);
        soleilTournant.play();

        Group groupDeBase = new Group(rectangleDeFondNoir,rectangleDeFondGris,maisonGris,maisonNoir,oiseau1,oiseau2,soleil,etoile1,etoile2,etoile3,etoile4,lune);
        Scene scene = new Scene(groupDeBase);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}