import java.util.Scanner;
public class UserInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write some stuff: ");
            String text = scanner.next();
            System.out.println("You said: " + text);
            System.out.print("Give me an integer: ");
            int number = scanner.nextInt();
            System.out.println(number + "^2 is " + (number * number));
    }
}