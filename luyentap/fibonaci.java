package luyentap;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        int n;
        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i =2;i<=n;i++)
        {
            for(int j =i-1;j<n-1;j++)
            {
                for(int k=i-2;k<n-2;k++)
                {
                    arr[i] = arr[j]+arr[k];
                    break;
                }
                break;
            }
            
            System.out.print(arr[i] + " ");
        }

    }
}
