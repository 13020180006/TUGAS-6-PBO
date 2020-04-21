/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 18.32 WITA
*/
package tugas6;

public class Mahasiswa extends Polymorphism{
    @Override
    void membaca(){
        System.out.println("Mahasiswa Sedang Membaca");
    }
    @Override
    void menulis(){
        System.out.println("Mahasiswa Sedang Menulis");
    }
    @Override
    void menjelaskan(){
        System.out.println("Mahasiswa Sedang Menjelaskan");
    }
}
