/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 14.24 WITA
*/

package tugas6;

public class Pelanggan extends tugas6.AccessModifierPublic{
	public static void main(String[] args){
       		Pelanggan data = new Pelanggan();
        	data.setNamaAplikasi("Netbeans");
        	data.setSize((int) 2.3);
                System.out.println("Aplikasi "+data.getNamaAplikasi());
       		System.out.println("Memiliki ukuran "+data.getSize()+" GB");
    }
}
