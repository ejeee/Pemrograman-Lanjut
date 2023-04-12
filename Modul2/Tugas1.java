package Modul2;
import java.util.Scanner;

public class Tugas1 {
 
    public static void main(String[] args) {
        String nmbrhp, a = "08";
        String nim, b = "10370311";
        String c = "@webmail.umm.ac.id";       
        try (Scanner input = new Scanner(System.in)) {
            while(true){

                System.out.print("\nEnter Your Name : ");
                input.nextLine();

                try{

                    System.out.print("\nEnter Your Number Phone : ");
                    nmbrhp = input.nextLine();
            
                    if (!nmbrhp.contains(a)){ 
                        throw new Exception("kode Nomer Hp Adalah '08'");

                    }

                } catch (Exception x) {
                    System.out.println(x); 
                    continue;
                } 
            
                try{

                    System.out.print("\nEnter NIM : ");
                    nim = input.nextLine();
            
                    if (nim.length() > 15){
                        throw new Exception("NIM tidak boleh lebih dari 15 angka!!"); 

                    } else if (nim.length() < 15) {
                        throw new Exception("NIM tidak boleh kurang dari 15 angka!!"); 

                    } else if (!nim.contains(b)){ 
                        throw new Exception("kode NIM adalah '10370311'");

                    }

                    System.out.println("Buetooool"); 

                } catch (Exception x) {
                    System.out.println(x); 
                    continue;
                } 

                try{

                    System.out.print("\nEnter Your Mail : ");
                    if (!nim.contains(c)){ 
                        throw new Exception("Gmail harus pakai '@webmail.umm.ac.id'");

                    }

                    System.out.println("Okay GMAIL sudah betul!"); 

                } catch (Exception x) {
                    System.out.println(x); 
                    continue;
                } 
                break;
            }
        }
    }   
}
