package com.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Resource resource=new Resource();
        new Thread(new Consumer(resource)).start();
        new Thread(new Consumer(resource)).start();
        new Thread(new Producer(resource)).start();
        new Thread(new Producer(resource)).start();
    }
}
