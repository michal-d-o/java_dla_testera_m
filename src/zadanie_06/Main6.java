package zadanie_06;

public class Main6 {
    public static void main(String[] args) {

        Comp officeComp1 = new Pecet("Office comp 1", "HP", 500, 128, false);
        Comp officeComp2 = new Pecet("Office comp 2", "Dell", 500, 64, false);
        Comp gamesLaptop = new Lapek("Games Laptop", "Acer", 500, 64, 50);

        System.out.println("---");

        System.out.println("Comp volume up: " + officeComp1.volumeUp());
        System.out.println("Laptop volume up: " + gamesLaptop.volumeUp());

        System.out.println("----");

        System.out.println("Laptop volume down: " + gamesLaptop.volumeDown());
        System.out.println("Laptop volume up -50: " + gamesLaptop.volumeUp(-50));
        System.out.println("Laptop volume up 50: " + gamesLaptop.volumeUp(50));
        System.out.println("Laptop volume up 50: " + gamesLaptop.volumeUp(50));
        System.out.println("Laptop volume up 50: " + gamesLaptop.volumeUp(50));

        System.out.println("----");
        System.out.println("Laptop volume down 40: " + gamesLaptop.volumeDown(40));
        System.out.println("Laptop volume down 40: " + gamesLaptop.volumeDown(40));
        System.out.println("Laptop volume down 40: " + gamesLaptop.volumeDown(40));
        System.out.println("Laptop volume down 40: " + gamesLaptop.volumeDown(40));


    }
}
