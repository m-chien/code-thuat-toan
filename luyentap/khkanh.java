package luyentap;

import java.util.Scanner;

public class khkanh {
    public static void main(String[] args) {
//        Mang doi xung
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang :");
        int n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Nhap gia tri cac phan tu :");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int s=0;
        if (n%2==0){
            for (int i = 0; i < n/2; i++) {
                for (int j = n-i-1; j >=n/2 ; j--) {
                    if (a[i]==a[j])
                        s=s+1;
                    break;
                }
            }
            if (s==n/2)
                System.out.println("Day la mang doi xung");
            else
                System.out.println("Khong phai la mang doi xung");
        }
        else
        {
            for (int i = 0; i < n/2; i++) {
                for (int j = n-i-1; j >=(n/2)+1 ; j--) {
                    if (a[i]==a[j])
                        s=s+1;
                    break;
                }
            }
            if (s==n/2)
                System.out.println("Day la mang doi xung");
            else
                System.out.println("Khong phai la mang doi xung");
        }
    }
}
