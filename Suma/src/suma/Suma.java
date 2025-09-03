/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el primer valor");
        int valorUno = sc.nextInt();
        
        System.out.println("Dame el segundo valor");
        int valorDos = sc.nextInt();
        
        Suma2 suma2 = new Suma2(valorUno, valorDos);
        
        suma2.MostrarResultado();
    }
    
}
