package Activity_21;

import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int count = 0; count < numbers.length; count++) {
            System.out.print("index " + count + ": ");
            numbers[count] = input.nextInt();
        }

        System.out.println("You Entered: ");
        for (int number : numbers) {
            System.out.println(number);
        }
        input.close();
    }
}
