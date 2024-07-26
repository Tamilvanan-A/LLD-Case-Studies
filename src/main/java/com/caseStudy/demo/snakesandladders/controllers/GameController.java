package com.caseStudy.demo.snakesandladders.controllers;

import com.caseStudy.demo.snakesandladders.models.Game;
import com.caseStudy.demo.snakesandladders.models.GameRequests;
import com.caseStudy.demo.snakesandladders.service.GameService;

public class GameController {
    private GameService gameService=new GameService();

    public Game createGame(GameRequests gameRequests) {
        return gameService.createGame(gameRequests);
    }
}
