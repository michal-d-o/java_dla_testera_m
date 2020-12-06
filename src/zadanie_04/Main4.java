package zadanie_04;

public class Main4 {
    public static void main(String[] args) {

        //1 - Change the order of elements

        int[] digits = {1, 2, 3, 4, 5};
        System.out.println("---Original order of elements: ");
        for (int digit : digits) {
            System.out.println(digit);
        }

        System.out.println("---");
        digits[digits.length - 1] = digits[digits.length - 1] + digits[0];

        digits[0] = digits[digits.length - 1] - digits[0];
        digits[digits.length - 1] = digits[digits.length - 1] - digits[0];
        System.out.println("--- Changed order of elements: ");
        for (int digit : digits) {
            System.out.println(digit);
        }
        System.out.println("---");

        // 2 Even numbers and odd numbers

        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int even = 0;
        int odd = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) {
                even +=1;
            } else {
                odd +=1;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("---");
        System.out.println("---");

        /// 3 Sort the elements within the array
        // 3A - Sort ASC

        int[] numbers = {5, 1, 2, 4, 7, 2, 8, 6, 7};
        System.out.println("--- Not sorted: ");
        for (int number : numbers) {
            System.out.println(number);
        }
        // 1, 2, 2, 4, 5, 6, 7, 7, 8
        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        System.out.println("--- Sorted ASC: ");
        for (int element : numbers) {
            System.out.println(element);
        }

        System.out.println("---");
        System.out.println("---");
        System.out.println("---");

/// 3 B - Sort DESC
        int[] elements = {5, 1, 2, 4, 7, 2, 8, 6, 7};
        System.out.println("--- Not sorted: ");
        for (int element : elements) {
            System.out.println(element);
        }
        // 8, 7, 7, 6, 5, 4, 2, 2, 1
        System.out.println("---");
        int max;
        for (int i = 0; i < elements.length; i++) {
            max = elements[i];
            for (int j = i + 1; j < elements.length; j++) {
                if(elements[j] > max) {
                    max = elements[j];
                    elements[j] = elements[i];
                    elements[i] = max;
                }
            }
        }
        System.out.println("--- Sorted DESC: ");
        for (int element : elements) {
            System.out.println(element);
        }

    }
}