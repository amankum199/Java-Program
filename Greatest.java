import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b)
        System.out.print(a + "is greatest ");
        else 
        System.out.print(b + "is greatest ");

        
    }
}
