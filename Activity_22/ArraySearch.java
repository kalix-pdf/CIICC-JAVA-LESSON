package Activity_22;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, 12, 7, 9, 23, 18};
        boolean found = false;

        System.out.print("Enter number to search: ");
        int searchNumber = input.nextInt();

        for (int index = 0; index < numbers.length; index++) {
            if (searchNumber == numbers[index]) {
                found = true;
                System.out.println("Number " + searchNumber + " found at index " + index);
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + searchNumber + " not found in the array");
        }
    }
}
