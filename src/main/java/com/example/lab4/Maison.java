package com.example.lab4;

import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Maison extends Group {

    int valeurCentraleX;
    int valeurCentraleY;


    public Maison(int valeurCentraleX,int valeurCentraleY,boolean ombrage) {
        super();
        this.valeurCentraleY = valeurCentraleY;
        this.valeurCentraleX = valeurCentraleX;

        Rectangle facsadeExterieur = new Rectangle(valeurCentraleX-75,valeurCentraleY,150,100);
        facsadeExterieur.setFill(Color.BEIGE);
        this.getChildren().add(facsadeExterieur);

        Polygon toit = new Polygon(valeurCentraleX-80,valeurCentraleY,valeurCentraleX+80,valeurCentraleY,valeurCentraleX,valeurCentraleY-80);
        toit.setFill(Color.BROWN);
        this.getChildren().add(toit);

        Rectangle porte = new Rectangle(valeurCentraleX-55,valeurCentraleY+57,29,43);
        porte.setFill(Color.SADDLEBROWN);
        this.getChildren().add(porte);

        Circle poignee = new Circle(valeurCentraleX-35,valeurCentraleY+80,4,Color.YELLOW);
        this.getChildren().add(poignee);

        Rectangle fenetre = new Rectangle(valeurCentraleX-10,valeurCentraleY+30,75,45);
        fenetre.setFill(Color.AQUA);
        fenetre.setStrokeWidth(4);
        fenetre.setStroke(Color.GREY);
        this.getChildren().add(fenetre);

        Rectangle fenetreH = new Rectangle(valeurCentraleX-10,valeurCentraleY+51,75,4);
        fenetreH.setFill(Color.GREY);
        this.getChildren().add(fenetreH);

        Rectangle fenetreV= new Rectangle(valeurCentraleX+25,valeurCentraleY+30,4,45);
        fenetreV.setFill(Color.GREY);
        this.getChildren().add(fenetreV);

        DropShadow ds = new DropShadow(20,-10,10,Color.DARKGREY);
        if(ombrage)
            facsadeExterieur.setEffect(ds);

        Text jour;
        if(ombrage) {
            jour = new Text(valeurCentraleX-40, valeurCentraleY+175, "Jour");
            jour.setFill(Color.BLACK);
            jour.setFont(new Font(40));
        }
        else {
            jour = new Text(valeurCentraleX-40, valeurCentraleY+175, "Nuit");
            jour.setFill(Color.WHITE);
            jour.setFont(new Font(40));

        }
        this.getChildren().add(jour);
    }
}
