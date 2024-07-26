package com.caseStudy.demo.snakesandladders.models;

import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
@Builder(toBuilder=true)
public class Players {
    private Colour colour;
    private User user;

    @Builder.Default
    private List<Piece>pieces=new ArrayList<>();
}
 