package com.codecool.game;

import com.codecool.player.Player;
import com.codecool.player.PlayerFactory;

public class GameFactory {

    public static Game createGame(GameMode gameMode) {
        switch (gameMode) {
            case PLAYER_VS_PLAYER:
                return new Game(
                        PlayerFactory.createHumanPlayer(),
                        PlayerFactory.createHumanPlayer()
                );
            case PLAYER_VS_PC:
                return new Game(
                        PlayerFactory.createHumanPlayer()),
            PlayerFactory.createPcPlayer()
        }
    }
}
