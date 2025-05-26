import java.util.Scanner;

public class Esercizio3 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual è la temperatura in questo momento?");

        int temperatura = scan.nextInt();

        if ( temperatura >= 30) {
            System.out.println("Wow! La temperatura è superiore a 30 gradi. Che caldo!");
        }else {
            System.out.println("La temperatura è minore di 30 gradi, si sta bene.");
        }
    }

}

