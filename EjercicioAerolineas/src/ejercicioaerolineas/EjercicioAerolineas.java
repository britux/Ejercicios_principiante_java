/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioaerolineas;

import java.util.Scanner;

/**
 *
 * @author brito
 */
public class EjercicioAerolineas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        //crear matriz
        int vuelos[][] = new int[6][3];

        //cargamos la matriz
        for (int f = 0; f < vuelos.length; f++) {
            for (int c = 0; c < vuelos[0].length; c++) {
                System.out.println("Ingre la cantidad de asientos para el destino " + f + " horario: " + c);
                vuelos[f][c] = 5;
            }
        }

        //venta de asientos 
        String bandera = "";

        int destino, horarios, asientos;
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.print("Ingrese el numero de destino ");
            destino = sc.nextInt();
            System.out.print("Ingrese el horario de vuelo ");
            horarios = sc.nextInt();
            System.out.print("Ingrese la cantidad de asientos ");
            asientos = sc.nextInt();
            sc.nextLine();

            if (destino >= 0 && destino < 6) {
                if (horarios >= 0 && horarios < 3) {
                    if (vuelos[destino][horarios] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        vuelos[destino][horarios] -= asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                    System.out.println("Desea continuar reservando? s: si o finish para salir");
                    bandera = sc.nextLine();
                } else {
                    System.out.println("El horario tiene que estar entre 0 y 2");
                }

            } else {
                System.out.println("Su destino tiene que estar entre 0 y 5");
            }

        }
    }

}
