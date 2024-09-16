package luyentap;

import java.util.Scanner;

public class fibonaciDeQuy {
    public static int in(int n)
    {
        if(n==1 || n==2 ) return 1;
        else {
            return in(n-1)+in(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang fibonaci: ");
        int n =sc.nextInt();
        System.out.println(in(n));

    }
}
