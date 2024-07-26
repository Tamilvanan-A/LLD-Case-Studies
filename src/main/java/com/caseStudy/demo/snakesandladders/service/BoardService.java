package com.caseStudy.demo.snakesandladders.service;

import com.caseStudy.demo.snakesandladders.models.Board;
import com.caseStudy.demo.snakesandladders.models.Cells;
import com.caseStudy.demo.snakesandladders.models.Game;
import com.caseStudy.demo.snakesandladders.models.Players;

public class BoardService {
    private GameService gameService=new GameService();

    public Board makeMove(Integer gameId,Integer playerId) {
        Game game= gameService.getGame(gameId);
        int rollValue=game.rollDice();

        Players players=getPlayer(game,playerId);
        Board updateBoard=updateBoard(game.getBoard(),players,rollValue);
        return updateBoard;
    }
    private Players getPlayer(Game game,Integer playerId) {
        for(Players player:game.getPlayers()) {
            if(player.getUser().getUserId().equals(playerId)) {
                return player;
            }
        }
        throw new RuntimeException("Player Not Found");
    }
    private Board updateBoard(Board board,Players players,int rollValue) {
        Cells currentCell=board.getCurrentCell(players);
        Cells nextCell=board.getNextCell(currentCell,rollValue);

        currentCell.removePiece(players.getPieces().get(0));
        nextCell.addPiece(players.getPieces().get(0));

        return board;
    }
}
