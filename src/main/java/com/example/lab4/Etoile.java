package com.example.lab4;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Etoile extends Group {

    public Etoile(int x, int y, int tempsDeTransition, double grosseur) {
        super();
        this.setTranslateX(x);
        this.setTranslateY(y);
        Polygon etoile = new Polygon(-3,-3,-0.14,4.06,3,-3,-4,2,4,2);
        etoile.setFill(Color.YELLOW);
        this.setScaleX(grosseur);
        this.setScaleY(grosseur);
        this.setRotate(180);

        FadeTransition fd = new FadeTransition(Duration.seconds(tempsDeTransition),etoile);
        fd.setFromValue(1);
        fd.setToValue(0);
        fd.setCycleCount(Timeline.INDEFINITE);
        fd.setInterpolator(Interpolator.EASE_BOTH);
        fd.setAutoReverse(true);
        fd.play();
        this.getChildren().add(etoile);
    }
}
