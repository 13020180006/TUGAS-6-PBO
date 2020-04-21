    /*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 18.38 WITA
*/
package tugas6;

public class Dosen extends Polymorphism {
    
    @Override
    void membaca(){
        System.out.println("Dosen Sedang Membaca");
    }
    @Override
    void menulis(){
        System.out.println("Dosen Sedang Menulis");
    }
    @Override
    void menjelaskan(){
        System.out.println("Dosen Sedang Menjelaskan");
    }

}
