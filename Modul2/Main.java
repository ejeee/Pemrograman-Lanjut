package Modul2;

public class Main {
        public static void main(String[] args) throws Exception {
            DataMhs Data = new DataMhs();

            Data.daftarNama();
            Data.daftarNim();
            Data.daftarEmail();
            Data.daftarNoTelp();
            System.out.println("***********************************");
            System.out.println("Nama       : " + Data.getNama());
            System.out.println("NIM        : " + Data.getNim());
            System.out.println("Email      : " + Data.getEmail());
            System.out.println("No Telepon : " + Data.getNoTelp());
        }
}
