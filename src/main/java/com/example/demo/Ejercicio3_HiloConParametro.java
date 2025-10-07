package com.example.demo;

public class Ejercicio3_HiloConParametro extends Thread {
    private int transacciones;

    public Ejercicio3_HiloConParametro(int transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public void run() {
        for (int i = 1; i <= transacciones; i++) {
            System.out.println("Procesando transacción #" + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }

    public static void ejecutar(int transacciones) {
        Ejercicio3_HiloConParametro hilo = new Ejercicio3_HiloConParametro(transacciones);
        hilo.start();
    }
}
