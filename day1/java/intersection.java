import java.util.Scanner;
class Intersection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: "); 
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }
        for(int i = 0; i < k; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}