import java.util.Arrays;
class Third {
    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array, 10);
        for (int i : array) {
            System.out.println(i);
        }
    }
}