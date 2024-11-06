public class BubbleSort {
    public static void main(String[] args) {
        int[] angka = {13, 14, 10, 4, 18, 20, 25, 17};
System.out.println("Sebelum diurutkan:");
        for (int i : angka) {
            System.out.print(i + " ");  }
        System.out.println();
for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }}}
System.out.println("Setelah diurutkan (ascending):");
        for (int i : angka) {
            System.out.print(i + " ");
        }}}

