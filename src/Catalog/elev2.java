package Catalog;

import java.util.Scanner;

public class elev2 {
    public static void main(String[] args) {
        System.out.println("Numele meu este Eduard");
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introdu media la Fizica");

        int num1 = userinput.nextInt();

        System.out.println("Introdu media la Biologie");
        int num2 = userinput.nextInt();

        System.out.println("Introdu media la Engleza");
        int num3 = userinput.nextInt();

        int adunare = num1 + num2 + num3;
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
