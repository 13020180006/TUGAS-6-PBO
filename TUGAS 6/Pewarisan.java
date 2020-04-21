/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 19 April 2020
	Waktu	: 17.55 WITA
*/
package tugas6;

public class Pewarisan {
    public String jenis;
    public String warna;
    public String ukuran;
    
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getWarna() {
        return warna;
    }
    public void setwarna(String warna) {
        this.warna = warna;
    }
    public String getUkuran() {
        return ukuran;
    }
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
 
 public void tampilData(){
        System.out.println("Jenis Pakaian :"+getJenis());
        System.out.println("Warna Pakaian :"+getWarna());
        System.out.println("Ukuran Pakaian :"+getUkuran());  
 }
 public void inputData(String jenis,String warna,String ukuran){
     setJenis(jenis);
     setwarna(warna);
     setUkuran(ukuran);  
 }
}

