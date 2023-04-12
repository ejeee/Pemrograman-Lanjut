package Modul5.Tugas2;
import java.util.Arrays;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("Before Shorting: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Shorting: "+ Arrays.toString(arr));

        System.out.print("Search Number: ");
        int a = sc.nextInt();
        System.out.println("Number "+ a + " for index-"+ Arrays.binarySearch(arr, a));
        sc.close();
    }

}