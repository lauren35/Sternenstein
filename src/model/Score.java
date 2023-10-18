/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Calculates and holds the player's score
 *
 * returns an integer score value
 */
public class Score {

    int score;

    /**
     * constructor for Score class sets score to 0
     */
    Score() {
        score = 0;
    }

    /**
     * Updates score if player shoots an asteroid
     *
     * @return an integer value
     */
    int addScore() {
        if (Bullet.collided()) {
            score = score++;
        }
        return score;
    }

    public String getScore() {
        String stringScore = String.valueOf(score);
        return "Score: "+ stringScore;
    }

}
