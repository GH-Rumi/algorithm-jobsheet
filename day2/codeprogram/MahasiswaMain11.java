package day2.codeprogram;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();
        mhs1.nama = "Helmi Rizqi Ramadhan";
        mhs1.nim = "244107020107";
        mhs1.ipk = 3.70;
        mhs1.kelas = "TI 1J";

 
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1H");
        mhs1.ubahIPK(3.80);
        mhs1.tampilkanInformasi();

        Mahasiswa11 mhs2 = new Mahasiswa11("M. Fattahul Alim", "244107020018", 3.78, "TI 1H");
        mhs2.ubahIPK(3.80);
        mhs2.tampilkanInformasi();
    }
}
