public class MainApp {
    public static void main(String[] args) {
        Bug bug01 = new Bug("User can to log in with incorrect password", "tester@project.com", 5);

        System.out.println("---");
        bug01.showBugInfo();
        bug01.showEmail();
        bug01.showStatus();
        int bugPriority = bug01.getPriority();
        System.out.println(bugPriority);

        System.out.println("---");
        bug01.statusOpen = false;
        bug01.showBugInfo();

        System.out.println("---");
    }
}
