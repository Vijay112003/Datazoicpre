import java.util.Arrays;
import java.util.Scanner;
class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        boolean isAnagram = true;
        if(str1.length() != str2.length()){
            isAnagram = false;
        }else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isAnagram = Arrays.equals(arr1, arr2);
        }
        if(isAnagram){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}