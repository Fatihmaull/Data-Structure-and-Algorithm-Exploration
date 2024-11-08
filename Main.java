// Kelas untuk node dari linked list
class Node {
    int data;
    Node next;

    // Konstruktor untuk node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// Kelas Queue menggunakan Linked List
class Queue {
    Node front, rear;

    // Konstruktor untuk inisialisasi queue kosong
    public Queue() {
        this.front = this.rear = null;
    }

    // Method untuk menambahkan data ke antrian (Enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // Jika queue kosong, front dan rear sama-sama mengarah ke node baru
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        // Tambahkan node baru di belakang (rear) dan pindahkan rear ke node baru
        this.rear.next = newNode;
        this.rear = newNode;
    }
    
    // Method untuk menghapus data dari antrian (Dequeue)
    public int dequeue() {
        // Jika queue kosong, tidak ada yang bisa dihapus
        if (this.front == null) {
            System.out.println("Queue kosong, tidak bisa melakukan dequeue.");
            return -1; // Indikator queue kosong
        }

        // Ambil data dari node paling depan (front)
        int data = this.front.data;

        // Pindahkan front ke node berikutnya
        this.front = this.front.next;

        // Jika front menjadi null, maka rear juga harus null (queue kosong)
        if (this.front == null) {
            this.rear = null;
        }

        return data;
    }

    // Method untuk menampilkan elemen-elemen di dalam queue
    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Queue kosong.");
            return;
        }

        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue setelah enqueue:");
        q.displayQueue(); // Output: 10 20 30

        q.dequeue();
        System.out.println("Queue setelah dequeue:");
        q.displayQueue(); // Output: 20 30
    }
}
