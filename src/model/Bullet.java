/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import Sternenstein.model.Asteroid;
/**
 *
 * @author laure
 */
public class Bullet {

    final double BULLET_WIDTH = 5.0f;
    final double BULLET_HEIGHT = 20.0f;

    private Point2D position;
    private Point2D velocity;

    private Rectangle bulletRectangle;

    private double angle;

    public Bullet(Point2D position, double speed, double angle, Pane pane) {
        this.position = position;
        this.angle = angle;
        this.velocity = new Point2D(Math.cos(angle) * speed,
                                    Math.sin(angle) * speed);
        bulletRectangle = new Rectangle(BULLET_WIDTH, BULLET_HEIGHT);
        bulletRectangle.setTranslateX(position.x);
        bulletRectangle.setTranslateY(position.y);
        bulletRectangle.setRotate(angle);

        pane.getChildren().add(bulletRectangle);
    }

    public void update() {
        this.position = this.position.add(velocity);
        this.bulletRectangle.setTranslateX(this.position.x);
        this.bulletRectangle.setTranslateY(this.position.y);
    }

    // this doesn't seem to be necessary for javafx
    // public void draw() {

    // }

    private boolean isColliding(Shape other) {
        Shape collision = Shape.intersect(this.bulletRectangle, other);
        return collision.getBoundsInLocal().getWidth() != -1;
    }

    private void destroy() {
        //TODO: Invoke some a function that signals whatever
        // manages the lifetime of the bullets to destroy
        // this instance
    }

    public void checkCollisions(Asteroid asteroids[]) {
        for (Asteroid a : asteroids) {
            //TODO: once Asteroid class gets implemented, replace
            // a.getShape() with whatever gets the Asteroid JavaFX
            // shape class
            if (isColliding(a.getShape())) {
                // TODO: Presuming Asteroid has a destroy() function
                // or something similar, call that here.
                // The asteroid has been hit, so call its function that
                // breaks it apart/destroys it
                // ex: a.destroy();
                destroy();
                break;
            }
        }
    }
}
