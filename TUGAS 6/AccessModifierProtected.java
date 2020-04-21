/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 16.53 WITA
*/
package tugas6;

public class AccessModifierProtected {
    protected String judul = "Belajar Pemrograman Berorientasi Objek";
    protected boolean kembali;
    
    protected void setKembali(boolean kembali){
        this.kembali = kembali;
    }
    protected boolean getkembali(){
        return kembali;
    }
}
