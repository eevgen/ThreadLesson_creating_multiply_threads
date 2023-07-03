package org.example;

import java.util.Random;

public class CoffeMachine {

    public void doingCoffee() {
        for (int i = 0; i < (new Random()).nextInt(100, 1000); i++) {
            System.out.println("...Doing coffee...");
            System.out.println("...Showing loading process...");
        }
    }

}
