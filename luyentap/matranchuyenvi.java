package luyentap;

import java.util.Scanner;

public class matranchuyenvi {
    public static void main(String[] args) {
    int n,m;
    System.out.print("nhap so ptu cua hang: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    System.out.print("nhap so phan tu cua cot: ");
    m = sc.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[m][n];
    System.out.println("nhap ma tran a: ");
    for(int i=0;i<n;i++)
    {
        for(int j =0;j<m;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("ma tran goc: ");
    for(int i=0;i<n;i++)
    {
        for(int j =0;j<m;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.print("\n");
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[i][j]=a[j][i];
        }
    }
    System.out.println("ma tran chuyen vi: ");
    for(int i=0;i<m;i++)
    {
        for(int j =0;j<n;j++)
        {
            System.out.print(b[i][j]+" ");
        }
        System.out.print("\n");
    }
    }
}
