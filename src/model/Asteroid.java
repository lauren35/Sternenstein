/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *  We are changing repos from ant to maven because javafx doesn't work on ant.
 * We will switch everything over to the new repo, and will be there next code
 * drop.
 */
/**
 * Hours worked: 3 (10/18)
 */
package model;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

public abstract class Asteroid {

    boolean collided;
    boolean destroyed;

    /**
     * This code is the basic code for creating an asteroid. By next code drop I
     * will have this class fully fleshed out. For now, it's only the basic
     * class to create simple asteroids.
     */
    private Polygon character;
    private Point2D movement;

    public Character(Polygon polygon, int x, int y) {
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);

        this.movement = new Point2D(0, 0);
    }

    public Polygon getCharacter() {
        return character;
    }

    public void turnLeft() {
        this.character.setRotate(this.character.getRotate() - 5);
    }

    public void turnRight() {
        this.character.setRotate(this.character.getRotate() + 5);
    }

    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
    }

    public void accelerate() {
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));

        changeX *= 0.05;
        changeY *= 0.05;

        this.movement = this.movement.add(changeX, changeY);
    }

    import javafx.scene.shape.Polygon ;

    public class Meteor extends Character {

        public Meteor(int x, int y) {
            super(new Polygon(20, -20, 20, 20, -20, 20, -20, -20), x, y);
        }
    }

}


/*
* Ship class must import below code
* import javafx.scene.shape.Asteroid;
*
* public class Ship extends Character {
*
*    public Ship(int x, int y) {
*        super(new Asteroid(-5, -5, 10, 0, -5, 5), x, y);
*    }
*} 
*
 */
/**
 * Checks to see if asteroid has collided with anything
 *
 * return
 */
}
