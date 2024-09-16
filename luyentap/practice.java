package luyentap;

import java.util.Scanner;

public class practice {

    public long caculate(int a)
    {
        long count = 1;
        for (int i = 1; i <= a; i++) {
            count = count*i;
        }
        return  count;
    }
    public long caculate(int n, int k)
    {
        long count = 1;
        for (int i = 1; i <= (n-k); i++) {
            count = count*i;
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice p1 = new practice();
        System.out.println("nhap n va k(n>k): ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        long C = (p1.caculate(n)/(p1.caculate(k)*p1.caculate(n,k)));
        System.out.println(C);
    }
}
