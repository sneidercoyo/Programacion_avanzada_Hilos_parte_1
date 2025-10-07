package com.example.demo;

public class Ejercicio2_DosTareasSimultaneas {

    static class RegistroPaquete extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Registrando paquete");
                try { Thread.sleep(400); } catch (InterruptedException e) {}
            }
        }
    }

    static class CalculandoCosto extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Calculando costo");
                try { Thread.sleep(400); } catch (InterruptedException e) {}
            }
        }
    }

    public static void ejecutar() {
        RegistroPaquete rp = new RegistroPaquete();
        CalculandoCosto cc = new CalculandoCosto();
        rp.start();
        cc.start();
    }
}
