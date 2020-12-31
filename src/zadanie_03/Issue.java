package zadanie_03;

public class Issue {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean statusOpen;

    public Issue(String description, String email, int priority) {
        this.bugDescription = description;
        this.email = email;
        this.bugPriority = priority;
        this.statusOpen = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() > 9) {
            this.bugDescription = bugDescription;
        } else {
            System.out.println("Error - bug description must contain at least 10 characters.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error - email address should contain the @ sign.");
        }

    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority < 6 && bugPriority > 0) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Error - bug priority has to be a single digit between 1 and 5.");
        }
    }

    public boolean isStatusOpen() {
        return statusOpen;
    }

    public void setStatusOpen(boolean statusOpen) {
        this.statusOpen = statusOpen;
    }


    //
    public void showBugInfo() {
        System.out.println("zadanie_07.Bug: " + bugDescription + ", " + email + ", " + bugPriority + ", zadanie_07.Bug status 'open'- " + statusOpen);
    }

    public void showEmail() {
        System.out.println("Reporter's email: " + email);
    }

    public void showStatus() {
        System.out.println("Is status 'open'? - " + statusOpen);
    }


}
