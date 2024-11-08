public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue penuh, tidak bisa menambahkan elemen!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa melakukan dequeue!");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        System.out.println("Dequeued: " + element);
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return -1;
        }
        return queue[front];
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.displayQueue();

        queue.dequeue();
        queue.dequeue();

        queue.displayQueue();

        queue.enqueue(60);
        queue.displayQueue();

        System.out.println("Elemen di depan: " + queue.peek());
    }
}
