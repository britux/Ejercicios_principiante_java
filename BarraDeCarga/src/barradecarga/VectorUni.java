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
public class VectorUni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vector [] = new int [5];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero para guardarlo en el vector " + i);
            vector[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("El numero guardado en el vector " + (i+1) + " es " + vector[i]);
            System.out.println("---------------------------------------------------------");
        }
    }
}
