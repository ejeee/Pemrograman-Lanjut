package Modul5.Tugas3;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    static int input;
    static float Positive;
    static float Negative;
    static float Zero;
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Size: ");
        input = c.nextInt();
        int [] datas = new int[input];

        System.out.print("Input Data: ");
        for (int i = 0 ; i < datas.length; i++){
            datas[i] = c.nextInt();
        }

        Arrays.sort(datas);
        System.out.println();
        System.out.print("Result: \n");
        for(int i = 0 ; i < datas.length ; i++){
            System.out.print(datas[i] + " ");
        }

        for(int i = 0 ; i < datas.length ; i++){
            if (datas[i] > 0){
                Positive++;
            }else if (datas[i] < 0) {
                Negative++;
            }else{
                Zero++;
            }
        }

        System.out.printf("\n\nPositive : %1.2f", Positive / datas.length);
        System.out.printf("\nNegative : %1.2f", Negative / datas.length);
        System.out.printf("\nZero     : %1.2f", Zero / datas.length);

    }
}