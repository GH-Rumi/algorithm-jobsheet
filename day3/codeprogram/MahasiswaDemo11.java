package day3.codeprogram;
import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa11 = new Mahasiswa11[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa11[i] = new Mahasiswa11();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa11[i].nim = emu.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa11[i].nama = emu.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa11[i].kelas = emu.nextLine();
            System.out.print("IPK   : ");
            dummy = emu.nextLine();
            arrayOfMahasiswa11[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");

        }
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa11[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa11[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa11[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa11[i].ipk);
            System.out.println("---------------------------------");
        }
        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa11[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    emu.close();
    }
}
