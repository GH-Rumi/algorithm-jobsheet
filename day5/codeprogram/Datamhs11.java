package day5.codeprogram;

public class Datamhs11 {
    String nama;
    String nim;
    String tahunMasuk;
    double uts;
    double uas;

    Datamhs11(){}

    Datamhs11(String name, String nm, String thnMsk, double nilaiUts, double nilaiUas){
        nama = name;
        nim = nm;
        tahunMasuk = thnMsk;
        uts = nilaiUts;
        uas = nilaiUas;
    }

    void tambahData(String name, String nm, String thnMsk, double nilaiUts, double nilaiUas){
        nama = name;
        nim = nm;
        tahunMasuk = thnMsk;
        uts = nilaiUts;
        uas = nilaiUas;
    }

    public static double nilaiTerendah(Datamhs11[] arr, int left, int right) {
        if (left == right) { 
            return arr[left].uts;
        }

        int mid = (left + right) / 2;
        double minimumKiri = nilaiTerendah(arr, left, mid);
        double minimumKanan = nilaiTerendah(arr, mid + 1, right);

        return Math.min(minimumKiri, minimumKanan);
    }

    public static double nilaiTertinggi(Datamhs11[] arr, int left, int right) {
        if (left == right) { 
            return arr[left].uts;
        }

        int mid = (left + right) / 2;
        double maksimumKiri = nilaiTertinggi(arr, left, mid);
        double maksimumKanan = nilaiTertinggi(arr, mid + 1, right);

        return Math.max(maksimumKiri, maksimumKanan);
    }

    public static double hitungRataUAS(Datamhs11[] arr) {
        double total = 0;
        for (Datamhs11 mhs : arr) {
            total += mhs.uas;
        }
        return total / arr.length;
    }
}
