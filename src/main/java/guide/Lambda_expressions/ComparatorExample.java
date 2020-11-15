package guide.Lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        //java 7
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        //java 8
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        //shorter
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        //shorter
        names.sort((a, b) -> b.compareTo(a));
    }
}
