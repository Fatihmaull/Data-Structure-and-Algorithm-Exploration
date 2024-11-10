import java.util.Scanner;

public class HitungSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai alas: ");
        int var_alas = input.nextInt();
        System.out.print("Masukkan nilai tinggi: ");
        int var_tinggi = input.nextInt();
        //Muhammad Fatih Maulana 1237050140
        double rumus_luas;
        rumus_luas = (var_alas * var_tinggi) / 2.0;
        System.out.println("Luas Segitiga: " + rumus_luas);
    }
}
