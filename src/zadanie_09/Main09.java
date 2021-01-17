package zadanie_09;
import zadanie_05.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main09 {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("Lapek Pro 1", "PRO 1", new HDD("HP", 500), new RAM("HP", 128), 100));
        computers.add(new Laptop("Lapek Pro 2", "PRO 2", new HDD("HP", 500), new RAM("HP", 128), 100));
        computers.add(new Laptop("Lapek Pro 3", "PRO 3", new HDD("HP", 256), new RAM("HP", 64), 100));
        computers.add(new Laptop("Lapek Pro 4", "PRO 4", new HDD("HP", 128), new RAM("HP", 128), 100));
        computers.add(new PC("PC 1", "Home 1", new HDD("Dell", 1000), new RAM("Dell", 500), false));
        computers.add(new PC("PC 2", "Home 2", new HDD("Dell", 256), new RAM("Dell", 128), false));
        computers.add(new PC("PC 3", "HomeOffice 1", new HDD("HP", 500), new RAM("HP", 256), false));

        // 1.Zliczyć wszystkie komputery które mają więcej niż 128 GB Ramu
        long count = computers.stream()
                .filter(s -> s.getRam().getSize() > 128)
                .count();
        System.out.println("Number of computers with Ram > 128: " + count);

        //2. Wyświetlić na konsolę wszystkie typy komputerów - używając .map
        System.out.println("Types of computers: ");
        List<String> types = computers.stream()
                .map(Computer::getType)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        for (String type : types) {
            System.out.println(type);
        }
        // shorter version :
        System.out.println("--- Version using only .map and .forEach (+sorting) ");
        computers.stream()
                .map(Computer::getType)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        //3. Wyświetlić komp który ma najwięcej Ramu
        System.out.println("Computer with the max Ram:  ");
        Computer biggestRam = computers.stream()
                .max(Comparator.comparingInt(c -> c.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Cannot find such a computer"));
        System.out.println(biggestRam.getName());

        //4. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 GB
        System.out.println("Computers with disc < 500 GB ");
        List<Computer> smallDiscs = computers.stream()
                .filter(c -> c.getDisc().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer comp : smallDiscs) {
            System.out.println(comp.getName() + ", Disc size:  " + comp.getDisc().getSize());
        }

        //5. Posortować komputery po nazwie i typie
        System.out.println("Sorted by name and then by type:");
        List<Computer> sortedComps = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer comp : sortedComps) {
            System.out.println(comp.getName() + ". " + comp.getType());
        }

        // Optional 06:
        System.out.println("Optional - Computers with disc > 500 GB ");
        List<Computer> bigDiscs = computers.stream()
                .filter(b -> b.getDisc().getSize() > 500)
                .collect(Collectors.toList());
        if (bigDiscs.isEmpty()) {
            System.out.println("No such elements found");
        } else {
            for (Computer comp : smallDiscs) {
                System.out.println(comp.getName() + ", Disc size:  " + comp.getDisc().getSize());
            }
        }

        // Optional 07
        System.out.println("Ist there any name = Laptop");
        String nameLaptop = computers.stream()
                .map(Computer::getName)
                .filter(s -> s.equals("Laptop"))
                .findFirst()
                .orElse("Laptop - no such names found");
        System.out.println(nameLaptop);


    }
}
