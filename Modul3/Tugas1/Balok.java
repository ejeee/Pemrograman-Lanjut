package Modul3.Tugas1;
import Modul3.Tugas2.Perhitungan;

//Tugas 1 set get dan method
public class Balok {
    private int panjang, tinggi, lebar;


    public int getPanjang() {
        return panjang;
    }


    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }


    public int getTinggi() {
        return tinggi;
    }


    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }


    public int getLebar() {
        return lebar;
    }


    public void setLebar(int lebar) {
        this.lebar = lebar;
    }


    //method
    public void hasil(){
        Perhitungan hitung = new Perhitungan();
        System.out.println("Hasil volume balok : " +hitung.volume(this));
        System.out.println("Hasil luas balok   : " +hitung.luas(this));
    }
}