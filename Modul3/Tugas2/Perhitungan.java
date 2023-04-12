package Modul3.Tugas2;
import Modul3.Tugas1.Balok;

//extract method dan inline temporary
public class Perhitungan {
    //modul 3
    /* int panjang = sisi.getPanjang();
    int lebar = sisi.getLebar();
    int tinggi = sisi.getTinggi();
    luas = 2*(panjang*lebar)+(panjang*tinggi)+(lebar*tinggi);

    int panjang = sisi.getPanjang();
    int lebar = sisi.getLebar();
    int tinggi = sisi.getTinggi();
    volume = panjang*lebar*tinggi; */
    
    //extract method
    public int volume(Balok sisi){
        /*int volume = panjang*lebar*tinggi;
        return volume;*/

        //inline temp
        return sisi.getPanjang()*sisi.getLebar()*sisi.getTinggi();
    }

    public int luas(Balok sisi){
        /*int luas = (2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi)));
        return luas;*/

        //inline temp
        return (2*((sisi.getPanjang()*sisi.getLebar())+(sisi.getPanjang()*sisi.getTinggi())+(sisi.getLebar()*sisi.getTinggi())));
    }
}