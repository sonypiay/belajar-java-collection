package programmer.zaman.now.collection.data;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Sony");

        person.setHobbies("Game");
        person.setHobbies("Badminton");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan hobby");
    }
}
