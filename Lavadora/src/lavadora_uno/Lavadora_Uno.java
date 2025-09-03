/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavadora_uno;
import java.util.Scanner;
import libreria.LLFunciones;
/**
 *
 * @author brito
 */
public class Lavadora_Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color?");
        System.out.println("-Presiona 1 si es ropa blanca\n-Presiona 2 si es de color");
        int tipoDeRopa = sc.nextInt();
        
        
        System.out.println("Cuantos Kilos son de ropa?");
        int kilos =  sc.nextInt();
        
        LLFunciones funciones = new LLFunciones(kilos, tipoDeRopa);
        funciones.setTipoRopa(2);
        System.out.println("El tipo de ropa es: " + funciones.getTipoRopa());
        funciones.CicloFinalizado();
    }
    
}
