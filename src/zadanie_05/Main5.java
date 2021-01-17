package zadanie_05;

public class Main5 {
    public static void main(String[] args) {

        Laptop gamingLaptop = new Laptop("XGames", "HP Games", new HDD("HP", 500), new RAM("HP", 128), 50);

        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn();
        System.out.println("Is On? " + gamingLaptop.getState());

        System.out.println("--- PC");

        PC officeComputer = new PC("Office computer", "HP", new HDD("Dell", 1000), new RAM("Dell", 256), false);

        officeComputer.switchOn();
        System.out.println("Is PC on? " + officeComputer.getState());
        System.out.println("--- ");
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println("Is PC on? " + officeComputer.getState());

    }
}
