package day3.codeprogram;

import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        Dosen11[] arrayOfDosen11 = new Dosen11[3];
        String dummy;
        
        for(int i=0; i < 3; i++) {
            arrayOfDosen11[i] = new Dosen11();

            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            arrayOfDosen11[i].kode = emu.nextLine();
            System.out.print("Nama          : ");
            arrayOfDosen11[i].nama = emu.nextLine();
            System.out.print("Jenis Kelamin : ");
            String inputJenisKelamin = emu.nextLine(); 
            if (inputJenisKelamin.equalsIgnoreCase("Pria")) {
                arrayOfDosen11[i].jenisKelamin = true;
            } else if (inputJenisKelamin.equalsIgnoreCase("Wanita")) {
                arrayOfDosen11[i].jenisKelamin = false;
            } else {
                System.out.println("Input tidak valid");
                emu.close();
                return;
            }
            System.out.print("Usia          : ");
            dummy = emu.nextLine();
            arrayOfDosen11[i].usia = Integer.parseInt(dummy);
            System.out.println("-------------------------------");
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode           : " + arrayOfDosen11[i].kode);
            System.out.println("Nama           : " + arrayOfDosen11[i].nama);
            System.out.println("Jenis Kelamin  : " + (arrayOfDosen11[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + arrayOfDosen11[i].usia);
            System.out.println("---------------------------------");
        }
        DataDosen11 dataDosen = new DataDosen11();
        dataDosen.dataSemuaDosen(arrayOfDosen11);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen11);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen11);
        dataDosen.infoDosenPalingMuda(arrayOfDosen11);
        dataDosen.infoDosenPalingTua(arrayOfDosen11);

        emu.close();
    }
}
