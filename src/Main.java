
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Inserisci un numero");

            int numero = scan.nextInt();

            if ( numero >= 0) {
                System.out.println("Numero positivo");
            }else {
                System.out.println("Numero negativo");
            }
    }
}

