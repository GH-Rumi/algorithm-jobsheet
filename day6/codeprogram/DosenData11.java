package day6.codeprogram;

public class DosenData11 {
    private final Dosen11[] dataDosen = new Dosen11[10];
    private int jumlahData = 0;

    void tambah(Dosen11 dsn) {
        if (jumlahData >= dataDosen.length) {
            System.out.println("Data Dosen11 sudah penuh!");
            return;
        }
        dataDosen[jumlahData++] = dsn;
    }

    void tampil() {
        for (Dosen11 dsn : dataDosen) {
            if (dsn != null) {
                dsn.tampil();
            }
        }
    }

    void sortingASC() {
        boolean swapped;
        for (int i = 0; i < jumlahData - 1; i++) {
            swapped = false;
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    tukar(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    void sortingDSC() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = i + 1; j < jumlahData; j++) {
                if (dataDosen[j].usia > dataDosen[i].usia) {
                    tukar(i, j);
                }
            }
        }
    }

    private void tukar(int i, int j) {
        Dosen11 temp = dataDosen[i];
        dataDosen[i] = dataDosen[j];
        dataDosen[j] = temp;
    }
}
