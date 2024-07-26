package com.caseStudy.demo.snakesandladders.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Builder(toBuilder = true)
public class Game {
    private Board board;
    private Integer id;

    @Builder.Default
    private List<Players> players=new ArrayList<>();

    @Builder.Default
    private List<Dice> dices=new ArrayList<>();
    public int rollDice() {

        int rollValue = 0;
        for (Dice dice : this.dices) {
            rollValue += dice.roll();
        }

        return rollValue;
    }

}
