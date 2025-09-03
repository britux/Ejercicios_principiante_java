/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservaasientos;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public class ReservaAsientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char asientos [][] = new char [10][10];
        int fila = 0, asiento = 0;
        int opcion;
        
        // Todo inicia con L
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[0].length; c++) {
                asientos[f][c] = 'L';
            }
        }
        
        
        do {
            System.out.println("BIENVENIDO AL SISTEMA DE RESERVAS DEL TEATRO BRITO");
            System.out.println("1  Mostrar mapa");
            System.out.println("2  Reservar un asiento");
            System.out.println("0  salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                
                
                case 1:
                    for (int f = 0; f < asientos.length; f++) {
                        System.out.println("---------------------------------------------------");
                        for (int c = 0; c < asientos[0].length; c++) {
                            System.out.print("|  " + asientos[f][c] + " ");
                         }
                        System.out.println("|");
                     }
                     System.out.println("---------------------------------------------------");
                    break;
                    
                    
                case 2:
                        String respuesta = "";
                        
                        do {
                            
                            System.out.println("Ingrese fila y asiento a reservar");
                            System.out.print("Fila (entre 0 y 9)");
                            fila = sc.nextInt();
                            System.out.print("Asiento (entre 0 y 9)");
                            asiento = sc.nextInt();
                            sc.nextLine();
                            
                            if (fila >= 0 && fila <10 && asiento >= 0 && asiento < 10) {
                                if (asientos[fila][asiento] == 'L') {
                                    asientos[fila][asiento] = 'X';
                                    System.out.println("Reservado con exito");
                                    
                                } else {
                                    System.out.println("El asiento esta reservado elije otro");
                                }
                            
                            } else {
                                System.out.println("Fila o asiento fuera de rango, vuelve a intentarlo\n");
                            }
                            
                            System.out.println("Desea hacer otra reservacion s: si n: no");
                            respuesta = sc.nextLine();
                        } while (respuesta.equalsIgnoreCase("s"));
                        
                    break;
                    
                case 0 :
                    System.out.println("Muchas gracias, Adios!!");
                    break;
                    
                default:
                    System.out.println("Opcion invalida Vuelve a intentarlo");
            }
        } while (opcion != 0);
        
    }
    
}
