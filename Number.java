import java.util.Scanner;
class Number {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("inputkan n1, n2, n3: ");
        Double n1 = input.nextDouble();
        Double n2 = input.nextDouble();
        Double n3 = input.nextDouble();
        Double largestNumber;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }
        System.out.println("Largest number is " + largestNumber);
    }
}