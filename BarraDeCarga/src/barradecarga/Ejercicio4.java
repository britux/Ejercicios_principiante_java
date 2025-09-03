/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;
import java.util.Scanner;

/**
 *
 * @author brito
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir datos 
        
        System.out.println("Ingresa el dni");
        String dni = sc.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        
        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {
            
            if (edad >= 6 && edad <=  10) {
                System.out.println("Eres del grupo Menores A");
            } else if (edad >= 11 && edad <=  17) {
                System.out.println("Eres del grupo Menores B");
            } else if (edad >= 18 && edad <=  30) {
                System.out.println("Eres del grupo Juvenil");
            } else if (edad >= 31 && edad <=  50) {
                System.out.println("Eres del grupo Adulto");
            } else if (edad >= 50) {
                System.out.println("Eres del grupo Adulto Mayor");
            } else {
                System.out.println("Edad no valida");
            }
            System.out.println();
            
            System.out.println("Ingresa el dni");
            dni = sc.nextLine();
            System.out.println("Ingresa el nombre");
            nombre = sc.nextLine();
            System.out.println("Ingresa tu edad");
            edad = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.println("Fin del programa");
        
    }
}
