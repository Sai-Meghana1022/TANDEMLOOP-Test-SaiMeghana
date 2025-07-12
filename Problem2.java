// Problem-2.java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
