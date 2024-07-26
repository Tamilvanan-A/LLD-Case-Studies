package com.caseStudy.demo.snakesandladders.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Board {
    List<Cells> cells=new ArrayList<>();

    public Board(int size,List<Cells>specialCells) {
        this.cells=createBoard(size,parseSpecialCells(specialCells));
    }

    private Map<Integer,Cells> parseSpecialCells(List<Cells>cells) {
        Map<Integer,Cells>specialCells=new HashMap<>();
        for(Cells cell:cells) {
             specialCells.put(cell.getIndex(),cell);
        }
        return specialCells;
    }
    private List<Cells> createBoard(int size,Map<Integer,Cells> specialCells) {
        List<Cells>cells=new ArrayList<>();
        for(int index=0;index<size;index++) {
            Cells cell=constructCells(index,specialCells);
            cell.setIndex(index);
            cells.add(cell);
        }
        return cells;
    }
    private Cells constructCells(int index,Map<Integer,Cells>specialCells) {
        if(specialCells.containsKey(index)) {
            return specialCells.get(index);
        }
        return BaseCell.builder().type(CellType.BASE).index(index).build();
    }
    public Cells getCurrentCell(Players player) {
        for(Cells cell: cells) {
            if(cell.getPieces().contains(player.getPieces().get(0)));
            return cell;
        }
        throw new RuntimeException("Player Not Found");
    }
    public Cells getNextCell(Cells currentCell, int rollValue) {
        return null;
    }
}
