package luyentap;

import java.util.Scanner;
// cho dãy n, hoán đổi vị trí các cặp k số theo thứ tự từ trái sang của mảng
// vd: 1 2 3 4 5 6 7, k=2 ===> 2 1 4 3 6 5 7
// vd: 1 2 3 4 5 6 7, k=3 ===> 3 2 1 6 5 4 7
public class ReverseNode {
    public  void transfer(int a[], int k)
    {
        // {1 2 3 4 5 6 7} k=2
        int u=0;
        while (7-u>k)
        {
            for (int i = u; i < k+u; i++) {
                for (int j = i+1; j < k+u; j++) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                System.out.print(a[i]+" ");
            }
            u+=k;
        }
        for (int i = u; i < 7; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseNode c1 = new ReverseNode();
        System.out.println("nhap cac phan tu cua mang n: ");
        int a[] = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("nhap k: ");
        int k= sc.nextInt();
        c1.transfer(a,k);
    }
}
