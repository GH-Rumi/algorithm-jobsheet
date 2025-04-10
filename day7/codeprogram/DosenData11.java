package day7.codeprogram;

import java.util.ArrayList;

public class DosenData11 {
    private Dosen11[] daftar;
    private int jumlah;

    public DosenData11(int kapasitas) {
        daftar = new Dosen11[kapasitas];
        jumlah = 0;
    }

    public void tambahDosen(Dosen11 dsn) {
        if (jumlah < daftar.length) {
            daftar[jumlah] = dsn;
            jumlah++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampilkanSemua() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(daftar[i]);
        }
    }

    public void cariBerdasarkanNama(String nama) {
        ArrayList<Dosen11> ditemukan = new ArrayList<>();
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].Nama().equalsIgnoreCase(nama)) {
                ditemukan.add(daftar[i]);
            }
        }

        if (ditemukan.isEmpty()) {
            System.out.println("Dosen bernama \"" + nama + "\" tidak ditemukan.");
        } else {
            for (Dosen11 d : ditemukan) {
                System.out.println("Dosen ditemukan: " + d);
            }
            if (ditemukan.size() > 1) {
                System.out.println("Peringatan: Ada lebih dari satu dosen dengan nama tersebut!");
            }
        }
    }

    public void cariBerdasarkanUsia(int usia) {
        // Bubble sort berdasarkan usia secara ascending
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (daftar[j].Usia() > daftar[j + 1].Usia()) {
                    Dosen11 temp = daftar[j];
                    daftar[j] = daftar[j + 1];
                    daftar[j + 1] = temp;
                }
            }
        }

        ArrayList<Dosen11> hasil = new ArrayList<>();
        int kiri = 0, kanan = jumlah - 1;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            int usiaTengah = daftar[tengah].Usia();

            if (usiaTengah == usia) {
                hasil.add(daftar[tengah]);

                int keKiri = tengah - 1;
                while (keKiri >= 0 && daftar[keKiri].Usia() == usia) {
                    hasil.add(daftar[keKiri--]);
                }

                int keKanan = tengah + 1;
                while (keKanan < jumlah && daftar[keKanan].Usia() == usia) {
                    hasil.add(daftar[keKanan++]);
                }

                break;
            } else if (usiaTengah < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Tidak ada dosen dengan usia " + usia);
        } else {
            for (Dosen11 d : hasil) {
                System.out.println("Dosen ditemukan: " + d);
            }
            if (hasil.size() > 1) {
                System.out.println("Peringatan: Lebih dari satu dosen dengan usia tersebut!");
            }
        }
    }
}
