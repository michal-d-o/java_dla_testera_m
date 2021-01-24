package enums;

public enum Genders {

    MALE("male"),
    FEMALE("female");

    private String label;


    Genders(String label) {
        this.label = label;
    }

    public String getGender() {
        return label;
    }

}
