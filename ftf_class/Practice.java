package ftf_class;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//class Student {
//
//}

public class Practice {
    public static void main() {
        Scanner input = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.##");

        int number = readNumber(input, "Enter a number: ");
        StringBuilder expression = new StringBuilder();

        displayFactorial(number, expression, numberFormat);
    }
    private static int readNumber(Scanner input, String question){
        while (true) {
            System.out.print(question);
            try {
                int value = input.nextInt();
                if (value >= 0) return value;

                System.out.println("Please enter a positive number");
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                input.nextLine();
            }
        }
    }
    private static void displayFactorial(int number, StringBuilder expression, DecimalFormat numberFormat) {
        double factorial = 1;

        for (int count = 1; count <= number; count++){
            factorial *= count;

            if (count < number) {
                expression.append(count).append(" * ");
            }

        }
        expression.append(" = ").append(numberFormat.format(factorial));
        System.out.println(expression);
        System.out.printf("Factorial of " + number + " is " + numberFormat.format(factorial));

    }
}
