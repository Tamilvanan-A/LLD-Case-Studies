package com.caseStudy.demo.commandpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidClassException;

public class Client {
    public static void main(String[] args) {
        CommandRegistry commandRegistry=createRegistry();
        BufferedReader br=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        while (true) {
            System.out.println(">");
           try {
               String input= br.readLine().toString();
               commandRegistry.execute(input);
           }catch (InvalidClassException e) {
             System.out.println("Common is Invalid");
           }catch (IOException e) {
               System.out.println("ISE: System error");
           }
        }

    }

    private static CommandRegistry createRegistry() {
        CommandRegistry registry=new CommandRegistry();
        registry.register(new CreateUser());
        registry.register(new CreateGame());
        return registry;
    }
}
