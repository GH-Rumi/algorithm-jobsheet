package day3.codeprogram;

public class DataDosen11 {
    public void dataSemuaDosen (Dosen11[] arrayOfDosen11) {
        System.out.println("Data semua dosen");
        for(Dosen11 Dosen : arrayOfDosen11) {
            Dosen.tampilkanData();
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for(Dosen11 Dosen : arrayOfDosen11) {
            if (Dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah dosen pria sebanyak " + jumlahPria);
        System.out.println("Jumlah dosen wanita sebanyak " + jumlahWanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumPria = 0;
        int jumWanita = 0;

        for (Dosen11 dosen : arrayOfDosen11) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria: " + (jumPria > 0 ? (double) totalUsiaPria / jumPria : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (jumWanita > 0 ? (double) totalUsiaWanita / jumWanita : 0));
    }
    public void infoDosenPalingTua(Dosen11[] arrayOfDosen11) {
        Dosen11 DosenPalingTua = arrayOfDosen11[0];
        for(Dosen11 Dosen : arrayOfDosen11) {
            if (Dosen.usia>DosenPalingTua.usia) {
                DosenPalingTua = Dosen;
            }
        }
        System.out.println("Dosen Paling Tua");
        DosenPalingTua.tampilkanData();
    }
    public void infoDosenPalingMuda(Dosen11[] arrayOfDosen11) {
        Dosen11 DosenPalingMuda = arrayOfDosen11[0];
        for(Dosen11 Dosen : arrayOfDosen11) {
            if (Dosen.usia<DosenPalingMuda.usia) {
                DosenPalingMuda = Dosen;
            }
        }
        System.out.println("Dosen Paling Muda");
        DosenPalingMuda.tampilkanData();
    }
}
