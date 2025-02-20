package codeprogram;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        char[] plat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};     
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A',},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G',},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N',},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.println("Masukkan kode plat huruf yang ingin dipilih: ");
        char kode = emu.nextLine().charAt(0);
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (kode == plat[i]) {
                System.out.println("Kota yang sesuai dengan plat tersebut adalah Kota ");
                for (char c : kota[i]) {
                    if (c != '\0') {
                        System.out.print(c);
                    }
                }
                System.out.println();
                found = true;
                break;
            }
        }
        emu.close();
    }
}
