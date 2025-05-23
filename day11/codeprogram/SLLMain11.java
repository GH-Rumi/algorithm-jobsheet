package day11.codeprogram;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("20001", "Alvaro", "3A", 3.5);
        Mahasiswa11 mhs2 = new Mahasiswa11("20002", "Cintia", "3B", 3.2);
        Mahasiswa11 mhs3 = new Mahasiswa11("20003", "Bimon", "3A", 3.8);
        Mahasiswa11 mhs4 = new Mahasiswa11("20004", "Dirga", "3C", 3.1);

        sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("Data Index 1: ");
        sll.getData(1).tampilkanData();

        System.out.println("Data Mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}