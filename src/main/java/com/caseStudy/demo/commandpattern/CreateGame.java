package com.caseStudy.demo.commandpattern;

public class CreateGame implements Command{

    @Override
    public void execute(String command) {
    }
    @Override
    public boolean matches(String command) {
        return false;
    }
}
