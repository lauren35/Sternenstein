/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * G had trouble pushing to the GitHub repo. He has started work on the player
 * class, and we will work on fixing the push issue with the new repo. We are
 * having to change to Maven to use JavaFX
 */
/**
 * Represents the player's life count.
 *
 *
 */
public class Life {

    int lifeCount;

    /**
     * Decreases the player's life count when they collide with an asteroid
     *
     * return integer value that is one less than the previous life value
     */
    int decrease() {
        //TODO implement decrease method
        return lifeCount;
    }

    /**
     * Will trigger the game over sequence when all lives are lost
     *
     * return void
     */
    void onGameOver() {
        //TODO implement onGameOver

    }
}
