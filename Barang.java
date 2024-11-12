import java.util.Scanner;

class Stack {
    private int maxSize;      
    private String[] stackArray;  
    private int top;          

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1; 
    }
    public void push(String item) {
        if (top == maxSize - 1) {
            System.out.println("Stack penuh, tidak dapat menambahkan barang.");
        } else {
            stackArray[++top] = item;
            System.out.println("Barang '" + item + "' berhasil ditambahkan.");
        }
    }
    public String pop() {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada barang yang bisa diambil.");
            return null;
        } else {
            System.out.println("Barang '" + stackArray[top] + "' berhasil diambil.");
            return stackArray[top--];
        }
    }
    public String peek() {
        if (top == -1) {
            System.out.println("Stack kosong.");
            return null;
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Isi stack saat ini:");
            for (int i = 0; i <= top; i++) {
                System.out.println((i + 1) + ". " + stackArray[i]);
            }
        }
    }
}

public class Barang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimum barang yang bisa disimpan dalam stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang ke Stack");
            System.out.println("2. Ambil Barang dari Stack");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Tampilkan Semua Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang yang ingin ditambahkan: ");
                    String barang = scanner.nextLine();
                    stack.push(barang);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    String topBarang = stack.peek();
                    if (topBarang != null) {
                        System.out.println("Barang teratas: " + topBarang);
                    }
                    break;
                case 4:
                    stack.displayStack();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
        scanner.close();
    }
}
