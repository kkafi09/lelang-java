package Lelang;

public class Laporan {
	public void laporan(Barang barang) {
		int total = barang.getTotalBarang();
		System.out.println("\n=======Barang Yang tersedia=======");
		System.out.println("Id \tNama barang \tHarga Awal \tStatus");
		for (int i = 0; i < total; i++) {
			String statusStr = barang.getStatus(i) == true ? "Tersedia" : "Tidak tersedia";
			System.out.println(barang.getId(i) + "\t" + barang.getNamaBarang(i) + "\t" + barang.getHargaAwal(i) + "\t\t"
					+ statusStr);
		}
	}

	public void laporan(Masyarakat masyarakat) {
		int total = masyarakat.getTotalMasyarakat();
		System.out.println("\n=======Masyarakat=======");
		System.out.println("No \tNama \t\tAlamat \t\tTelepon");
		for (int i = 0; i < total; i++) {
			System.out.println(i + 1 + "\t" + masyarakat.getNama(i) + "\t\t" + masyarakat.getAlamat(i) + "\t"
					+ masyarakat.getTelepon(i));
		}
	}

	public void laporan(Petugas petugas) {
		int total = petugas.getTotalPetugas();
		System.out.println("\n=======Petugas=======");
		System.out.println("No \tNama \t\tAlamat \t\tTelepon");
		for (int i = 0; i < total; i++) {
			System.out.println(
					i + 1 + "\t" + petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));
		}
	}

	public void detailBarang(Barang barang, int index) {
		System.out.println("\n=======Detail Barang=======");
		System.out.println("Id barang   : " + barang.getId(index));
		System.out.println("Nama barang : " + barang.getNamaBarang(index));
		System.out.println("Harga Awal  : " + barang.getHargaAwal(index));
		System.out.println("Status      : " + barang.getStatus(index));
		System.out.println("============================");
	}

}
