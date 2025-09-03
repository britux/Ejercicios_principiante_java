import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero para saber si es primo:");
        int numeroPrimo = sc.nextInt();
        boolean esPrimo = true;
        
        if (numeroPrimo <= 1) {
            esPrimo = false;
            
        } else {
            for (int i = 2; i < numeroPrimo; i++) {
                if (numeroPrimo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo == true) {
            System.out.println("El numero es primo!"); 
        } else {
            System.out.println("El numero no es Primo");
        }
        
    }
}
