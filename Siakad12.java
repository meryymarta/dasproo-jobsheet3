import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;
/**
 * Siakad12
 */
public class Siakad12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Deklarai variabel
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        
        //Input nama, nim, kelas, absen
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM:  ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print ("Masukkan no absen: ");
        absen = sc.nextByte();
        
        // metode untuk menghitung nilai akhir
        double bobotKuis = 0.2;
        double bobotTugas = 0.15;
        double bobotUts = 0.3;
        double bobotUas = 0.35;

      
        //Input nilaiKuis, nilaiTugas, nilaiUjian
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print ("Masukkan bobot kuis: ");
        bobotKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas:"); 
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan bobot tugas: ");
        bobotTugas = sc.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        nilaiUts = sc.nextDouble(); 
        System.out.print("Masukkan bobot Uts: ");
        bobotUas = sc.nextDouble();
        System.out.print("masukkan nilai uas: ");
        nilaiUas = sc.nextDouble();
        System.out.print("Masukkan bobot Uas: ");
        bobotUas = sc.nextDouble();

        //Proses perhitungan nilai akhir
        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas ) + (nilaiUts * bobotUts) + (nilaiUas * bobotUas);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " no absen" + absen );
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai tugas: " + nilaiTugas);
        System.out.println("UTS Score: " + nilaiUts);
        System.out.println("UAS Score: " + nilaiUas);
        System.out.println("Nilai akhir: " + nilaiAkhir);


    }
}

