package day2.codeprogram;

public class Dosen11 {
    
    String id;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen11() {
        this.id = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    public Dosen11(String id, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.id = id;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen11: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif telah diubah.");
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
