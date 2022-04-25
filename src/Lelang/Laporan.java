package Lelang;

public class Laporan {
	public void laporan(Barang barang) {
		int total = barang.getTotalBarang();
		System.out.println("Barang Yang tersedia untuk Lelang");
		System.out.println("id Barang \t Nama barang \t Harga Awal \t Status");
		for (int i = 0; i < total; i++) {
			String statusStr = barang.getStatus(i) == true ? "Tersedia" : "Tidak tersedia";
			System.out.println(barang.getId(i) + "\t" + barang.getNamaBarang(i) + "\t" + barang.getHargaAwal(i) + "\t"
					+ statusStr);
		}
	}

	public void laporan(Masyarakat masyarakat) {
		int total = masyarakat.getTotalMasyarakat();
		System.out.println("Masyarakat yang mengikuti lelang");
		System.out.println("No \t Nama Masyarakat \t Alamat \t Telepon");
		for (int i = 0; i < total; i++) {
			System.out.println(i + 1 + "\t" + masyarakat.getNama(i) + "\t" + masyarakat.getAlamat(i) + "\t"
					+ masyarakat.getTelepon(i));
		}
	}

	public void laporan(Petugas petugas) {
		int total = petugas.getTotalPetugas();
		System.out.println("Petugas Lelang");
		System.out.println("No \t Nama Petugas \t Alamat \t Telepon");
		for (int i = 0; i < total; i++) {
			System.out.println(
					i + 1 + "\t" + petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));
		}
	}

	public void detailBarang(Barang barang, int index) {
		System.out.println("Id barang : " + barang.getId(index));
		System.out.println("Nama barang : " + barang.getNamaBarang(index));
		System.out.println("Harga Awal : " + barang.getHargaAwal(index));
		System.out.println("Status : " + barang.getStatus(index));
	}

}
