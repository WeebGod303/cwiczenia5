package zadania;


import java.util.Scanner;

public class zad4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String lan1js, lan2js, wyn1js, wyn2js;

        System.out.printf("Podaj pierwszy łancuch: ");
        lan1js = scan.nextLine();
        System.out.printf("Podaj drufi łańcuch: ");
        lan2js = scan.nextLine();

        System.out.println("Wynik łączenia łańcuch1 + łancuch2: " + lan1js.concat(lan1js));
        System.out.println("Wynik łączenia łańcuch2 + łancuch1: " + lan2js.concat(lan1js));
    }
}
