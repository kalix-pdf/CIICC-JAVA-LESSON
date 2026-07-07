package Activity_24;

import java.util.Scanner;

public class ArrayElementByIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        int number = readNumber(input, "Enter an index between (0-4): ", numbers);
        System.out.println("The value at index " + number + " is: " + numbers[number]);
    }
    //private methods pu to validate the input number oki
    private static int readNumber(Scanner input, String question, int[] numbers) {
        do {
            System.out.print(question);
            int value = input.nextInt();

            if (value < 0 || value >= numbers.length) {
                System.out.println("Invalid Index! Please enter between 0-4");
            } else {
                return value;
            }
        } while (true);
    }
}
