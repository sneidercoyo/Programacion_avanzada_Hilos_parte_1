package com.example.demo;

public class Ejercicio4_HiloConNombrePersonalizado extends Thread {

    public Ejercicio4_HiloConNombrePersonalizado(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("Conductor " + getName() + " en ruta");
    }

    public static void ejecutar() {
        Thread c1 = new Ejercicio4_HiloConNombrePersonalizado("Carlos");
        Thread c2 = new Ejercicio4_HiloConNombrePersonalizado("Luisa");
        Thread c3 = new Ejercicio4_HiloConNombrePersonalizado("Marta");
        c1.start();
        c2.start();
        c3.start();
    }
}
