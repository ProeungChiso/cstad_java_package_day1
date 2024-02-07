package sum;
import java.util.Scanner;
public class Sum {
    public void mySum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ Sum Operator ]");
        int x;
        int y;
        System.out.print("> Enter x: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("> Enter y: ");
        y = Integer.parseInt(scanner.nextLine());
        System.out.println(STR."Your result: \{x + y}");
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.mySum();
    }
}
