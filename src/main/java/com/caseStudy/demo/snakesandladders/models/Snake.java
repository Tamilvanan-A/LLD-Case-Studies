package com.caseStudy.demo.snakesandladders.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Snake extends Cells{
    private Integer endIndex;
    @Override
    public Integer getNextPosition() {
        return endIndex;
    }
}
