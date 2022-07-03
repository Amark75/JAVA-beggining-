import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Integer num1 = input.nextInt();
        System.out.println("Enter second number: ");
        Integer num2 = input.nextInt();
        System.out.println("Enter operator: ");
        String operator = input.next();

        if (operator.equals("+"))
        {
            System.out.println(num1 + num2);
        }
        else if (operator.equals("-"))
        {
            System.out.println(num1 - num2);
        }
        else if (operator.equals("*"))
        {
            System.out.println(num1 * num2);
        }
        else if (operator.equals("/"))
        {
            System.out.println(num1 / num2);

        }
        else
        {
            System.out.println("Invalid operator");
        }

        
    }
}
