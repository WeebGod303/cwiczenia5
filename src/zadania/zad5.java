package zadania;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj slowo do spr: ");
        String slowojs = scan.nextLine().toUpperCase();
        boolean Palijs = false;
        for (int ijs = 0; ijs < slowojs.length()/2; ijs++){
            if (slowojs.charAt(ijs) == slowojs.charAt(slowojs.length() - ijs -1)){
                Palijs = true;
                break;
            }
        }
        if (Palijs == true)
        {System.out.println("Słowo: " + slowojs + " jest palindromem");}
        else
        {System.out.println("Słowo: " + slowojs + " nie jest plaindromem");}
    }
}
