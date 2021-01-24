package zadanie_10;

import enums.Genders;
import zadanie_07and08.Bug;
import zadanie_07and08.BugReporter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main_10 {
    public static void main(String[] args) {

        List<User> someUsers = new ArrayList<>();

        someUsers.add(new User("Maciej", "Test", "maciej@tets.pl", 55, Genders.MALE));
        someUsers.add(new User("Lucy", "Testy", "lucy@tets.pl", 44, Genders.FEMALE));
        someUsers.add(new User("Basia", "Testowa", "basia@tets.pl", 30, Genders.FEMALE));
        someUsers.add(new User("Bartek", "Testowy", "bartek@tets.pl", 33, Genders.MALE));
        someUsers.add(new User("Ala", "Testowa", "ala@tets.pl", 17, Genders.FEMALE));
        someUsers.add(new User("Romek", "Tester", "romek@tets.pl", 16, Genders.MALE));


        someUsers.stream()
                .filter(user -> user.getGender().equals(Genders.FEMALE))
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName))
                .forEach(System.out::println);


        System.out.println("---");

        List<String> namesinfile = new ArrayList<>();

        File file;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("testfile.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                namesinfile.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(namesinfile);

        // Un-comment to check the exception handling:
//        namesinfile.stream()
//                .filter(i -> i.endsWith("x"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Name not found!"));


        ///
        System.out.println("---");

        BugReporter nick = new BugReporter("Nick", "QA", "nick@test.pl");

        Bug bug01ex = new Bug("The form does not save a copy", 0, nick);
        // Un-comment to check the exception handling:
//        bug01ex.setBugPriority(99);


    }
}
