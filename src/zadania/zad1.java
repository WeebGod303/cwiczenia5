package zadania;

public class zad1 {
    public static void main(String[] args){
        int [] samplejs  = new int [10];
        int ijs;

        for (ijs = 0; ijs < samplejs.length; ijs++){
            samplejs[ijs] = 9 - ijs;
        }
        for(ijs = 0; ijs < 10; ijs++){
            System.out.println("Element sample[" + ijs +"]: "+ samplejs[ijs]);
        }
    }
}
