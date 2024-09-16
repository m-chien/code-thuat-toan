package luyentap;

import java.util.Scanner;

public class nhanhaimatran {
    public static void main(String[] args) {
        int n,m,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so hang va cot cua mang a: ");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.print("nhap so cot cua mang b: ");
        k = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][k];
        int[][] c = new int[n][k];
        System.out.println("Nhap phan tu mang a: ");
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Nhap phan tu mang b: ");
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<k;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<k;j++)
            {
                int tinh=0;
                for(int h =0;h<m;h++)
                {
                    tinh+= a[i][h]*b[h][j];
                }
                c[i][j]=tinh;
            }
        }
        System.out.println("Mang sau khi nhan: ");
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<k;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
