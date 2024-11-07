import java.util.Scanner;

public class FatihDoWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        scanner.close();
    }
}
