package Activity_20;

public class ArrayDisplay {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 44, 59};

        int countNumberGreaterThan30 = 0;
        for (int number : numbers) {
            System.out.println(number);
            if (number > 30) countNumberGreaterThan30++;
        }
        System.out.println("Numbers greater than 30: " + countNumberGreaterThan30);
    }
}
