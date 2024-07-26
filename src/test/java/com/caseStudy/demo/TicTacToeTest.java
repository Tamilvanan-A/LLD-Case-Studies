package com.caseStudy.demo;


import com.caseStudy.demo.tictactoe.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    private Game game;

    public void setUp() {
        this.game=createGame();
    }

    private Game createGame() {
        Game game=new Game();
        Board board=new Board(3,3);
        game.setBoard(board);
        HumanPlayer humanPlayer=new HumanPlayer();
        humanPlayer.setSymbol(GameSymbol.O);
        humanPlayer.setUser(new User());

        Bot bot=new Bot();
        bot.setSymbol(GameSymbol.X);

       // game.setPlayers(Arrays.asList(human,bot));
        return game;
    }
    @Test
    public void testDimensions() {
        List<List<BoardCell>> cells = game.getBoard();
        assertEquals(3,cells.size());

        List<BoardCell>firstRow=cells.get(0);
        assertEquals(3,firstRow);
    }
}
