import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number of rows for the pattern
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        System.out.println("*");  // The first asterisk in the output

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }

        System.out.println("*");  // The last asterisk in the output
    }
}