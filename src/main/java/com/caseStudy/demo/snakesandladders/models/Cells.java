package com.caseStudy.demo.snakesandladders.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Cells {
    private Integer index;
    private CellType type;
    private List<Piece>pieces= new ArrayList<>();

    public abstract Integer getNextPosition();
    public void removePiece(Piece piece) {
    }
    public void addPiece(Piece piece) {
    }

}
