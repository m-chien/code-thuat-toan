package luyentap;

import java.util.Scanner;

public class SoNguyenDuongDauTien {
    public void transfer(int a[])
    {
        for (int i = 0; i < 7; i++) {
            for (int j = i+1; j < 7; j++) {
                if (a[j]<a[i])
                {
                    int c = a[i];
                    a[i]= a[j];
                    a[j] =c;
                }
            }
        }
    }
    public void check(int a[])
    {
        int n=1;
        for (int i = 0; i < 7; i++) {
            if (n==a[i])
            {
                n+=1;
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        SoNguyenDuongDauTien s1 = new SoNguyenDuongDauTien();
        System.out.println("nhap cac phan tu cua mang: ");
        int a[] = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i]= sc.nextInt();
        }
        s1.transfer(a);
        s1.check(a);
    }
}
