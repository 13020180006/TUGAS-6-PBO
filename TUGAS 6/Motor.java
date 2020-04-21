/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 18.12 WITA
*/

package tugas6;

public class Motor extends OverRidingInheritance{
    void jalan(){ 
        System.out.println("Masukkan Kunci");
        System.out.println("Putar Kunci"); 
        System.out.println("Gas Kendaraan"); 
    } 
    
    public static void main(String args[]){ 
        Motor matic = new Motor(); 
        matic.jalan(); 
    }

}
