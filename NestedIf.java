import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: ");
        double uang = input.nextDouble();
        System.out.print("Masukkan harga barang: ");
        double barang = input.nextDouble();

        if (uang >= barang) {
            if (uang > barang * 6)
                System.out.println("Anda Bisa Membeli 6 barang lebih");
            else if (uang >= barang * 5)
                System.out.println("Hanya Bisa Membeli 5 Barang Saja");
            else if (uang >= barang * 4)
                System.out.println("Hanya Bisa Membeli 4 Barang Saja");
            else if (uang >= barang * 3)
                System.out.println("Hanya Bisa Membeli 3 Barang Saja");
            else if (uang >= barang * 2)
                System.out.println("Hanya Bisa Membeli 2 Barang Saja");
            else if (uang >= barang)
                System.out.println("Hanya Bisa Membeli 1 Barang Saja");
        } else {
            System.out.println("Uang Anda tidak cukup");
        }
        System.out.println("Alhamdulillah");
    }
}
