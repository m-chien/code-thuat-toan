package luyentap;

import java.util.Scanner;

public class loaitrungnhau {
    public static void main(String[] args) {
        int n;
        System.out.print("nhap so ptu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] res =new int[n];
        int[] ss = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
            res[i]=-1;
        }
        int dem=0;
        
        //1 2 2 3 2 1
        System.out.print("mang sau khi loai bo trung nhau la: ");
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0; j<n;j++)
            {
                if(arr[i]==arr[j] && res[j]!=0)
                {
                    count++;
                    res[j]=0;
                }
            }
            if(count!=0)
            {
                System.out.print(arr[i]+" ");
                ss[dem]=arr[i];
                dem+=1;
            }
        }
        //sap xep theo chieu tang dan
        int sosanh=0;
        System.out.print("\nmang sau khi sap xep la: ");
         for(int i=0;i<dem;i++)
         {
            for(int j=i+1;j<dem;j++)
            {
                if(ss[j]<ss[i])
                {
                    sosanh=ss[i];
                    ss[i]=ss[j];
                    ss[j]=sosanh;
                }
            }
            System.out.print(ss[i]+" ");
         }
    }
}
