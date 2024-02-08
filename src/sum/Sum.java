package sum;
import java.util.Scanner;
import java.lang.*;
public class Sum {
    public void mySum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ Sum Operator ]");
        int x = 0;
        int y = 0;
        System.out.print("> Enter x: ");
        x = scanner.nextInt();
        System.out.print("> Enter y: ");
        y = scanner.nextInt();
        System.out.println(STR."Your result: \{x + y}");
    }
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.mySum();
    }
}
