package Catalog;

import java.util.Scanner;

public class elev3 {
    public static void main(String[] args) {
        System.out.println("Numele meu este Lavinia");
        Scanner userinput = new Scanner(System.in);
        System.out.println("Introdu media la Franceza");

        int num1 = userinput.nextInt();

        System.out.println("Introdu media la Religie");
        int num2 = userinput.nextInt();

        System.out.println("Introdu media la Informatica");
        int num3 = userinput.nextInt();

        int adunare = num1 + num2 + num3;
        System.out.println("Suma mediilor este:" + adunare);

        int medie = adunare / 3;
        System.out.println("Media este:" + medie);
        System.out.println(+medie > 5);
    }
}
