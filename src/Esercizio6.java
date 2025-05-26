import java.util.Scanner;

public class Esercizio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");

        int primonumero = scan.nextInt();

        System.out.println("Inserisci il secondo numero");

        int secondonumero = scan.nextInt();

        if ( primonumero == secondonumero) {
            System.out.println("I numeri inseriti sono uguali");
        }else {
            System.out.println("I numeri inseriti sono diversi");
        }

    }
}
