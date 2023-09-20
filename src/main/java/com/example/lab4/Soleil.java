package com.example.lab4;

import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Soleil extends Group {

    public Soleil(int coordonneX, int coordonneY) {
        super();
        this.setTranslateX(coordonneX);
        this.setTranslateY(coordonneY);

        Line rayonGrandeHorizontale = new Line(0,0,100,0);
        Line rayonGrandeHorizontaleInvisible = new Line(23,0,77,0);
        rayonGrandeHorizontaleInvisible.setStrokeWidth(2.5);
        rayonGrandeHorizontaleInvisible.setStroke(Color.LIGHTGREY);
        rayonGrandeHorizontale.setStrokeWidth(2.5);
        rayonGrandeHorizontale.setStroke(Color.YELLOW);
        this.getChildren().add(rayonGrandeHorizontale);
        this.getChildren().add(rayonGrandeHorizontaleInvisible);

        Line rayonGrandeVerticale = new Line(50,-50,50,50);
        rayonGrandeVerticale.setStrokeWidth(2.5);
        rayonGrandeVerticale.setStroke(Color.YELLOW);
        Line rayonGrandeVerticaleInvisible = new Line(50,-28,50,28);
        rayonGrandeVerticaleInvisible.setStrokeWidth(2.5);
        rayonGrandeVerticaleInvisible.setStroke(Color.LIGHTGREY);
        this.getChildren().add(rayonGrandeVerticale);
        this.getChildren().add(rayonGrandeVerticaleInvisible);

        Line rayonPetiteSlash = new Line(20,30,80,-30);
        rayonPetiteSlash.setStrokeWidth(2.5);
        rayonPetiteSlash.setStroke(Color.YELLOW);
        Line rayonPetitSlashInvisible = new Line(30,20,70,-20);
        rayonPetitSlashInvisible.setStrokeWidth(2.5);
        rayonPetitSlashInvisible.setStroke(Color.LIGHTGREY);
        this.getChildren().add(rayonPetiteSlash);
        this.getChildren().add(rayonPetitSlashInvisible);

        Line rayonPetiteBackSlash = new Line(20,-30,80,30);
        rayonPetiteBackSlash.setStrokeWidth(2.5);
        rayonPetiteBackSlash.setStroke(Color.YELLOW);
        Line rayonPetiteBackSlashInvisible = new Line(30,-20,70,20);
        rayonPetiteBackSlashInvisible.setStrokeWidth(2.5);
        rayonPetiteBackSlashInvisible.setStroke(Color.LIGHTGREY);
        this.getChildren().add(rayonPetiteBackSlash);
        this.getChildren().add(rayonPetiteBackSlashInvisible);

        Circle soleil = new Circle(50,0,25,Color.YELLOW);
        FillTransition soleilcouleur = new FillTransition(Duration.seconds(4),soleil);
        soleilcouleur.setToValue(Color.ORANGE);
        soleilcouleur.setCycleCount(Timeline.INDEFINITE);
        soleilcouleur.setAutoReverse(true);
        soleilcouleur.play();
        this.getChildren().add(soleil);


    }
}
