public class MainAppBlocker01 {
    /// tu dodam kod z którym mam problemy
    public static void main(String[] args) {
        UserBlocker01 bartek = new UserBlocker01();

        UserBlocker01 bartek1 = new UserBlocker01("Bartek1", "Nazwisko", "bartek1@nazwisko.pl", 29, true);

        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@email.pl";
        bartek.age = 17;
        bartek.isAdult = false;
        bartek.getFullName();
        bartek.getUserInfo();
        System.out.println(bartek.getUserAge());
        int bartekAge = bartek.getUserAge();
        System.out.println(bartekAge);

        boolean isBartekAdult = bartek.isUserAdult();
        System.out.println("Czy Bartek jest dorosły: " + isBartekAdult);

        bartek.greetings("Bartek");
        bartek.yourAge("Bartek", 17);
        int bartekIn10years = bartek.yourAgePlus10(17);
        System.out.println("This will be your age in 10 years:");
        System.out.println(bartekIn10years);
        // lub bez dodatkowej zmiennej
        System.out.println(bartek.yourAgePlus10(bartek.age));
        bartek.greetings("Bartek", "Testowy");


        System.out.println("---");
        UserBlocker01 tomek = new UserBlocker01();
        tomek.firstName = "Tomasz";
        tomek.lastName = "Kowalski";
        tomek.email = "tomek@email.pl";
        tomek.age = 25;
        tomek.isAdult = true;
        tomek.getFullName();
        tomek.getUserInfo();

    }

}
