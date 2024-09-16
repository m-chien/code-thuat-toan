package luyentap;

import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.pow;


public class TimsoKhac0CuoiCung {
    static int check(int n)
    {
        int num2 =0;
        int num5 =0;
        while(n%2==0)
        {
            num2++;
            n/=2;
        }
        while (n%5==0)
        {
            num5++;
            n/=5;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("nhap n: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(check(n));
    }
}
