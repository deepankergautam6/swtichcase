import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for add, enter 2 for sub , enter 3 for mul, enter 4 for Division: ");
        int num3 = input.nextInt();
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int result;
        switch (num3){
            case 1: result =num1+num2;
                System.out.println("result: " + result);
                break;
            case 2: result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case 3: result = num1*num2;
                System.out.println("result: " + result);
                break;
            case 4: result = num1/num2;
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("Please choice correct number!");
        }
    }
}