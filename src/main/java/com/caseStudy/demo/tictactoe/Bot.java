package com.caseStudy.demo.tictactoe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bot extends Player {
    private PlayingStrategy playingStrategy;

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.play(board);
    }

    @Override
    public void setSymbol(GameSymbol gameSymbol) {

    }
}
