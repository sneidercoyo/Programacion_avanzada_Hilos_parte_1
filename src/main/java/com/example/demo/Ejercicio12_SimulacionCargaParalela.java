package com.example.demo;

public class Ejercicio12_SimulacionCargaParalela extends Thread {
    private String nombre;

    public Ejercicio12_SimulacionCargaParalela(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Servidor " + nombre + " cargando: " + i + "%");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
        System.out.println("Servidor " + nombre + " carga completa.");
    }

    public static void ejecutar() {
        new Ejercicio12_SimulacionCargaParalela("Servidor1").start();
        new Ejercicio12_SimulacionCargaParalela("Servidor2").start();
        new Ejercicio12_SimulacionCargaParalela("Servidor3").start();
    }
}
