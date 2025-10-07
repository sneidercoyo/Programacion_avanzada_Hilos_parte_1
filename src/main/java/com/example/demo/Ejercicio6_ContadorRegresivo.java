package com.example.demo;

public class Ejercicio6_ContadorRegresivo extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Cuenta regresiva: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ejecutar() {
        new Ejercicio6_ContadorRegresivo().start();
    }
}
