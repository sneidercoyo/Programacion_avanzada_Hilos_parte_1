package com.example.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- Menú de Ejercicios de Hilos ---");
            System.out.println("1. Hola Hilo");
            System.out.println("2. Dos tareas simultáneas");
            System.out.println("3. Hilo con parámetro");
            System.out.println("4. Hilo con nombre personalizado");
            System.out.println("5. Pausa entre tareas");
            System.out.println("6. Contador regresivo");
            System.out.println("7. Simulación de tareas concurrentes");
            System.out.println("8. Hilos con prioridad");
            System.out.println("9. Ciclo de vida del hilo");
            System.out.println("10. Hilos con parámetros múltiples");
            System.out.println("11. Temporizador de tareas");
            System.out.println("12. Simulación de carga paralela");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1_HolaHilo.ejecutar();
                case 2 -> Ejercicio2_DosTareasSimultaneas.ejecutar();
                case 3 -> {
                    System.out.print("Ingrese número de transacciones: ");
                    int t = sc.nextInt();
                    Ejercicio3_HiloConParametro.ejecutar(t);
                }
                case 4 -> Ejercicio4_HiloConNombrePersonalizado.ejecutar();
                case 5 -> Ejercicio5_PausaEntreTareas.ejecutar();
                case 6 -> Ejercicio6_ContadorRegresivo.ejecutar();
                case 7 -> Ejercicio7_SimulacionTareasConcurrentes.ejecutar();
                case 8 -> Ejercicio8_HilosConPrioridad.ejecutar();
                case 9 -> Ejercicio9_CicloDeVidaHilo.ejecutar();
                case 10 -> Ejercicio10_HilosConParametrosMultiples.ejecutar();
                case 11 -> {
                    System.out.print("Ingrese segundos para temporizador: ");
                    int seg = sc.nextInt();
                    Ejercicio11_TemporizadorDeTareas.ejecutar(seg);
                }
                case 12 -> Ejercicio12_SimulacionCargaParalela.ejecutar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    }
}
