import java.util.Scanner;

public class RateOfInterest {
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Principal, time, rate ");
    int principal = input.nextInt();
    int time = input.nextInt();
    int rate = input.nextInt();
    int simpleInterest =(principal* time * rate )/100;
    System.out.println("Simple Interest = " + simpleInterest);
}
}
