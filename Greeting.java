import java.util.Scanner;

public class Greeting {
//    Take name as input and print a greeting message for that particular name
public static void main(String[] args) {
    System.out.print("Enter message:" );
    Scanner input = new Scanner(System.in);
    String msg = input.nextLine();
    System.out.print(msg);
}
}
