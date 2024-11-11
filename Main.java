public class Main {
    public static void main(String[] args) {
    cetakAngka(1);
    }
    static void cetakAngka(int angka) {
    if (angka <= 10) {
    System.out.print(angka + " ");
   cetakAngka(++angka);
    }
    }
    }