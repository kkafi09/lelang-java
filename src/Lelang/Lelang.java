package Lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Lelang {

	private ArrayList<Integer> idPenawar = new ArrayList<>();
	private ArrayList<Integer> idBarang = new ArrayList<>();
	private ArrayList<Integer> hargaTawar = new ArrayList<>();
	private ArrayList<String> temp = new ArrayList<>();
	boolean exitLelang = true;
	boolean exitProsesLelang = true;

	int max = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void prosesLelang(Barang barang, Petugas petugas, Masyarakat masyarakat, int idx) {
		do {
			this.idBarang.add(idx);
			
			// Check apakah barang yang di lelang ada atau tidak
			barang.checkBarang();
			
			System.out.print("Masukkan id Petugas : ");
			int indexPetugas = scanner.nextInt();
			System.out.println("Data Petugas : ");
			System.out.println("Nama Petugas : " + petugas.getNama(indexPetugas));
			System.out.println("Alamat Petugas : " + petugas.getAlamat(indexPetugas));
			System.out.println("Telepon Petugas : " + petugas.getTelepon(indexPetugas));
			
			System.out.println("Data barang yang akan di lelang ");
			System.out.println("Id barang : " + barang.getId(idx));
			System.out.println("Nama barang : " + barang.getNamaBarang(idx));
			System.out.println("Harga Awal : " + barang.getHargaAwal(idx));
			System.out.println("Status : " + barang.getStatus(idx));
			System.out.println();
			
			while(exitProsesLelang) {
				if(barang.getStatus(idx) == false) {
					System.out.println("Barang tidak bisa di lelang !");
					break;
				}
				
				System.out.println("Lelang di mulai");
				System.out.print("Masukkan id Penawar : ");
				int idxPenawar = scanner.nextInt();
				System.out.print(masyarakat.getNama(idxPenawar) + " Silahkan masukkan penawaran : ");
				int hargaTawar = scanner.nextInt();
				
				if(max < hargaTawar) {
					max = hargaTawar;
					setId(idxPenawar);
					setHarga(hargaTawar);
				} else {
					System.out.println("Harga tidak valid / harga kurang dari harga awal");
				}
				System.out.print("Apakah anda ingin menawar lebih (true / false) : ");
				exitLelang = scanner.nextBoolean();
				
				if(!exitLelang) {
					barang.editStatus(idx, false);
					
					System.out.println("Barang berhasil di lelang");
					System.out.println("Id barang : " + barang.getId(idx));
					System.out.println("Nama barang : " + barang.getNamaBarang(idx));
					System.out.println("Harga Awal : " + barang.getHargaAwal(idx));
					System.out.println("Di dapatkan oleh : " + masyarakat.getNama(idxPenawar));
					System.out.println("Dengan harga : " + hargaTawar);
				}
			}
			System.out.print("Apakah anda ingin melanjutkan lelang ? (true/false) ");
			exitLelang = scanner.nextBoolean();
		} while(!exitLelang);
	}
	
	public void setId(int id) {
		this.idPenawar.add(id);
	}
	
	public void setHarga(int harga) {
		this.hargaTawar.add(harga);
	}
}
