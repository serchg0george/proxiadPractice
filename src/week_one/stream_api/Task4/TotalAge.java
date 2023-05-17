package week_one.stream_api.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TotalAge {


    public static void main(String[] args) {
        new TotalAge().calculateTotalAge();
    }

    public void calculateTotalAge() {
        List<String> personData = new ArrayList<>();
        personData.add("Anna:25");
        personData.add("Ivan:30");
        personData.add("George:20");

        List<Person> people = personData.stream()
                .map(data -> {
                    String[] parts = data.trim().split(":");
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        int age = Integer.parseInt(parts[1].trim());
                        return new Person(name, age);
                    }
                    return null;
                })
                .filter(person -> person != null)
                .collect(Collectors.toList());
        int totalAge = people.stream()
                        .mapToInt(Person::getAge)
                        .sum();

        System.out.println("Total age is: " + totalAge);
    }

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
