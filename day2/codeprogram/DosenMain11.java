package day2.codeprogram;

public class DosenMain11 {
    public static void main(String[] args) {
       
        Dosen11 dosen1 = new Dosen11();
        dosen1.id = "WXS";
        dosen1.nama = "M. Aryatama Mukapraja";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Ilmu Komputer";
        dosen1.tampilInformasi();

        Dosen11 dosen2 = new Dosen11("MMJ", "M. Fattahul Alim", false, 2012, "Matematika");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        
        int masaKerja = dosen2.hitungMasaKerja(2023);
        System.out.println("Masa kerja Dosen 2: " + masaKerja + " tahun");

        dosen2.ubahKeahlian("Statistika");
    }
}