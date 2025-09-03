/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;
import java.util.Scanner;
/**
 *
 * @author brito
 * Realizar un programa que muestre en pantalla palabras
 * que sean ingresadas por teclado hasta que sse ingrese la palanra salir
 * discord insta tw yt cursos emprog
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ingrese una texto :");
        String  palabra = sc.nextLine();
        
       while (!palabra.equals("salir")) {
           System.out.println(palabra);
           palabra = sc.nextLine();
       }
    }
}