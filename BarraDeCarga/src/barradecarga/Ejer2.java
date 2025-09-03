/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;
import java.util.Scanner;
/**
 *
 * @author brito
 * un programa que permita cargar numeros 5  una matriz de  4x5 f y c
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz5[][] = new int [4][5];
        //for para cargarla
        for (int f = 0; f < matriz5.length; f++) {
            for (int c = 0; c <= matriz5.length; c++) {
                matriz5[f][c] = 5;
            }
        }
        
        
        //for para mostrarla
        for (int f = 0; f < matriz5.length; f++) {
            System.out.println("---------------------------");
            for (int c = 0; c < matriz5[0].length; c++) {
                System.out.print("|  " + matriz5[f][c] + " ");
            }
            System.out.println(" |");
        }
        System.out.println("---------------------------");
    }
}
