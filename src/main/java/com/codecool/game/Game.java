package com.codecool.game;

import com.codecool.board.Board;
import com.codecool.exceptions.DrawException;
import com.codecool.player.Player;
import com.codecool.player.PlayerFactory;

import java.util.List;

public class Game {

    private Board board;
    private Player firstPlayer;
    private Player secondPlayer;


    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        System.out.println("game started");
        while (firstPlayer.isAlive() || secondPlayer.isAlive()) {
            break;
        }
    }

    private void playerTurn() {
        // logic for player turn
    }
}
