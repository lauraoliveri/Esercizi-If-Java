import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci ula tua età:");

        int eta = scan.nextInt();

        if ( eta >= 18) {
            System.out.println("Sei maggiorenne!");
        }else {
            System.out.println("Sei minorenne!");
        }
    }
}
