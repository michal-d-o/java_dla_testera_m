package zadanie_07and08;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    protected String bugDescription;
    protected int bugPriority;
    protected boolean statusOpen;
    protected BugReporter tester;

    public Bug(String description, int priority, BugReporter tester) {
        this.bugDescription = description;
        this.bugPriority = priority;
        this.tester = tester;
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
        notifyStatusChange();
        this.statusOpen = statusOpen;
    }


    //
    public void showBugInfo() {
        System.out.println("Bug: " + bugDescription + ", " + bugPriority + ", Bug status 'open'- " + statusOpen + ", " + tester);
    }


    public void showStatus() {
        System.out.println("Is status 'open'? - " + statusOpen);
    }

    public void showBugAndBugReporter() {
        System.out.println("Bug: " + bugDescription + ", " + bugPriority + ", Bug status 'open'- "
                + statusOpen + ", " + "Bug reporter: " + tester.firstName + " " + tester.lastName
                + ", " + tester.email);
    }


    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status changed!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", statusOpen=" + statusOpen +
                ", bugReporter=" + tester +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority &&
                statusOpen == bug.statusOpen &&
                Objects.equals(bugDescription, bug.bugDescription) &&
                Objects.equals(tester, bug.tester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugPriority, statusOpen, tester);
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getBugDescription().compareTo(bug.getBugDescription());
        return compareResult;
    }
}
