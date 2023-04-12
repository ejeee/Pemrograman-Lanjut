package Modul6;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

/*@author  
 * Marchanda Balqis
 * NIM 202110370311503
 */

 /*Tugas 1
  * membuat 2 array inNumber & inString
  * inputan String, value masuk inString
  * inputan angka, value masuk inNumber
  * buat stopper scan & menampilkan data yang diinput
  * pake exception buat antisipasi error
  * simpan hasil inputan dalam database, file tidak hilang
  */

  /*Tugas 2
   * buat dokumentasi dengan aturan javadoc
   */

public class Pstyle {
   Scanner sc = new Scanner(System.in);
   private int size;

   public int getSize() {
       return size;
   }
   public void setSize(int size) {
       this.size = size;
   }

   /*menghilangkan null
    * null: tipe data yang berdiri sendiri
    * variable hampa: null
    * null masih termasuk dalam string variabel
   */
   String[] removeNull(String[] inNumber){
       int nulll=0;
       for(int i=0;i<inNumber.length; i++) {
           if(inNumber[i] == null) {
               nulll++;
           }
       }

       String[] nullRemove = new String[inNumber.length-nulll];

       for(int i=0, j=0; i<inNumber.length; i++) {
           if(inNumber[i] != null){
               nullRemove[j]=inNumber[i];
               j++;
           }
       }
       return nullRemove;
   }
   /*Menu*/
    void Menu(){
       System.out.println("\n~~~~~~~~~~ Dipilih-pilih ~~~~~~~~~~");
       System.out.println("1. Menambah Data");
       System.out.println("2. Menampilkan Data");
       System.out.println("3. Exit");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.print("Mau ngapain? ");
       int pilih = sc.nextInt();
       switch(pilih) {
           case 1:
               MenambahData();
               break;
           case 2:
               MenampilkanData();
               break;
           case 3:
               System.exit(0);
               break;
           default:
               System.out.println("Pilihanmu gaada!");
               break;
       }
   }

   /*menambah data*/
   void MenambahData() {
       boolean loop = true;
      /*exception try catch */
       try {
           System.out.print("Data Size: ");
           this.setSize(sc.nextInt());
           String isiData[] = new String[getSize()];
           String scNumber[] = new String[getSize()];
           String scString[] = new String[getSize()];

           /*inputan data pada array*/
           System.out.print("Masukkan data: ");
           for(int i=0;i<getSize();i++) {
               isiData[i] = sc.next();
           }

           for(int i=0; i<isiData.length; i++) {
               if(isiData[i].matches("[0-9]+")) {
                   scNumber[i] = isiData[i];
               }else {
                   scString[i] = isiData[i];
               }
           }

           try {
               /*membuat file txt*/
               FileWriter fw = new FileWriter("DataInput.txt", true);
               BufferedWriter bw = new BufferedWriter(fw);

               /*menulis data kedalam file txt*/
               bw.newLine();
               bw.write("\nAngka: ");
               for(int i=0; i<removeNull(scNumber).length; i++) {
                   bw.write(removeNull(scNumber)[i]+" ");
               }
               bw.newLine();
               bw.write("Huruf: ");
               for(int i=0; i<removeNull(scString).length; i++) {
                   bw.write(removeNull(scString)[i]+" ");
               }
               bw.close();
           }catch (IOException e) {
               e.printStackTrace();
           }

           /*menghilangkan null*/
           System.out.println(Arrays.toString(removeNull(scNumber)));
           System.out.println(Arrays.toString(removeNull(scString)));

           System.out.print("Lanjut ga (n/y)? ");
           String pilihan = sc.next();
           Pstyle p = new Pstyle();
           if(pilihan.equalsIgnoreCase("y")) {
               p.MenambahData();
           }

       }catch (Exception e) {
           System.out.println("Inputan salah!");
       }finally {
           Pstyle p = new Pstyle();
           p.Menu();
       }
   }

   /*Menampilkan data*/
   void MenampilkanData() {
       try {
           FileReader fr = new FileReader("DataInput.txt");
           BufferedReader br = new BufferedReader(fr);
           String line;
           while((line = br.readLine()) != null) {
               System.out.println(line);
           }
           br.close();
       }catch (IOException e) {
           e.printStackTrace();
       }finally {
           Pstyle p = new Pstyle();
           p.Menu();
       }
   }
}