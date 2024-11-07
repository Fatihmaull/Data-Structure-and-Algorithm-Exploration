import java.util.Scanner;

class Array3Dimensi {
    private int[][][] array;
    private int x, y, z;
    
    public Array3Dimensi(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        array = new int[x][y][z];
    }

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan elemen array 3 dimensi berukuran " + x + "x" + y + "x" + z + ":");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print("Masukkan elemen pada (" + i + "," + j + "," + k + "): ");
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }
    }

    public void tampilArray() {
        System.out.println("Array 3 Dimensi:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }
    }

    public void cariElemen(int nilai) {
        boolean ditemukan = false;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (array[i][j][k] == nilai) {
                        System.out.println("Elemen " + nilai + " ditemukan pada indeks (" + i + "," + j + "," + k + ")");
                        ditemukan = true;
                        return;
                    }
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Elemen " + nilai + " tidak ditemukan di dalam array.");
        }
    }
}

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran dimensi pertama (x): ");
        int x = scanner.nextInt();
        System.out.print("Masukkan ukuran dimensi kedua (y): ");
        int y = scanner.nextInt();
        System.out.print("Masukkan ukuran dimensi ketiga (z): ");
        int z = scanner.nextInt();

        Array3Dimensi array3d = new Array3Dimensi(x, y, z);
        array3d.inputArray();
        array3d.tampilArray();

        System.out.print("\nMasukkan elemen yang ingin dicari: ");
        int nilai = scanner.nextInt();
        array3d.cariElemen(nilai);
    }
}
