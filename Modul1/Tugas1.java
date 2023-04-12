package Modul1;

public class Tugas1{
    public static void main(String[] args){
        int[]arr = new int[5];

        try{
            arr[5] = 25; //array dari 0
        }catch(Exception x){
            System.out.println("Error : " +x);
        }
    }
}