package Modul2;
import java.util.Scanner;

public class DataMhs {
    Scanner input = new Scanner(System.in);
    private String kode = "10370311";
    private String mail = "@webmail.umm.ac.id";
    private String email;
    private String nama;
    private String noTelp;
    private String nim;
    boolean cek = true;

    public String getKode() {
        return this.kode;
    }
    public String getMail() {
        return this.mail;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return this.nim;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void daftarNama() {
        do {
            System.out.print("Enter Name: ");
            this.setNama(input.nextLine());
            String angka = "[\\p{Digit} && [1234567890]]+";
            if(this.getNama().matches(angka)) {
                System.out.println("Don't use number!");
                cek = true;
            }else if(this.getNama().isEmpty()){
                System.out.println("Diisi yaaa~");
                cek = true;
            }else {
                cek = false;
            }
        }while(cek);
    }

    public void daftarNim(){
        do {
            try {
                System.out.print("Enter NIM: ");
                this.setNim(input.nextLine());
                if(this.getNim().contains(kode)) {
                    if(this.getNim().length() == 15) {
                        cek = false;
                    }else {
                        cek = true;
                        throw new Exception("Gaboleh leibh dari 15 angka!\n");
                    }

                }else {
                    System.out.println("Kodenya ngga sesuai");
                    System.out.println("Enter NIM lagi ya!\n");
                    cek = true;
                }
            }catch(Exception e) {
                System.out.println("Ada salah disini:" +e);

            }

        }while(cek);
    }

    public void daftarEmail() {
        do {
            try {
                System.out.print("Enter Email: ");
                this.setEmail(input.nextLine());
                if(this.getEmail().endsWith(this.getMail())) {
                    if(this.getEmail().length() <=18){
                        System.out.println("Input lebih dari 18 karakter!");
                        cek = true;
                    }else {
                        cek = false;
                    }

                }else {
                    cek = true;
                    throw new Exception ("Harus pake @webmail.umm.ac.id");
                }
            }catch(Exception e) {
                System.out.println(e);
            }
        }while(cek);
    }

    public void daftarNoTelp() {
        do {
            System.out.print("Masukkan No Telepon:");
            this.setNoTelp(input.nextLine());
            String angka = "[\\p{Digit} && [1234567890]]+";
            if(this.getNoTelp().matches(angka)) {
                if(this.getNoTelp().length() != 12) {
                    System.out.println("Harus 12 angka!");
                    cek = true;
                }else {
                    cek = false;
                }

            }else if(this.getNoTelp().isEmpty()){
                System.out.println("Diisi yaa~");
                cek = true;
            }else {
                cek = true;
                System.out.println("Nomer telepon harus pake nomer ya!");
            }
        }while(cek);
    }
}