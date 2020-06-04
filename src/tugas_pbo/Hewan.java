package tugas_pbo;

public class Hewan {
	
	private String nama;
	private int jumlah_kaki;
	private String jenis;
	private String reproduksi;
	private String bernapas;
	
	//getter
	
	public String getNama() {
		return this.nama;
	}
	public int getKaki() {
		return this.jumlah_kaki;
	}
	public String getJenis() {
		return this.jenis;
	}
	public String getReproduksi() {
		return this.reproduksi;
	}
	public String getBernapas() {
		return this.bernapas;
	}
	
	//setter
	
	public void setNama(String nama) {
		this.nama=nama;
	}
	public void setKaki(int kaki) {
		this.jumlah_kaki = kaki;
	}
	public void setJenis(String jenis) {
		this.jenis=jenis;
	}
	public void setReproduksi(String reproduksi) {
		this.reproduksi=reproduksi;
	}
	public void setBernapas(String bernapas) {
		this.bernapas=bernapas;
	}
	
	

}
