/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanew;

/**
 *
 * @author abhis
 */
public class demo {
    public static void main(String[] args) {
        String lock1 = "A";
        String lock2 = "B";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked A");
                synchronized (lock2) {
                    System.out.println("Thread 1 locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) { // same order to avoid deadlock
                System.out.println("Thread 2 locked B");
                synchronized (lock1) {
                    System.out.println("Thread 2 locked A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

