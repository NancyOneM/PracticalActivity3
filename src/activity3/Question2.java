package activity3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Black");

       // System.out.println(colours);
        Collections.sort(colours);
        System.out.println(colours);

    }
}
