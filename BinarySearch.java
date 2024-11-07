public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; 
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;  // Target ditemukan
        } else if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);  
        } else {
            return binarySearch(arr, mid + 1, high, target);  
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Elemen ditemukan di indeks " + result);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}
