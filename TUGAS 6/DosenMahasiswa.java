/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 18.46 WITA
*/
package tugas6;

public class DosenMahasiswa  {
    public static void main(String[] args) {
        Polymorphism [] manusia = new Polymorphism [2];
        
        manusia[0] = new Mahasiswa();
        manusia[1] = new Dosen();

        for (int i = 0; i < 2; i++){
            manusia[i].membaca();
            manusia[i].menulis();
            manusia[i].menjelaskan();
            System.out.println();
        }
    }
}
