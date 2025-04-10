package day7.codeprogram;

public class nMahasiswaBerprestasi11 {
    nMahasiswa11[] listMhs = new nMahasiswa11[5]; 
    int idx = 0;

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ada di posisi ke-" + pos);
        } else {
            System.out.println("data mahasiswa dengan IPK :" + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
        } else {
            System.out.println("data mahasiswa dengan IPK :" + x + " tidak ditemukan");
        }
    }

    void tambah(nMahasiswa11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }
    
    void tampil() {
        for (nMahasiswa11 m : listMhs) {
            if (m != null) {
                m.tampilkanInformasi();
                System.out.println("--------------------");
            }
        }
    }
}
