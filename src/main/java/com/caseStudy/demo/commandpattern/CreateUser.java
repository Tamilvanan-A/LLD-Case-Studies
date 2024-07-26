package com.caseStudy.demo.commandpattern;
import com.caseStudy.demo.snakesandladders.controllers.UserController;

import java.util.Arrays;
import java.util.List;

public class CreateUser implements Command{
    private static final String COMMAND_NAME="create_user";
    private UserController controller=new UserController();
    @Override
    public void execute(String command) {
        //create_user  == getDisplayName
        //create_user  name  email@gmail.com

        List<String> tokens= Arrays.asList(command.split(" "));
        String userName= tokens.get(1);
        String email=tokens.get(2);
        int id= generateRandomId();
    }

    private int generateRandomId() {
        return ((int) Math.random())+1;
    }

    @Override
    public boolean matches(String command) {
        List<String>tokens=Arrays.asList(command.split(" "));
        if(tokens.size()>0&&tokens.get(0).equals(COMMAND_NAME)) {
            return true;
        }
       return false;
    }
}
