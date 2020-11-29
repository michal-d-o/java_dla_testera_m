public class Bug {

    String description;
    String email;
    int priority;
    boolean statusOpen;

    Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.statusOpen = true;
    }

    void showBugInfo() {
        System.out.println("Bug: " + description + ", " + email + ", " + priority + ", Bug status 'open'- " + statusOpen);
    }

    void showEmail() {
        System.out.println("Reporter's email: " + email);
    }

    void showStatus() {
        System.out.println("Is status 'open'? - " + statusOpen);
    }

    int getPriority() {
        return priority;
    }

}
