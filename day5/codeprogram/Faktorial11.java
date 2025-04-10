package day5.codeprogram;

public class Faktorial11 {
    int Faktorial11BF(int n) {
        int fakto = 1;
        for(int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }
    int Faktorial11DC(int n) {
        if(n==1) {
            return 1;
        } else {
            int fakto = n * Faktorial11DC(n-1);
            return fakto;
        }
    }
}
