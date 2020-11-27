public class UserBlocker01 {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 02 METODY które może robić obiekt

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getUserInfo() {
        System.out.println(firstName + " " + lastName + ", " + email + ", " + age + ", " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // metoda z parametrem (-ami)
    void greetings(String name) {
        System.out.println("Hi " + name + ", nice to see you!");
    }

    void yourAge(String name, int userAge) {
        System.out.println("Hi " + name + ", this is your age: " + userAge);
    }

    // przeciążanie metody czyli używanie metody o tej samej nazwie ale koniecznie z róznymi parametrami (typami)
    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ", nice to see you!");
    }

    // metoda z parametrem która zwraca przetworzony parametr
    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    // 03 KONSTRUKTOR - element który tworzy nowe obiekty
    // Java domyślnie tworzy konstruktor dla każdej klasy - ma on taką sama nazwę jak klasa; ale możemy go zastąpić:
    // NazwaMetody() {} --czyli nazwa taka jak klasa, bez typu danych i nazwa tak jak klasa wielka litera
    //Konstruktory ogą być p[rzeciążane - ta sama nazwa ale inne parametry (typy i liczba parametrów)

    User(String firstNameParam, String lastNameParam, String emailParam, int ageParam, boolean isAdultParam) {
        System.out.println(firstNameParam + " " + lastNameParam + " " + emailParam + " " + ageParam + " " + isAdultParam);

    }


}
