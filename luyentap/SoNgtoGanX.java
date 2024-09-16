package luyentap;

import java.util.Scanner;

public class SoNgtoGanX {
    public static void main(String[] args) {
        int n,x;
        System.out.print("nhap so ptu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        int y=0;
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("nhap vao 1 so X: ");
        x = sc.nextInt();
        int k=-1;
        // chon ra so nguyen to
        System.out.print("cac so nguyen to co trong mang la: " );
        for(int i =0;i<n;i++)
        {
            int count =0;
            for(int j =1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                k++;
                res[k]=arr[i];
                System.out.print(res[k] + " ");
            } 
        }
        // tim so nguyen to gan nhat trong mang
        // [3 5 7] X=6;
        int min = Math.abs(x-res[0]);
        int dem =0;
        int chon=0;
        for(int i=0;i<=k;i++)
        {
            if(Math.abs(x-res[i])<=min)
            {
                min = Math.abs(x-res[i]);
                chon= res[i];
            }
            else
            {
                chon=res[0];
            }
        }
        // so nguyen to gan voi so x can tim
        System.out.print("\nso nguyen to gan nhat voi so can tim la: ");
        for(int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-x)==min)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
