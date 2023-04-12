package Modul1;

import java.util.Scanner;

public class Tugas2{

    public static void main(String[] args) {
        String nim, code = "10370311";
        try (Scanner input = new Scanner(System.in)) {
            while(true){

                try{

                    System.out.print("\nEnter NIM : ");
                    nim = input.nextLine();
            
                    if (nim.length() > 15){
                        throw new Exception("NIM tidak boleh lebih dari 15 angka!!"); 

                    } else if (nim.length() < 15) {
                        throw new Exception("NIM tidak boleh kurang dari 15 angka!!"); 

                    } else if (!nim.contains(code)){ 
                        throw new Exception("kode NIM adalah '10370311'");

                    }

                    System.out.println("Buetooool"); 

                } catch (Exception x) {
                    System.out.println(x); 
                    continue;
                } 
                break;
            }
        }
    }   
}