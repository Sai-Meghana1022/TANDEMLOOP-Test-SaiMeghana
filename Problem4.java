// Problem-4.java
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers separated by space:");
        String[] inputStr = scanner.nextLine().split(" ");
        int[] input = new int[inputStr.length];

        for (int i = 0; i < inputStr.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }

        System.out.println(countMap);
    }
}
