package luyentap;

import java.util.Scanner;

public class chenmang {
    public static void main(String[] args) {
        int n,p,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ptu cua mang a: ");
        n = sc.nextInt();
        System.out.print("nhap so ptu cua mang b: ");
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b =new int[m];
        System.out.print("nhap cac phan tu cua a: ");
        for(int i = 0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("nhap cac phan tu cua b: ");
        for(int i = 0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        do
        {
            System.out.println("nhap so nguyen P (p lon hon bang 0 va be hon so phan tu trong mang a): ");
            p = sc.nextInt();
        }
        while(p<0 || p>=n);
        int[] c= new int[n+m];
        for(int i=0;i<p;i++)
        {
            c[i]=a[i];
        }
        int j=0;
        for(int i=p;i<m+p;i++)
        {
                c[i]=b[j];
                j++;
        }
        int k=p;
        for(int i=m+p;i<m+n;i++)
        {
                c[i]=a[k];
                k++;
        }
        for(int i=0;i<m+n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
