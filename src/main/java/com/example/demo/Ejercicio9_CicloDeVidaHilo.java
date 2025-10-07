package com.example.demo;

public class Ejercicio9_CicloDeVidaHilo extends Thread {

    @Override
    public void run() {
        System.out.println("Descarga en progreso...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    public static void ejecutar() {
        Ejercicio9_CicloDeVidaHilo hilo = new Ejercicio9_CicloDeVidaHilo();
        System.out.println("Estado antes de start(): " + hilo.getState());
        hilo.start();
        try {
            Thread.sleep(100);
            System.out.println("Estado durante ejecución: " + hilo.getState());
            hilo.join();
            System.out.println("Estado después de join(): " + hilo.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
