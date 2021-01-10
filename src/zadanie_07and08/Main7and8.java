package zadanie_07and08;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main7and8 {
    public static void main(String[] args) {

        BugReporter michal = new BugReporter("Michal", "Testowy", "michal@test.pl");
        Bug bug001 = new Bug("This is a minor bug with UI", 1, michal);

        System.out.println(bug001);
        bug001.setStatusOpen(true);
        System.out.println(michal);

        System.out.println("---");

        bug001.showBugInfo();

        System.out.println("--- Zadanie 08 ---");
        // Zadanie 08

        BugReporter mike = new BugReporter("Michal", "Testowy", "michal@test.pl");
        BugReporter tom = new BugReporter("Tom", "QA", "tom@test.pl");

        Set<Bug> bugs = new LinkedHashSet<>();

        bugs.add(new Bug("The form does not save a copy", 3, tom));
        bugs.add(new Bug("Just a minor bug with UI on Privacy Policy page", 1, mike));
        bugs.add(new Bug("User is able to log in using incorrect credentials", 5, tom));
        bugs.add(new Bug("A UI issues with buttons on homepage", 2, mike));
        bugs.add(new Bug("Just a minor bug with UI on Privacy Policy page", 1, mike));

        for (Bug bug : bugs) {
            System.out.println(bug.getBugDescription() + " - " + bug.getBugPriority());
        }

        System.out.println("-- Sorted using bug description field: ");
        Set<Bug> sortedBugs = new TreeSet<>(bugs);


        System.out.println("--- Sorted using showBugAndBugReporter method: ");
        for (Bug bug : sortedBugs) {
            bug.showBugAndBugReporter();
        }


    }
}