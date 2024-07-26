package com.caseStudy.demo.tictactoe;

public abstract class Player {
    private GameSymbol symbol;

    public abstract BoardCell makeMove(Board board);

    public abstract void setSymbol(GameSymbol gameSymbol);
}

