package Modul4.Tugas3;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int hari, bulan, tahun, convert;
            
            System.out.print("\nJumlah hari : ");
            convert = scanner.nextInt();
            
            /*% adalah operator modulus
            operator modulus untuk hasil perkalian yang masih sisa*/
            tahun   = convert/365;
            bulan   = (convert%365)/30;
            hari    = (convert%365)%30;
            
            System.out.print(""+convert+" Hari = ");
            System.out.print(+tahun+" Tahun "+bulan+" Bulan "+hari+" Hari");
            System.out.println("\n");
        }
    }
}
