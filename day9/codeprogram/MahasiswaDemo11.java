package day9.codeprogram;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner ena = new Scanner(System.in);
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
        int pilih;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama");
            System.out.println("6. Total Tugas yang Telah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = ena.nextInt();
            ena.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = ena.nextLine();
                    System.out.print("NIM: ");
                    String nim = ena.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = ena.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa11 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = ena.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("NiLai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa11 cek = stack.pengumpulanPertama();
                    if (cek != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + cek.nama);
                    }
                    break;
                case 6:
                    int banyak = stack.totalTugas();
                    if (banyak != 0) {
                        System.out.println("Total tugas yang sudah terkumpul ada " + banyak);
                    }else{
                        System.out.println("Belum ada tugas yang dikumpulkan");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <=6);
        ena.close(); 
    } 
}