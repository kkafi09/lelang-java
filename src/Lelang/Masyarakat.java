package Lelang;

import java.util.ArrayList; 

public class Masyarakat {
	private ArrayList<String> namaMasyarakat = new ArrayList<>();
	private ArrayList<String> alamat = new ArrayList<>();
	private ArrayList<String> telepon = new ArrayList<>();
	
	public Masyarakat() {
		addMasyarakat("kafi #1", "indonesia", "00888777");
	}
	
	public void addMasyarakat(String nama, String alamat, String telepon) {
		setNamaMasyarakat(nama);
		setAlamat(alamat);
		setTelepon(telepon);
	}
	
	public void setNamaMasyarakat(String nama) {
		this.namaMasyarakat.add(nama);
	}
	
	public void setAlamat(String alamat) {
		this.alamat.add(alamat);
	}
	
	public void setTelepon(String telepon) {
		this.telepon.add(telepon);
	}
	
	public String getNama(int id) {
		return this.namaMasyarakat.get(id);
	}
	
	public String getAlamat(int id) {
		return this.alamat.get(id);
	}
	
	public String getTelepon(int id) {
		return this.telepon.get(id);
	}
}
