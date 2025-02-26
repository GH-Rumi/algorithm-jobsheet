package day2.codeprogram;

public class MataKuliahMain11 {
    public static void main(String[] args) {

        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMatkul = "MK001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 4;
        mk1.totalJam = 48;
        mk1.tampilInformasi();

        MataKuliah11 mk2 = new MataKuliah11("MK002", "SISOP", 4, 36);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(13);
        mk2.kurangiJam(7);
        mk2.kurangiJam(90);
    }
}
