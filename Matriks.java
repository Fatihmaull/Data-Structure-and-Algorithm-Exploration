import java.util.Scanner;

class Matriks {
    int[][] matriks;
    public Matriks(int baris, int kolom) {
        matriks = new int[baris][kolom];
    }

    public void inputMatriks(Scanner sc) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }
    }

    public void tampilMatriks() {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }

    public static Matriks jumlahMatriks(Matriks a, Matriks b) {
        Matriks hasil = new Matriks(2, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil.matriks[i][j] = a.matriks[i][j] + b.matriks[i][j];
            }
        }
        return hasil;
    }

    public static Matriks kaliMatriks(Matriks a, Matriks b) {
        Matriks hasil = new Matriks(2, 3); 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                hasil.matriks[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasil.matriks[i][j] += a.matriks[i][k] * b.matriks[k][j];
                }
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriks matriks1 = new Matriks(2, 2);
        System.out.println("Input Matriks 2x2 Pertama:");
        matriks1.inputMatriks(sc);

        Matriks matriks2 = new Matriks(2, 2);
        System.out.println("Input Matriks 2x2 Kedua:");
        matriks2.inputMatriks(sc);

        System.out.println("Hasil Penjumlahan Matriks 2x2:");
        Matriks hasilJumlah = Matriks.jumlahMatriks(matriks1, matriks2);
        hasilJumlah.tampilMatriks();

        Matriks matriks3 = new Matriks(2, 3);
        System.out.println("Input Matriks 2x3 Ketiga:");
        matriks3.inputMatriks(sc);

        System.out.println("Hasil Perkalian Matriks 2x2 dengan 2x3:");
        Matriks hasilKali = Matriks.kaliMatriks(matriks1, matriks3);
        hasilKali.tampilMatriks();

        sc.close();
    }
}
