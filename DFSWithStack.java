import java.util.*;

public class DFSWithStack {
    // Fungsi untuk menjalankan DFS pada graf
    public void dfs(int[][] graph, int start) {
        // Stack untuk DFS
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length]; // Array visited

        // Push node awal ke stack
        stack.push(start);
        visited[start] = true;

        // Selama stack tidak kosong
        while (!stack.isEmpty()) {
            // Pop elemen teratas dari stack
            int node = stack.pop();
            System.out.print(node + " ");

            // Jelajahi semua tetangga dari node
            for (int neighbor = 0; neighbor < graph[node].length; neighbor++) {
                if (graph[node][neighbor] == 1 && !visited[neighbor]) { // Tetangga belum dikunjungi
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Contoh graf berbentuk matriks ketetanggaan
        int[][] graph = {
                { 0, 1, 1, 0, 0, 0, 0 }, // Node 0 terhubung ke 1, 2
                { 1, 0, 0, 1, 1, 0, 0 }, // Node 1 terhubung ke 0, 3, 4
                { 1, 0, 0, 0, 0, 1, 1 }, // Node 2 terhubung ke 0, 5, 6
                { 0, 1, 0, 0, 0, 0, 0 }, // Node 3 terhubung ke 1
                { 0, 1, 0, 0, 0, 0, 0 }, // Node 4 terhubung ke 1
                { 0, 0, 1, 0, 0, 0, 0 }, // Node 5 terhubung ke 2
                { 0, 0, 1, 0, 0, 0, 0 } // Node 6 terhubung ke 2
        };

        DFSWithStack dfs = new DFSWithStack();
        System.out.println("DFS traversal dimulai dari node 0:");
        dfs.dfs(graph, 0); // Panggil DFS dari node 0
    }
}
