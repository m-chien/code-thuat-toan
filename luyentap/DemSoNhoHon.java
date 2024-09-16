package luyentap;

import java.util.Scanner;

public class DemSoNhoHon {
    public void check(int a[])
    {
        int b[] = new int[26];
        int u=0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (a[j]<a[i])
                {
                    b[u] = a[j];
                    u++;
                }
                
            }
            if(i==4)
            {
                b[u]=0;
                u++;
            }
        }

        for (int i = 0; i < u; i++) {
            System.out.print(b[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DemSoNhoHon s1 = new DemSoNhoHon();
        System.out.println("nhap cac phan tu cua mang: ");
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]= sc.nextInt();
        }
        s1.check(a);
    }
}
