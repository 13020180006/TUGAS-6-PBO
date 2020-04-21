/*
	Nama        : Paramadina Mulya Majid
	Stambuk     : 13020180006
	Kelas       : B1
	Hari/Tanggal: Minggu, 19 April 2020
	Waktu       : 14.19 WITA
*/

package tugas6;

public class AccessModifierPublic {
    public String namaAplikasi;
	public double size;

	public void setNamaAplikasi(String namaAplikasi){
		this.namaAplikasi = namaAplikasi;
	}
	public void setSize(int size){
		this.size = size;
	}

	public String getNamaAplikasi(){
		return namaAplikasi;
	}
	public double getSize(){
		return size;
	}
}
