/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner sc = new Scanner (System.in);
    
    
    // Este metodo pide los valores al usuario
    public void pedirDatos () {
        System.out.print("Dame un valor");
        valor1 = sc.nextInt();
        System.out.print("Dame otro valor");
        valor2 = sc.nextInt();
        
    }
    
    //Este metodo muestra el resultado
    public void mostraResultado() {
        System.out.println("El resultado de la operacion es " + resultado);
        
    }
}
