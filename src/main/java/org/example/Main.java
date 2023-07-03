package org.example;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread2.start();
        myThread1.start();
    }
}