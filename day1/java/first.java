import java.util.Arrays;
class First {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}