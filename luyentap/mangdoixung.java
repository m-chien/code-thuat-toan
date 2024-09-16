package luyentap;

import java.util.Scanner;

public class mangdoixung {
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
        int ss=0;
        if(n%2==0)
        {
            for(int i =0;i<n/2;i++)
            {
                for(int j=n-i-1; j>=n/2;j--)
                {
                    if(arr[i]==arr[j])
                    {
                        ss +=1;
                    }
                    break;
                }
            }
            if(ss==n/2)
            {
                System.out.println("la mang doi xung");
            }
            else{
                System.out.println("khong la mang doi xung");
            }
        }
        else 
        {
            for(int i =0;i<n/2;i++)
            {
                for(int j=n-i-1; j>=(n/2)+1;j--)
                {
                    if(arr[i]==arr[j])
                    {
                        ss +=1;
                    }
                    break;
                }
            }
            if(ss==(n/2))
            {
                System.out.println("la mang doi xung");
            }
            else{
                System.out.println("khong la mang doi xung");
            }
        }
    }
}
