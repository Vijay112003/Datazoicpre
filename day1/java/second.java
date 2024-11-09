import java.util.Arrays;
class Second {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int key = 7;
        int result = Arrays.binarySearch(array, key);

        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}