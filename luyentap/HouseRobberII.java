package luyentap;

import java.util.Scanner;

public class HouseRobberII {
    public int robber(int a[], int n)
    {
        if (n%2==0)
        {
            int chan = 0;
            int le = 0;
            for (int i = 0; i < n; i=i+2) {
                chan+=a[i];
                le+=a[i+1];
            }
            return chan<le ? le : chan;
        }
        else
        {
            int chan = 0;
            int le = 0;
            for (int i = 0; i < n-1; i+=2) {
                chan+=a[i];
            }
            if(a[0]<a[n-1])
            {
                for (int i = 2; i < n; i+=2) {
                    le+=a[i];
                }
            }
            else
            {
                for (int i = 0; i < n-1; i+=2) {
                    le+=a[i];
                }
            }
            return chan<le ? le : chan;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HouseRobberII r1 = new HouseRobberII();
        System.out.println(" nhap so can nha: ");
        int n = sc.nextInt();
        System.out.println("nhap so tien cua tung can nha: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("so tien lon nhat co the cuop la: "+r1.robber(a,n) );
    }
}
