package Activity_16;

import java.util.Scanner;

public class WhileDescendingPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

