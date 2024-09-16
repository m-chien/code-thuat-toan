package luyentap;

import java.util.Scanner;

public class solanxuathien {
    public static void main(String[] args) {
        int n;
        System.out.print("nhap so ptu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        int x;
        int y=0;
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
            res[i]= -1;
        }
        // [ 1 1 2 3 3 2 4 4 1 ]
        // [0 0 -1 -1 -1 -1 -1 -1 0]
        for(int i =0;i<n;i++)
        {
            int count=0;
            for(int j =0;j<n;j++)
            {
                if(arr[j] == arr[i] && res[j]!=0)
                {
                    count+=1;
                    res[j]=0;
                }
            }
            if(count!=0)
            {
                System.out.println(arr[i] + " xuat hien " + count + " lan");
            }
        }
    }
}
