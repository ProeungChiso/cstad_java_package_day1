package sum;
import java.util.Scanner;
public class Sum {
    private final Scanner scanner;
    public Sum(){
        scanner = new Scanner(System.in);
    }
    public int mySum(int x, int y){
        return x + y;
    }
    public void mySum(){
        System.out.println(" [Sum Calculate] ");
        System.out.print("> Enter x: ");
        int x;
        try{
            x = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input for x. Please enter an integer value.");
            scanner.next();
            mySum();
            return;
        }
        System.out.print("> Enter y: ");
        int y;
        try{
            y = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input for y. Please enter an integer value.");
            scanner.next();
            mySum();
            return;
        }
        int result = mySum(x,y);
        System.out.println("> Result: "+ result);
    }
}