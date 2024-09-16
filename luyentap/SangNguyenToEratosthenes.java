package luyentap;

import java.util.Scanner;

public class SangNguyenToEratosthenes {
    static void ngto(int n)
    {
        int check[]= new int[n+1];
        int a=2;
        while(true)
        {
            if(a*a>n) break;
            int p=a*a;
            while(p<=n)
            {
                check[p] = p;
                p+=a;
            }
            a++;
            while(a<=n && a == check[a]) a++;
            if(a>n) break;
        }
        for (int i = 2; i < n+1; i++) {
            if (check[i]==0) System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        ngto(n);
    }
}
