import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
Double P,T,R,Interest;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the principal: ");
        P= input.nextDouble();
        System.out.println("Enter the time: ");
        T= input.nextDouble();
        System.out.println("Enter the rate: ");
        R= input.nextDouble();
        Interest=P*T*R;
        System.out.println("The interest is: " + Interest);


        }
    }
