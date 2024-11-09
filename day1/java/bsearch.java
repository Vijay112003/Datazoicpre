import java.util.Scanner;

class BArrays{
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
class Binary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        int result = BArrays.binarySearch(array, key);
        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}