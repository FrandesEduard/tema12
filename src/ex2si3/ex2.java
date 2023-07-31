package ex2si3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
//      ex2.1
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Laur", 23, "albastru"));
        personList.add(new Person("Carmen", 18, "blond"));
        personList.add(new Person("Alex", 33, "saten"));
        personList.add(new Person("Alexandra", 21, "blond"));

        List<String> personNames = new ArrayList<>();
        for (Person person : personList) {
            personNames.add(person.getName());
        }
        System.out.println(personNames);
//      ex2.2
        Map<String, Integer> nameToAge = new HashMap<>();
        for (Person person : personList) {
            nameToAge.put(person.getName(), person.getAge());
        }
        System.out.println(nameToAge);
//      ex2.3
        int givenAge = 20;
        List<Map.Entry> olderThan20 = new ArrayList<>();
        for (Map.Entry<String, Integer> curent : nameToAge.entrySet()) {
            if (curent.getValue() > givenAge) {
                olderThan20.add(curent);
            }
        }
        System.out.println("persoanele peste 20 de ani sunt : " + olderThan20);
//      ex2.4
        Map<String,List<String>> hairColorToName = new HashMap<>();
        for (Person person : personList) {
            String hairColor = person.getHairColour();
            String name = person.getName();
            hairColorToName.putIfAbsent(hairColor, new ArrayList<>());
            hairColorToName.get(hairColor).add(name);
        }
        System.out.println(hairColorToName);
//      ex2.5
        Map<Integer,List<Person>> ageToListPerson = new HashMap<>();
        for (Person person : personList) {
            ageToListPerson.putIfAbsent(person.getAge(),personList);
        }
        System.out.println(ageToListPerson);

    }
}
