package Modul3.Tugas4;
import java.util.Scanner;
import Modul3.Tugas1.Balok;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok();
        Scanner scan = new Scanner(System.in);

        System.out.println("\n~~~~~~~~~ BALOK ~~~~~~~~~");
        System.out.print("Masukkan panjang : ");
        balok.setPanjang(scan.nextInt());

        System.out.print("Masukkan tinggi\t : ");
        balok.setTinggi(scan.nextInt());

        System.out.print("Masukkan lebar\t : ");
        balok.setLebar(scan.nextInt());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        balok.hasil();
        scan.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
