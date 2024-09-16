package luyentap;

import java.util.Scanner;

//Cho số tự nhiên product
//Hãy tìm số nguyên dương nhỏ nhất (lớn hơn 0) mà tích các chữ số của số đó bằng product. Nếu không có số thỏa mãn, trả ra -1.
public class TichCacChuSo {
    static int timtich(int n)
    {
        if(n==1) return 1;
        if (n==0) return 10;
        int a=0;
        for (int i = 9; i >1 ; i--) {
            if(n%i==0)
            {
                a=a*10+i;
                n/=i;
            }
        }
        int b=0;
        while (a>0)
        {
            b=b*10+a%10;
            a/=10;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("nhap product: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(timtich(n));
    }
}
