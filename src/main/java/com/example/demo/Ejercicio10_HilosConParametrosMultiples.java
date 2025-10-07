package com.example.demo;

public class Ejercicio10_HilosConParametrosMultiples extends Thread {

    private int idPedido;
    private double valorTotal;

    public Ejercicio10_HilosConParametrosMultiples(int idPedido, double valorTotal) {
        this.idPedido = idPedido;
        this.valorTotal = valorTotal;
    }

    @Override
    public void run() {
        System.out.println("Procesando pedido ID: " + idPedido + ", Valor total: $" + valorTotal);
    }

    public static void ejecutar() {
        new Ejercicio10_HilosConParametrosMultiples(123, 456.78).start();
    }
}
