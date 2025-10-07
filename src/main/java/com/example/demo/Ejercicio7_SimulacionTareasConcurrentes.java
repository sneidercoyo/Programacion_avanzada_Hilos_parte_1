package com.example.demo;

public class Ejercicio7_SimulacionTareasConcurrentes {

    static class PreparandoPlato extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Preparando plato");
                try { Thread.sleep(300); } catch (InterruptedException e) {}
            }
        }
    }

    static class AtendiendoPedido extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Atendiendo pedido");
                try { Thread.sleep(300); } catch (InterruptedException e) {}
            }
        }
    }

    public static void ejecutar() {
        new PreparandoPlato().start();
        new AtendiendoPedido().start();
    }
}
