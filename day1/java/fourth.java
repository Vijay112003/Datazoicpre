import java.util.Arrays;
class Fourth {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = java.util.Arrays.copyOf(originalArray, 3);

        for (int i : copiedArray) {
            System.out.print(i + " ");
        }
    }
}