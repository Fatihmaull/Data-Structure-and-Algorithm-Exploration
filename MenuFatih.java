import java.util.*;

public class MenuFatih {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Program ===");
            System.out.println("1. Contoh Collections dan Linked List");
            System.out.println("2. Contoh Hash dan Binary Search Tree");
            System.out.println("3. Contoh Graph");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    contohCollectionsDanLinkedList();
                    break;
                case 2:
                    contohHashDanBST();
                    break;
                case 3:
                    contohGraph();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
    //method array list
    public static void contohCollectionsDanLinkedList() {
        List<String> list = new ArrayList<>();
        list.add("Data 1");
        list.add("Data 2");
        list.add("Data 3");

        System.out.println("Contoh Collections (ArrayList): " + list);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("Contoh Linked List: " + linkedList);
    }

    public static void contohHashDanBST() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Satu", 1);
        hashMap.put("Dua", 2);
        hashMap.put("Tiga", 3);

        System.out.println("Contoh HashMap: " + hashMap);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(70);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("Contoh Binary Search Tree (TreeSet): " + treeSet);
    }

    //method buat graf
    public static void contohGraph() {
        //graph adjcacency
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4, 5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList(6));
        graph.put(6, Arrays.asList());

        System.out.println("Contoh Graph (Adjacency List):");
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.println("Node " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
