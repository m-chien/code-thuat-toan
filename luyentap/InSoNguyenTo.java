package luyentap;

import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhập một số nguyên:");
        int n= new Scanner(System.in).nextInt();
        int s=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0)
                s=s+i;
            }
        if (s==n+1)
            System.out.println(n+" là số nguyên tố");
        else
            System.out.println(n+" khong phai la so nguyen to");
        }
    }

