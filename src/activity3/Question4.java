package activity3;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {

        ArrayList<String[]> Products = new ArrayList<>();

        String[] ShopA = {"12.45", "100.23", "96.99", "245.50"};
        String[] ShopB = {"11.39", "100.80", "94.78", "247.00"};
        Products.add(ShopA);
        Products.add(ShopB);

        for (String[] Prices : Products) {
            System.out.println(Arrays.toString(Prices) +  Arrays.stream(ShopA).count() + Arrays.stream(ShopB).count());
       // ShopA.equals(Prices);
       // System.out.println(ShopA.(Prices));
        }
    }
}