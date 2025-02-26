package codeprogram;
import java.util.Scanner;
public class tugas3 {

    public static void tampilkanJadwal(String[] matkul, int[] SKS, int[] SMT, String[] hari) {
        System.out.println("================================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Mata kuliah: " + matkul[i] + ", SKS: " + SKS[i] + ", Semester: " + SMT[i] + ", Hari: " + hari[i]);
        }
        System.out.println("================================");
    }

    public static void tampilkanJadwalHari(String[] matkul, int[] SKS, int[] SMT, String[] hari, String hariCari) {
        System.out.println("================================");
        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equals(hariCari)) {
                System.out.println("Mata kuliah: " + matkul[i] + ", SKS: " + SKS[i] + ", Semester: " + SMT[i] + ", Hari: " + hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }

    public static void tampilkanJadwalSemester(String[] matkul, int[] SKS, int[] SMT, String[] hari, int semesterCari) {
        System.out.println("================================");
        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (SMT[i] == semesterCari) {
                System.out.println("Mata kuliah: " + matkul[i] + ", SKS: " + SKS[i] + ", Semester: " + SMT[i] + ", Hari: " + hari[i]);
                found = true;
            } 
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }

    public static void cariMataKuliah(String[] matkul, int[] SKS, int[] SMT, String[] hari, String namaCari) {
        System.out.println("================================");
        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equals(namaCari)) {
                System.out.println("Mata kuliah: " + matkul[i] + ", SKS: " + SKS[i] + ", Semester: " + SMT[i] + ", Hari: " + hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        System.out.println("--------------------------------");

        String[] matkul = new String[n];
        int[] SKS = new int[n];
        int[] SMT = new int[n];
        String[] hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah: ");
            matkul[i] = sc.next();
            System.out.print("Masukkan SKS: ");
            SKS[i] = sc.nextInt();
            System.out.print("Masukkan SMT: ");
            SMT[i] = sc.nextInt();
            System.out.print("Masukkan hari kuliah: ");
            hari[i] = sc.next();
            System.out.println("--------------------------------");
        }

        while (true) {
            System.out.println("Jadwal kuliah: ");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan SMT");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
    
            switch (pilihan) {
                case 1:
                    tampilkanJadwal(matkul, SKS, SMT, hari);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hariCari = sc.next();
                    tampilkanJadwalHari(matkul, SKS, SMT, hari, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan SMT: ");
                    int semesterCari = sc.nextInt();
                    tampilkanJadwalSemester(matkul, SKS, SMT, hari, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaCari = sc.next();
                    cariMataKuliah(matkul, SKS, SMT, hari, namaCari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    sc.close();
                    return;
            }
        }
    }
}