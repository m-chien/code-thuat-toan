package luyentap;

import java.util.Scanner;
// chen gia tri vao mang tang dan sao cho mang khong thay doi thuoc tinh sap xep cua mang
public class chengiatrivaomang {
    public static void main(String[] args) {
        int n,x;
        System.out.print("nhap so ptu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n+1];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("nhap vao 1 gia tri X: ");
        x = sc.nextInt();
        //--------------------------------------------------------------CACH 1-------------------------------------------------------------
        if(x<arr[0])
        {
            res[0]=x;
            System.out.print(res[0]+" ");
            for(int i=1;i<n+1;i++)
            {
                res[i]=arr[i-1];
                System.out.print(res[i]+" ");
            }

        }
        else if(x>arr[n-1])
        {
            for(int i=0;i<n;i++)
            {
                res[i]=arr[i];
                System.out.print(res[i]+" ");
            }
            res[n]=x;
            System.out.println(res[n]+" ");
        }
        else
        {
            for(int i=0;i<=n;i++)
            {
                if(x<=arr[i])
                {
                    res[i]=x;
                    for(int j=0;j<i;j++)
                    {
                        res[j]=arr[j];
                        System.out.print(res[j]+" ");
                    }
                    System.out.print(res[i]+" ");
                    for(int k=i;k<n+1;k++)
                    {
                        res[k]=arr[i];
                        i++;
                        System.out.print(arr[k]+" ");
                    }
                }
            }
        }
        //-------------------------------------------------------------CACH 2------------------------------------------------------
        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }
        int a=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>x)
            {
                a=i;
                break;
            }
        }
        if(a==-1)
        {
            res[n]=a;
        }
        else{
            for(int i=n;i>a;i--)
            {
                res[i]=res[i-1];
            }
            res[a]=x;
        }
        for(int i=0;i<n+1;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
