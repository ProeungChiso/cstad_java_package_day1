package greeting;
import java.util.Scanner;
public class Greeting {
    public void myDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(STR."Hello, \{name}");
        scanner.close();
    }
}