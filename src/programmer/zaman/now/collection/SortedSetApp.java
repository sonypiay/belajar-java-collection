package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Sony"));
        people.add(new Person("Darmawan"));
        people.add(new Person("Budi"));

        for (var person : people) {
            System.out.println(person.getName());
        }
    }
}
