import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu Operasi Queue ===");
            System.out.println("1. Tambah Elemen");
            System.out.println("2. Hapus Elemen");
            System.out.println("3. Tampilkan Elemen Terdepan");
            System.out.println("4. Tampilkan Semua Elemen");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan elemen yang ingin ditambahkan: ");
                    String elementToAdd = scanner.nextLine();
                    queue.offer(elementToAdd);
                    System.out.println("Elemen '" + elementToAdd + "' telah ditambahkan.");
                    break;

                case 2:
                    String removedElement = queue.poll();
                    if (removedElement != null) {
                        System.out.println("Elemen yang dihapus dari queue: " + removedElement);
                    } else {
                        System.out.println("Queue kosong, tidak ada elemen yang dapat dihapus.");
                    }
                    break;

                case 3:
                    String peekElement = queue.peek();
                    if (peekElement != null) {
                        System.out.println("Elemen terdepan di queue: " + peekElement);
                    } else {
                        System.out.println("Queue kosong.");
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue kosong.");
                    } else {
                        System.out.println("Elemen dalam queue: " + queue);
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);

        scanner.close();
    }
}