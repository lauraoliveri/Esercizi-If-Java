import java.util.Scanner;

public class Esercizio5 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti soldi hai sul tuo conto?");

        int saldo = scan.nextInt();

        if ( saldo >50) {
            System.out.println("Sei ricco!!");
        }else {
            System.out.println("Sei povero...");
        }
    }
}
