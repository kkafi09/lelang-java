package Lelang;

import java.util.ArrayList;

public class Petugas {
	private ArrayList<String> namaPetugas = new ArrayList<>();
	private ArrayList<String> alamat = new ArrayList<>();
	private ArrayList<String> telepon = new ArrayList<>();
	
	public Petugas() {
		addPetugas("Admin Kafi", "indonesia", "00888777");
	}
	
	public void addPetugas(String nama, String alamat, String telepon) {
		setNamaPetugas(nama);
		setAlamat(alamat);
		setTelepon(telepon);
	}
	
	public void setNamaPetugas(String nama) {
		this.namaPetugas.add(nama);
	}
	
	public void setAlamat(String alamat) {
		this.alamat.add(alamat);
	}
	
	public void setTelepon(String telepon) {
		this.telepon.add(telepon);
	}
	
	public String getNama(int id) {
		return this.namaPetugas.get(id);
	}
	
	public String getAlamat(int id) {
		return this.alamat.get(id);
	}
	
	public String getTelepon(int id) {
		return this.telepon.get(id);
	}
}
