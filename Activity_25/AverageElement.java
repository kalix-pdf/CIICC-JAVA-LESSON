package Activity_25;

import java.util.Arrays;

public class AverageElement {
    public static void main(String[] args) {
        int[] numbers = {5, 5, 5, 5, 5};

        int sum = Arrays.stream(numbers).sum();
        int average = sum / numbers.length;

        System.out.println("Average (using array stream): " + average);

        int Sum = 0;
        for (int index = 0; index < numbers.length; index++){
            Sum += numbers[index];
        }

        int Average = Sum / numbers.length;
        System.out.println("Average (using for loop): " + Average);
    }
}
