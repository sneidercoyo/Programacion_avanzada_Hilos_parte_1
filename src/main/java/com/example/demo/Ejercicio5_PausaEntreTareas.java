package com.example.demo;

public class Ejercicio5_PausaEntreTareas extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Leyendo temperatura...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    public static void ejecutar() {
        new Ejercicio5_PausaEntreTareas().start();
    }
}
