package Activity_15;

import java.util.Scanner;

public class WhileLoopCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 1;
        while (count <= number) {
            System.out.println(count);
            count++;
        }
    }
}
