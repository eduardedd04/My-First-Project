package Catalog;

import java.util.Scanner;

public class elev4 {
    public static void main(String[] args) {
        System.out.println("Numele meu este Mihai");
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introdu media la Geografie");

        int numar1 = userinput.nextInt();

        System.out.println("Introdu media la Romana");
        int numar2 = userinput.nextInt();

        System.out.println("Introdu media la Matematica");
        int numar3 = userinput.nextInt();

        int adunare = numar1 + numar2 + numar3;
        System.out.println("Suma mediilor este:" + adunare);

        int medie = adunare / 3;
        System.out.println("Media este:" + medie);
        System.out.println(+medie > 5);
    }
}
