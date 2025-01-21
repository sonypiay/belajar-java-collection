package programmer.zaman.now.collection.data;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("satu");

        Set<String> mutable = new HashSet<>();
        mutable.add("Sony");
        mutable.add("Darmawan");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
        Set<String> set = Set.of("Sony", "Darmawan");

//        set.remove("Sony");
    }
}
