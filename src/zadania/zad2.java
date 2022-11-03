package zadania;

import java.util.Random;

public class zad2 {
    public static void main(String[] args){
        int [] samplejs  = new int [10];

        Random rnd = new Random();

        for (int ijs = 0; ijs < samplejs.length; ijs++) samplejs[ijs] = rnd.nextInt(99) + 1;{
            int minjs = Integer.MIN_VALUE;
            int maxjs = Integer.MAX_VALUE;
            String allValues = "";
            for (int ijs = 0; ijs < samplejs.length; ijs++) {
                if (samplejs[ijs] > minjs) minjs = samplejs[ijs];
                if (samplejs[ijs] < maxjs) maxjs = samplejs[ijs];
                allValues += samplejs[ijs] + ", ";
            }
            System.out.println("Values: " + allValues);
            System.out.println("Min= " + minjs);
            System.out.println("Max= " + maxjs);
        }

        }
    }
