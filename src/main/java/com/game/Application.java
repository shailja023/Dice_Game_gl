package main.java.com.game;

import main.java.com.game.dice.diceThrow;

public class Application {

    public static void main(String[] args) {
    	diceThrow.gameParameters();
    	diceThrow.game(diceThrow.composeGame());
    }
}
