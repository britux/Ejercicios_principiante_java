package barradecarga;
import java.util.Scanner;

/**
 *
 * @author brito
 */
public class Operador_Ternario {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double promedio;
        String condicion;
        
        System.out.print("Ingresa el promedio: ");
        promedio = sc.nextDouble();
        
        condicion = promedio >= 6 ? "Aprovado" : "Reprobado";
        System.out.println(condicion);
    }
}
