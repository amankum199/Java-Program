import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter Operation: ");
        int num = input.nextInt();
        int num3;
       if (num==1)
       {
           num3 = num1 + num2;
           System.out.println("Addition = "+num3);
       } else if (num==2)
       {
        num3 = num1 - num2;
        System.out.println("Subtraction = "+ num3);
       }
       else if (num==3)
       {
           num3=num1*num2;
           System.out.println("multiplication = "+num3);
       }
       else if (num==4)
       {
           num3=num1/num2;
           System.out.println("Division = " +num3);
       }
       else
       {
           System.out.println("Invalid Input ");
       }

    }
}
