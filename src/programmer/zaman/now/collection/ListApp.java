package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> names = new LinkedList<>();

        names.add("Sony");
        names.add("Darmawan");

        System.out.println(names);

        names.set(0, "Sony Edit");
        names.remove(1);

        System.out.println(names);
        System.out.println(names.get(0));
    }
}
