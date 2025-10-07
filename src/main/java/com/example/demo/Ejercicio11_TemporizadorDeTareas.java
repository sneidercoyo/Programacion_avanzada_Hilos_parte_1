package com.example.demo;

public class Ejercicio11_TemporizadorDeTareas extends Thread {
    private int segundos;

    public Ejercicio11_TemporizadorDeTareas(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public void run() {
        try {
            System.out.println("Temporizador iniciado por " + segundos + " segundos...");
            Thread.sleep(segundos * 1000L);
            System.out.println("Temporizador finalizado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ejecutar(int segundos) {
        new Ejercicio11_TemporizadorDeTareas(segundos).start();
    }
}
