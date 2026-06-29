import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit = readValidNumber(input, "Enter temperature in Fahrenheit: ");

        double convertedFahrenheit = convertFahrenheitToTemp(fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C%n", convertedFahrenheit);
    }
    private static double readValidNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("\nEnter a Valid Number!");
                input.next();
            }
        }
    }
    private static double convertFahrenheitToTemp(double fahrenheit) {
        return (fahrenheit-32) * 5 / 9;
    }
}
