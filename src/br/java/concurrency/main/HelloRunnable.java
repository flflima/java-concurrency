package br.java.concurrency.main;

/**
 * Created by felipe on 05/11/17.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread!!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
