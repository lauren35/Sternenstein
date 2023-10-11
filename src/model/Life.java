/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Represents the player's life count.
 * 
 * return an integer value between 0 and 3
 */
public class Life {
    
    int lifeCount;
    
    /**
     * Decreases the player's life count when they collide with an asteroid
     * 
     * return integer value that is one less than the previous life value
     */
    int decrease(int lifeCount){
        //TODO implement decrease method
        return lifeCount; 
    }
    
    /**
     * Will trigger the game over sequence when all lives are lost
     * 
     * return void
     */
    
    void onGameOver(){
        //TODO implement onGameOver
        
    }
}
