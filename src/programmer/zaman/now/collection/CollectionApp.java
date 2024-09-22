package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Sony");
        collection.add("Darmawan");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for( var collect : collection ) {
            System.out.println(collect);
        }

        System.out.println("Remove Collection");
        collection.remove("Sony");
        collection.removeAll(List.of("Zaman", "Now"));

        for( var collect : collection ) {
            System.out.println(collect);
        }

        System.out.println(collection.contains("Darmawan"));
        System.out.println(collection.contains("Programmer"));
        System.out.println(collection.contains("Sony"));

        System.out.println(collection.size());
    }
}
