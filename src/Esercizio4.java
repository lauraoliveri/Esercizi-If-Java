import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if ( numero <= 100) {
            System.out.println("Il numero che hai inserito è minore di 100 o uguale a 100!");
        }else {
            System.out.println("l numero che hai inserito è maggiore di 100");
        }
    }

}
