package day5.codeprogram;

public class Pangkat11 {
    int nilai, pangkat;
    Pangkat11(int n, int p) {
        nilai = n;
        pangkat = p;
    }
    int Pangkat11BF(int a, int n) {
        int hasil = 1;
        for(int i=0; i<n; i++) {
            hasil = hasil*a;
        }
        return hasil;
    }
    int Pangkat11DC(int a, int n) {
        if (n==1) {
            return a;
        } else {
            if(n%2==1) {
                return (Pangkat11DC(a, n/2)*Pangkat11DC(a, n/2)*a);
            } else {
                return (Pangkat11DC(a, n/2)*Pangkat11DC(a, n/2));
            }
        }
    }
}
