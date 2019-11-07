/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author 
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output gaji karyawan
 * 
 */
public class GajiKaryawan {

    public static void main(String[] args) {
        
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
        
        Manager manager = new Manager();
        
        System.out.println("_______Program Perhitungan Gaji Karyawan_______");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scn5.nextInt());
        
        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("NIK\t : "+manager.getNik());
        System.out.println("NAMA\t : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN\t : "+manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t : "+manager.gajiTotal());
    }
    
}
