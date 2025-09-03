/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacionticket;

import asignacionticket.logica.Cliente;
import asignacionticket.logica.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public class AsignacionTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Ticket> listaTickets = new ArrayList<Ticket>();
        
        // creo tickets
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(12, 2, 4, 1500, new Date(), new Date());
        
        // creo uno con el constructor vacio y encapsulamiento
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(6);
        ticket3.setFila(1);
        ticket3.setAsiento(2);
        ticket3.setPrecio(2000);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //agrego elementos a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //suma de preciosos
        double suma = 0;
        
        for (Ticket tick : listaTickets) {
            suma += tick.getPrecio();
        }
        System.out.println("El precio total de los ticket es " + suma);
        
        //pedir fila al usuario
        System.out.println("\nIngrese un numero de fila: ");
        int fila = sc.nextInt();
        
        boolean bandera = false;
        
        for (Ticket tick : listaTickets) {
            if (tick.getFila() == fila) {
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        
        if (bandera == false) {
            System.out.println("No se encontraron datos en la fila");
            
        }
        
        //prueba de cliente
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setDui("12345678");
        cliente.setNombre("Elmer");
        cliente.setApellido("Brito");
        cliente.getListaTickets().add(ticket3);
        
        Ticket ticket4 = new Ticket(13, 4, 6, 2000, new Date(), new Date());
        cliente.getListaTickets().add(ticket4);
    }
    
}
