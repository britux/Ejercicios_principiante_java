/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;

/**
 *
 * @author brito
 * 
 */
//Ciclo fibonnaci
public class While {
    public static void main(String[] args) {
        int cont = 0, a = 1, b = 2, suma;
        
        while(cont < 11) {
            System.out.print(a + ", ");
            suma =  a + b;
            a = b;
            b = suma;
            cont++;
            
        }
    }
}
