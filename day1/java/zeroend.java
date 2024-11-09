
import java.util.*;

class Zeroarray {

    private final int n;
    private final int[] arr;

    Zeroarray(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    boolean iszero() {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    void pushend() {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < n) {
            arr[j++] = 0;
        }
    }

    void display() {
        System.out.println("Array after pushing zeros to the end: " + Arrays.toString(arr));
    }
}

class Zeroend {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Zeroarray obj = new Zeroarray(n, arr);
        if (obj.iszero()) {
            obj.pushend();
            obj.display();
        } else {
            System.out.println("The given array doesn't contains any zero");
        }
    }
}
