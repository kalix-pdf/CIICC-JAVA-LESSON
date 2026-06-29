import java.util.Scanner;

public class UserIntroduction {

    private static final byte MIN_AGE = 0;
    private static final byte MAX_AGE = 127;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name = validatteAndAcceptStringInput(userInput, "What is your name? ");
        byte age = readValidAge(userInput, "What is your age? ");
        String hobby = validatteAndAcceptStringInput(userInput, "What is your hobby? ");

        printIntroduction(name, age, hobby);
    }
    
    //methods po for accepptting and validating user input for string type
    private static String validatteAndAcceptStringInput(Scanner userInput, String question) {
        String input;

        do {
            System.out.print(question);
            input = userInput.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("This field cannot be empty, paki-ulit!");
            }

        } while (input.isEmpty());

        return input;
    }

    //same methods but for byte type (for age)
    private static byte readValidAge(Scanner userInput, String question) {
        while (true) {
            System.out.print(question);
            String input = userInput.nextLine().trim();
            try {
                byte age = Byte.parseByte(input);
                if (age >= MIN_AGE && age <= MAX_AGE) {
                    return age;
                }
                System.out.println("Please enter a realistic age");
            } catch (NumberFormatException e) {
                System.out.println("That doesn't look like a valid number, paki-ulit!");
            }
        }
    }

    private static void printIntroduction(String name, int age, String hobby) {
        System.out.println();
        System.out.println("Nice to meet you: " + name + "!");
        System.out.println("You are " + age + " years old and love " + hobby + ".");
    }
}