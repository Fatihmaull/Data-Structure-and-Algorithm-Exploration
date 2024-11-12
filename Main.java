import java.util.LinkedList;
import java.util.Scanner;

class LLbarang {
    private LinkedList<String> stack;

    public LLbarang() {
        stack = new LinkedList<>();
    }

    public void push(String barang) {
        stack.push(barang);
        System.out.println(barang + " berhasil ditambahkan ke dalam stack.");
    }

    public String pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return "Stack kosong, tidak ada barang yang dihapus.";
        }
    }

    public String peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return "Stack kosong, tidak ada barang yang dilihat.";
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Barang di dalam stack: " + stack);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LLbarang stackBarang = new LLbarang();
        Scanner scanner = new Scanner(System.in);
        String input;
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan barang");
            System.out.println("2. Hapus barang teratas");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Tampilkan semua barang");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    input = scanner.nextLine();
                    stackBarang.push(input);
                    break;
                case 2:
                    System.out.println("Barang yang dihapus: " + stackBarang.pop());
                    break;
                case 3:
                    System.out.println("Barang teratas: " + stackBarang.peek());
                    break;
                case 4:
                    stackBarang.display();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
