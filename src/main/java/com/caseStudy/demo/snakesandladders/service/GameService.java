package com.caseStudy.demo.snakesandladders.service;

import com.caseStudy.demo.snakesandladders.models.*;
import com.caseStudy.demo.snakesandladders.repositories.GameRepository;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    GameRepository gameRepository=new GameRepository();

    public Game createGame(GameRequests gameRequests) {
        Game game=initialiseGame(gameRequests);
        return gameRepository.save(game);
    }
    private Game initialiseGame(GameRequests gameRequests) {
        Board board=new Board(gameRequests.getBoardSize(),gameRequests.getSpecialCells());
        List<Players>players=gameRequests.getPlayers();
        List<Dice>dice=new ArrayList<>();
        return Game.builder().board(board).players(players).dices(dice).build();
    }

    public Game getGame(Integer gameId) {
        return gameRepository.findById(gameId);
    }
}
