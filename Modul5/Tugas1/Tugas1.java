package Modul5.Tugas1;
import java.util.Scanner;

public class Tugas1{

    static class Shorting {
    //buble short method
    public void shortingBuble(int[] arr) {
        for(int i=0; i<arr.length;i++) { //baris
            for(int j=0; j<arr.length-1;j++) { //kolom
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void display(int[] arr) {

        int i = 0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        } while (i<arr.length);
    }

    static class Searching {
        public void searchArr(int[] arr, int a){
            int i=0;
            int found;
            do {
                if(a == arr[i]) {
                    found = i;
                }else {
                    found = -1;
                }
                i++;
            }while(found == -1 && i <arr.length-1);
    
            if(found >= 0) {
                System.out.println("Index Number-"+found);
            }else {
                System.out.println("Wrong Number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shorting bubleShort = new Shorting();
        Searching search = new Searching();
            int a;
            int[] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
            System.out.print("Before Shorting: ");
            bubleShort.display(arr);
            System.out.print("\nAfter Shorting: ");
            bubleShort.shortingBuble(arr);
            bubleShort.display(arr);
    
            System.out.print("\n\nSearch Number: ");
            a = sc.nextInt();
            search.searchArr(arr, a);
            sc.close();
         }
    }
}