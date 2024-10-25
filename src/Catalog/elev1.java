package Catalog;

import java.util.Scanner;

public class elev1 {
    public static void main(String[] args) {
        System.out.println("Numele meu este Cristina");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introdu media la Sport");

        int numar1 = userInput.nextInt();

        System.out.println("Introdu media la matematica");
        int numar2 = userInput.nextInt();

        System.out.println("Introdu media la Romana");
        int numar3 = userInput.nextInt();

        int adunare = numar1 + numar2 + numar3;
        System.out.println("Suma mediilor este:" + adunare);

        int medie = adunare / 3;
        System.out.println("Media este:" + medie);
        System.out.println(+medie > 5);

        if (medie < 5) {
            System.out.println("Corigent");
        } else {
            System.out.println("Promovat");
        }


    }
}
