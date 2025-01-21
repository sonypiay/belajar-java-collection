package programmer.zaman.now.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Sony", "Darmawan", "Budi", "Joko"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> budi = names.tailSet("Darmawan", true);

//        for (var name : names) {
//            System.out.println(name);
//        }

        for (var name : namesReverse) {
            System.out.println(name);
        }
    }
}
