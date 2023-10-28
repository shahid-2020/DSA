package pattern;

import java.util.Scanner;

public class PatternF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            int odd = (i * 2) - 1;
            for (int k = 1; k <= odd; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
