package Lelang;

public class LelangApp {
	public static void main(String[] args) {
		Barang barang = new Barang();
		Petugas petugas = new Petugas();
		Masyarakat masyarakat = new Masyarakat();
		Laporan laporan = new Laporan();
		Lelang lelang = new Lelang();
		
		lelang.start(barang, petugas, masyarakat, laporan);
	}
}
