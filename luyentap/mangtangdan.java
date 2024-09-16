package luyentap;

import java.util.Scanner;

public class mangtangdan {
    public static void main(String[] args) {
    int n;
    System.out.print("nhap so ptu cua mang: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
    int tg;
    for(int i =0;i<n;i++)
    {
        for(int j =i+1;j<n;j++)
        {
            if(arr[j]<arr[i])
            {
                tg=arr[i];
                arr[i]=arr[j];
                arr[j]=tg;
            }
        }
        System.out.print(arr[i]+" ");
    }
    }
}
