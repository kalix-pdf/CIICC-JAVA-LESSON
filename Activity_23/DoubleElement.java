package Activity_23;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int[] doubledNumber = new int[numbers.length];

        System.out.println("Enter 3 numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) {
            doubledNumber[index] = numbers[index] * 2;
        }

        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Output: " + Arrays.toString(doubledNumber));

        ///seeeesssssssh napakaangas
    }
}
