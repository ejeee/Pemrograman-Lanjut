package Modul2;

import java.util.Scanner;
public class Tugas2 {

    //void cekName(char name), cekFrom(char from), cekDate(int date), list();
        String name;
        String from;
        int date;
        String book[][] = {
                {"this is Book, Malang. 2022"}
        };
        String place[][] = {
                {"Malang"},
                {"Bandung"},
                {"Surabaya"}
        };
        void cekName(String name) { //perbandingan
            for(int i=0; i< book.length; i++) {
                if(name.compareTo(book[i][0]) == 0) {
                    this.name = name;
                }
            }
        }
        void cekFrom(String from) {
            for(int i=0; i< place.length; i++) {
                if(from.compareTo(place[i][0]) == 0) {
                    this.from = from;
                }
            }
        }
        void cekDate(int date) {
            if(date < 2018 || date > 2022) {
                this.date = date; //diluar ini akan error
            }
        }

        void list() {
            for(int i=0; i<book.length; i++) {
                System.out.println(book[i][0]);
            }
        }

        public static void main(String[] args) {
            Tugas2 M = new Tugas2();
            Scanner input = new Scanner(System.in);
            String inName, inFrom;
            int inDate;

            System.out.println("Welcome to Library");
            System.out.print("Nama Buku: ");
            inName = input.nextLine();
            M.cekName(inName);

            System.out.print("From : ");
            inFrom = input.nextLine();
            M.cekFrom(inFrom);

            System.out.print("Date : ");
            inDate = input.nextInt();
            M.cekDate(inDate);

            System.out.println("Nama: "+M.name+", Date: "+M.date+", Asal: "+M.from);
            //M.list();
            M.book[0][0] = new String(M.name);
            System.out.println("Buku" + M.book+ "berhasil ditambahkan");

            M.list();
            input.close();
        }
    }