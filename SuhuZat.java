import java.util.Scanner;

public class SuhuZat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: "); //input suhu celcius
        double suhu = input.nextDouble();

        if (suhu < 0) {
            System.out.println("Zat dalam keadaan padat.");
        } else if (suhu >= 0 && suhu <= 100) {
            System.out.println("Zat dalam keadaan cair.");
        } else {
            System.out.println("Zat dalam keadaan gas.");
        }

        input.close();
    }
}
