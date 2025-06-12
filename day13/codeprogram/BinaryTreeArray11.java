package day13.codeprogram;

public class BinaryTreeArray11 {
    Mahasiswa11[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray11(){
        this.dataMahasiswa = new Mahasiswa11[100];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa11 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void add(Mahasiswa11 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
            System.out.println("Mahasiswa " + data.nama + " ditambahkan pada indeks " + idxLast);
        } else {
            System.out.println("Array penuh, tidak dapat menambahkan data baru.");
        }
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tamplInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void traversePreOrder() {
        System.out.println("\nPreOrder Traversal Mahasiswa (Array) : ");
        traversePreOrder(0);
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tamplInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}