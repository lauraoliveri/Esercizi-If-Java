import java.util.Scanner;

public class Esercizio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");

        int primonumero = scan.nextInt();

        System.out.println("Inserisci il secondo numero");

        int secondonumero = scan.nextInt();

        if ( primonumero > secondonumero) {
            System.out.println("Il numero più grande è " + primonumero);
        }else {
            System.out.println("Il numero più grande è 2" + secondonumero);
        }

    }
}
