package com.caseStudy.demo.snakesandladders.models;

import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
@Builder(toBuilder = true)
public class GameRequests {
    private Integer boardSize;
    @Builder.Default
   private List<Players>players=new ArrayList<>();

    @Builder.Default
    private List<Dice>dices=new ArrayList<>();

    @Builder.Default
   private List<Cells>specialCells=new ArrayList<>();

}
