/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;
import java.util.Scanner;
/**
 *
 * @author brito
 * Replicar la siguiente salida en consola.
     *
    ***
   *****
  *******
 *********
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declarar altura
        System.out.println("De que altura quieres el Arbolito");
        int altura = sc.nextInt();
        
        //bucle para recorer todas la filas
        for (int fila = 0; fila < altura; fila++) {
            
            // bucle para los espacios 
            for (int espcio = 0; espcio < (altura-fila-1); espcio++) {
                System.out.print(" ");
            }
            
            // bucle asteriscos
            for (int asteriscos = 0; asteriscos < (1 + fila * 2); asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
     // hacer el tronquito
     
     // fila
        for (int fila = 0; fila < 2; fila++) {
            
            //espacios
            for (int espacio = 0; espacio < altura - 2; espacio++) {
                System.out.print(" ");
            }
            System.out.print("|||");
            System.out.println("");
        }
     
    }
}
