package com.caseStudy.demo.snakesandladders.controllers;

import com.caseStudy.demo.snakesandladders.models.Board;
import com.caseStudy.demo.snakesandladders.service.BoardService;

public class BoardController {

    private BoardService boardService= new BoardService();
    public Board makeMove(Integer gameId,Integer playerId) {
        return boardService.makeMove(gameId,playerId);
    }
}
