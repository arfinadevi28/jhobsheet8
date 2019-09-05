package perulangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
import java.util.Scanner;

public class challenge2 {

    private static nilai NilaiHarian;
    public static void main (String[] args) {
        //Deklarasi
        int harian;         int hasilharian;
        int laporan;        int hasillaporan;
        int ujian;          int hasilujian;
        int akhir;          int hasilakhir;
        
        
        System.out.println(" =======Menentukan Nilai Akhir Siswa====== ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("menentukan pengambilan nilai");
        System.out.println("masukkan nilai harian");
        int NilaiHarian = scanner.nextInt();      
        harian = NilaiHarian * 30 / 100;
        System.out.println("Nilai harian : " + harian);
       
        System.out.println("Masukkan Nilai Laporan");
        int NilaiLaporan = scanner.nextInt();       
        laporan = NilaiLaporan * 20 / 100;
        System.out.println("Masukkan Nilai Laporan : " + laporan);
        
        System.out.println("Masukkan Nilai Ujian");
        int NilaiUjian = scanner.nextInt();       
        ujian = NilaiUjian * 50 / 100;
        akhir = harian + laporan + ujian;
        System.out.println("Nilai Akhir : " + akhir);
        
        // konverensi nilai angka ke huruf
        
        if(akhir <= 40) {
             System.out.println("Nilai = F");
        }else if(akhir <= 55) {
             System.out.println("Nilai = E");
        }else if(akhir <= 74) {
             System.out.println("Nilai = D");
        }else if(akhir <= 85) {
             System.out.println("Nilai = C");
        }else if(akhir <= 92) {
             System.out.println("Nilai = B");
        }else if(akhir <= 100) {
             System.out.println("Nilai = A");
             
                }
        // melakukan penentuan kelulusan siswa
        System.out.println("\n=====Penentuan Kelulusan Siswa=====");
       
        if(akhir <= 40) {
             System.out.println("Anda Tidak Lulus, Tingkatkan Belajar Anda");
        }else if(akhir <= 55) {
             System.out.println("Anda Tidak Lulus, Tinggkatkan Belajar Anda");
        }else if( akhir <= 74) {
             System.out.println("Anda Tidak Lulus, Tinggkatkan Belajar Anda");
        }else if( akhir <= 85) {
             System.out.println("Anda Lulus Lulus Dengan Cukup, Tinggkatkan Belajar Anda");            
        }else if( akhir <= 92) {       
             System.out.println("Anda Lulus Dengan Baik, Pertahannkan Prestasimu");
        }else if( akhir <= 100) {
             System.out.println("Anda Lulus, Excellent");
             
             
          }
      }

    }
   
