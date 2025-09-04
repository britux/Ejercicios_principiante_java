/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public abstract class OperacionesClasePadre {
    protected int val1, val2, resultado;
    Scanner sc = new Scanner(System.in);
    
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        val1 = sc.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        val2 = sc.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void Resultado() {
        System.out.println("El resultado es: " + resultado);
    }
    
    
}
