public class zadanie_domowe_01 {
    public static void main(String[] args) {
        System.out.println("To jest zadanie domowe nr 01");
        int a = 8;
        int b = 4;
        int c = 2;
        int d = 1;

        int sumaAiB = a + b;
        int sumaCiD = c + d;

        System.out.println("Wersja 1:");

        int moduloAiB = sumaAiB % 2;
        System.out.println(moduloAiB);

        int moduloCiD = sumaCiD % 2;
        System.out.println(moduloCiD);

        if(moduloAiB == 0 && moduloCiD == 0) {
            System.out.println("Wszystkie liczby sa parzyste :)");
        } else {
            System.out.println("Przynajmniej jedna liczba jest nieparzysta!");
        }

        System.out.println("Wersja 2:");

        boolean parzysteAiB = sumaAiB % 2 == 0;
        System.out.println(parzysteAiB);
        boolean parzysteCiD = sumaCiD % 2 == 0;
        System.out.println(parzysteCiD);

        if(parzysteAiB && parzysteCiD) {
            System.out.println("Wszystkie liczby sa parzyste :)");
        } else {
            System.out.println("Przynajmniej jedna liczba jest nieparzysta!");
        }
    }
}
