package Activity_19;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = readNumber(input, "Enter a number: ");

        System.out.println(calculateFactorial(number));
    }
    private static int readNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            int value = input.nextInt();
            if (value > 0) return value;

            System.out.println("Please Enter a Positive Number!");
        }
    }
    private static String calculateFactorial(int number) {
        int factorial = 1;
        StringBuilder process = new StringBuilder();

        for (int count = 1; count <= number; count++) {
            factorial *= count;
            process.append(count);
            if (count < number) process.append(" + ");
        }
        process.append(" = ").append(factorial);
        return process.toString();
    }
}
