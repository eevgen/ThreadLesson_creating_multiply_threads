package org.example;

public class MyThread extends Thread{

    CoffeMachine coffeMachine = new CoffeMachine();

    @Override
    public void run() {
        coffeMachine.doingCoffee();
    }

}
