package com.example.demo;


public class Ejercicio8_HilosConPrioridad extends Thread {
    public Ejercicio8_HilosConPrioridad(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " ejecutando con prioridad " + getPriority());
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }

    public static void ejecutar() {
        Ejercicio8_HilosConPrioridad t1 = new Ejercicio8_HilosConPrioridad("Alta prioridad");
        Ejercicio8_HilosConPrioridad t2 = new Ejercicio8_HilosConPrioridad("Prioridad media");
        Ejercicio8_HilosConPrioridad t3 = new Ejercicio8_HilosConPrioridad("Baja prioridad");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
