package com.caseStudy.demo.commandpattern;

public interface Command {
    void execute(String command);
    boolean matches(String command);
}
