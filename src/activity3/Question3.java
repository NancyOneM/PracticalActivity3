package activity3;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        ArrayList<Integer> PrimeNumbers = new ArrayList<Integer>(100);

        for (int i = 1; i <= 100; i++) {
            PrimeNumbers.add(i);
            System.out.print(PrimeNumbers.get(i - 1) + " ");
        }
        System.out.println();

     for(int j= 50; j<=70; j++)
         if ((j % 10) == 0) {
             //System.out.print();
             System.out.print(j + " ");
         }

    }
}








