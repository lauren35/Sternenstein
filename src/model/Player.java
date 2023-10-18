/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Represents the player and score of the user during game play
 *
 */
public class Player {

    String playerName;

    /**
     * constructor for Player sets playerName to an empty string
     *
     */
    Player() {
        playerName = " ";
    }

    /**
     * gets the player name
     *
     * returns string of player's name
     */
    public String getName() {
        String name;
        name = "Player name: " + playerName;
        return playerName;
    }

 
}
