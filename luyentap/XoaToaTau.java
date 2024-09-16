package luyentap;

import java.util.Scanner;

//2167 leetcode
public class XoaToaTau {
    public static void dem(int a[], int n)
    {
        int count =0;
        int l = 0, r = n-1;
        while (l <= r) {
            if (a[l] == 1) {
                count++;
                a[l]=0;
            }
            if (a[r] == 1 && r != l) {
                count++;
                a[r]=0;
            }
            l++;
            r--;
        }
        for (int i = 0; i < n; i++) {
            if (a[i]==1)
            {
                count+=2;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong toa tau: ");
        int n = sc.nextInt();
        System.out.println("nhap cac ptu cua tpa tau: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        dem(a,n);
    }
}

