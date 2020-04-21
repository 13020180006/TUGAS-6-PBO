/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 16.59 WITA
*/
package tugas6;

public class Peminjaman extends AccessModifierProtected{
    public static void main(String[] args){
        Peminjaman data = new Peminjaman();
        data.setKembali(false);
        System.out.println("Saya Meminjam Buku : "+data.judul);
        System.out.println("Status Pengembalian: "+data.getkembali());
    }
}
