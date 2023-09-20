package com.example.lab4;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;

public class Oiseau extends Group {

    public Oiseau(int valeurCentraleX,int valeurCentraleY) {
        super();
        this.setTranslateX(valeurCentraleX);
        this.setTranslateY(valeurCentraleY);


        QuadCurve aileDroiteDebut = new QuadCurve(0,12.5,10,-25,25,-30);
        QuadCurve aileDroiteFin = new QuadCurve(0,12.5,10,0,25,30);
        aileDroiteDebut.setStrokeWidth(3);
        aileDroiteDebut.setStroke(Color.BLACK);
        aileDroiteDebut.setFill(Color.TRANSPARENT);
        aileDroiteFin.setStrokeWidth(3);
        aileDroiteFin.setStroke(Color.BLACK);
        aileDroiteFin.setFill(Color.TRANSPARENT);
        this.getChildren().add(aileDroiteDebut);
        KeyValue kv1 = new KeyValue(aileDroiteDebut.endYProperty(),aileDroiteFin.getEndY());
        KeyFrame kf1 = new KeyFrame(Duration.seconds(1.5), kv1);

        QuadCurve aileGaucheDebut = new QuadCurve(0,12.5,-10,-25,-25,-30);
        QuadCurve aileGaucheFin = new QuadCurve(0,12.5,-10,0,-25,30);
        this.getChildren().add(aileGaucheDebut);
        aileGaucheDebut.setStrokeWidth(3);
        aileGaucheDebut.setStroke(Color.BLACK);
        aileGaucheDebut.setFill(Color.TRANSPARENT);
        aileGaucheFin.setStrokeWidth(3);
        aileGaucheFin.setStroke(Color.BLACK);
        aileGaucheFin.setFill(Color.TRANSPARENT);
        KeyValue kv2 = new KeyValue(aileGaucheDebut.endYProperty(),aileGaucheFin.getEndY());
        KeyFrame kf2 = new KeyFrame(Duration.seconds(1.5), kv2);


        Timeline timelineDroite = new Timeline();
        timelineDroite.setCycleCount(Timeline.INDEFINITE);
        timelineDroite.setAutoReverse(true);
        timelineDroite.getKeyFrames().addAll(kf1,kf2);
        timelineDroite.play();
    }

}
