package com.example.lab4;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;

public class Lune extends Group {


    public Lune(int x, int y) {
        super();
        this.setTranslateX(x);
        this.setTranslateY(y);
        Circle lune = new Circle(65);
        Stop[] stops = new Stop[] {
                new Stop(0,Color.LIGHTGREY),
                new Stop(1,Color.BLACK)
        };
        LinearGradient ln = new LinearGradient(0,0,1,1,true, CycleMethod.NO_CYCLE,stops);
        lune.setFill(ln);

        this.getChildren().add(lune);

    }
}
