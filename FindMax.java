public class FindMax {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; 
        }
        return Math.max(arr[n-1], findMax(arr, n-1));  
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int maxValue = findMax(arr, n);
        System.out.println("Nilai terbesar dalam array adalah " + maxValue);
    }
}
