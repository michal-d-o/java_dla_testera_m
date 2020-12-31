package zadanie_07;

public class Main7 {
    public static void main(String[] args) {

        BugReporter mike = new BugReporter("Michal", "Testowy", "michal@test.pl");
        Bug bug001 = new Bug("This is a minor bug with UI", 1, mike);

        System.out.println(bug001);
        bug001.setStatusOpen(true);
        System.out.println(mike);

        System.out.println("---");

        bug001.showBugInfo();

    }
}
