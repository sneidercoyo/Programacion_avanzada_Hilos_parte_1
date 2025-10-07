package com.example.demo;

public class Ejercicio1_HolaHilo extends Thread {
    public Ejercicio1_HolaHilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("El sistema está activo - " + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ejecutar() {
        Ejercicio1_HolaHilo hilo = new Ejercicio1_HolaHilo("Hilo1");
        hilo.start();
    }
}
