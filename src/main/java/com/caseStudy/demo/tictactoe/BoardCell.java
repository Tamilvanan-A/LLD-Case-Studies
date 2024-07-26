package com.caseStudy.demo.tictactoe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCell {
    private Integer rows;
    private Integer columns;
    private GameSymbol symbol;
}
