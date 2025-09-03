/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

import java.util.Scanner;

/**
 *
 * @author brito
 */
public class RectanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el valor de la base ");
        int base = sc.nextInt();
        System.out.println("Dame el valor de la altura ");
        int altura = sc.nextInt();
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.MostrarResultado();
    }
}
