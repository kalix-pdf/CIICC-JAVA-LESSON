package Activity_17;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int count = 1;

        StringBuilder mathExpression = new StringBuilder();
        while (count <= number) {
            mathExpression.append(count);
            if (count < number) mathExpression.append(" + ");
            sum += count;
            count++;
        }
        mathExpression.append(" = ").append(sum);
        System.out.println("\nThe sum from 1 to " + number + " is: " + sum);
        System.out.println(mathExpression);
    }
}
