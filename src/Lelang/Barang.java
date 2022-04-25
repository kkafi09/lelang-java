package Lelang;

import java.util.ArrayList;

public class Barang {
	private ArrayList<Integer> idBarang = new ArrayList<>();
	private ArrayList<String> namaBarang = new ArrayList<>();
	private ArrayList<Integer> hargaAwal = new ArrayList<>();
	private ArrayList<Boolean> status = new ArrayList<>();

	public Barang() {
		addBarang(0, 1000, "Barang default");
	}

	public void addBarang(int id, int harga, String namaBarang) {
		setId(id);
		setHarga(harga);
		setNamaBarang(namaBarang);
		setStatus(true);
	}

	public void checkBarang() {
		boolean temp = true;
		for (boolean check : status) {
			if (check == true) {
				temp = false;
			}
			if (temp) {
				System.out.println("Barang lelang tidak ada \nProgram akan berhenti");
				throw new Error();
			}
		}
	}

	public void setId(int id) {
		this.idBarang.add(id);
	}

	public void setHarga(int harga) {
		this.hargaAwal.add(harga);
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang.add(namaBarang);
	}

	public void setStatus(boolean status) {
		this.status.add(status);
	}

	public void editStatus(int id, boolean status) {
		this.status.set(id, status);
	}

	public int getId(int id) {
		return this.idBarang.get(id);
	}

	public int getHargaAwal(int id) {
		return this.hargaAwal.get(id);
	}

	public String getNamaBarang(int id) {
		return this.namaBarang.get(id);
	}

	public boolean getStatus(int id) {
		return this.status.get(id);
	}

	public int getTotalBarang() {
		return this.namaBarang.size();
	}
}
