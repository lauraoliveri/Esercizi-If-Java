import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la base di una figura geometrica");

        int base = scan.nextInt();

        System.out.println("Inserisci l'altezza di una figura geometrica");

        int altezza = scan.nextInt();

        System.out.println("Ok. Adesso Inserisci un numero");

        int numero = scan.nextInt();

        if ( numero == 0) {

            int area = base * altezza / 2;
            System.out.println("L'area della figura geometrica è" + area);
        }else {
            int area = base * altezza;
            System.out.println("L'area della figura geometrica è"+ area);

        }

    }
}
