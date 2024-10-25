package Catalog;

import java.util.Scanner;

public class elev5 {
    public static void main(String[] args) {
        System.out.println("Numele meu este Mirta");
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introdu media la Sport");

        int numar1 = userinput.nextInt();

        System.out.println("Introdu media la matematica");
        int numar2 = userinput.nextInt();

        System.out.println("Introdu media la Romana");
        int numar3 = userinput.nextInt();

        int adunare = numar1 + numar2 + numar3;
        System.out.println("Suma mediilor este:" + adunare);

        int medie = adunare /  3;
        System.out.println("Media este:" +medie);
        System.out.println(+medie > 5);
    }
}
