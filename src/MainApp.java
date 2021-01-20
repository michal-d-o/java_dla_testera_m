import zadanie_03.Issue;

public class MainApp {
    public static void main(String[] args) {
        Issue bug01 = new Issue("User is able to log in with incorrect password", "tester@project.com", 5);

        bug01.setBugDescription("123456789");
        System.out.println("Bug description: " + bug01.getBugDescription());

        System.out.println("---");

        bug01.setEmail("tester--email.pl");
        System.out.println(bug01.getEmail());
        System.out.println("---");

        bug01.setBugPriority(-1);
        System.out.println(bug01.getBugPriority());

    }
}
