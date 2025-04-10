package day7.codeprogram;

import java.util.Scanner;

public class DosenMain11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DosenData11 data = new DosenData11(10);
    
            data.tambahDosen(new Dosen11("Arya", 20));
            data.tambahDosen(new Dosen11("Dzaky", 19));
            data.tambahDosen(new Dosen11("Fattah", 21));
            data.tambahDosen(new Dosen11("Sojo", 18));
            data.tambahDosen(new Dosen11("Naufal", 30));
    
            System.out.println("=== DATA DOSEN ===");
            data.tampilkanSemua();
    
            System.out.println("\n=== PENCARIAN DATA DOSEN ===");
            System.out.print("Pilih jenis pencarian (nama/usia): ");
            String jenis = sc.nextLine().toLowerCase();
    
            if (jenis.equals("nama")) {
                System.out.print("Masukkan nama dosen yang ingin dicari: ");
                String nama = sc.nextLine();
                data.cariBerdasarkanNama(nama);
            } else if (jenis.equals("usia")) {
                System.out.print("Masukkan usia dosen yang ingin dicari: ");
                int usia = sc.nextInt();
                data.cariBerdasarkanUsia(usia);
            } else {
                System.out.println("Jenis pencarian tidak valid.");
            }
    
            sc.close();
        }
}
