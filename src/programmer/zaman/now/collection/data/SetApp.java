package programmer.zaman.now.collection.data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Sony");
        names.add("Darmawan");
        names.add("Darmawan");
        names.add("Sony");
        names.add("Budi");
        names.add("Jono");
        names.add("Budi");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
