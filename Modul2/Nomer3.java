package Modul2;

import java.util.Scanner;

public class Nomer3 {
    private int ip;
	private int gaji = 350468;
	boolean cek = false;

	public void setIp(int ip) {
		this.ip = ip;
	}

	public int getIp() {
		return this.ip;
	}

	public int getGaji() {
		return this.gaji;
	}

	void cekIp(int bonus) {
		try {
			if (ip >= 10) {
				float totGaji = bonus + this.getGaji();
				System.out.println("mendapatkan bonus " + bonus + " Gaji Anda " + totGaji);
				cek = true;
			} else if (ip >= 1 || ip <= 9) {
				System.out.println("ip harus diatas 9 untuk mendapat bonus");
			} else if (ip < 1 || ip > 10) {
				System.out.println("pilih range ip 1-10");
				cek = false;
			} else {
				cek = false;
				throw new Exception("INPUTAN TIDAK BOLEH ANGKA");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Nomer3 n3 = new Nomer3();
		Scanner sc = new Scanner(System.in);
		int totalJamKerja1;
		int bonus;
		do {
			try {
				System.out.println("Bonus Gaji");
				System.out.print("Jam Kerja(jam/minggu): ");
				totalJamKerja1 = sc.nextInt();
				if (totalJamKerja1 > 40) {
					System.out.print("Masukkan Indeks Prestasi Kerja[1-10]: ");
					n3.setIp(sc.nextInt());
					bonus = 2 * n3.getGaji();
					n3.cekIp(bonus);
				} else if (totalJamKerja1 >= 35 || totalJamKerja1 <= 40) {
					System.out.print("Masukkan Indeks Prestasi Kerja[1-10]: ");
					n3.setIp(sc.nextInt());
					bonus = (15 / 10) * n3.getGaji();
					n3.cekIp(bonus);
					n3.cek = true;
				} else if (totalJamKerja1 < 35) {
					System.out.println("tidak ada di dalam daftar tambahan bonus");
					n3.cek = false;
				} else {
					n3.cek = false;
					throw new Exception("Inputan harus angka dan tidak boleh kosong");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (n3.cek);

		sc.close();
	}
}
