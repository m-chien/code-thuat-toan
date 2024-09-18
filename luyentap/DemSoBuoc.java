package luyentap;

import java.util.Scanner;

//cho ban co MxN, nguoi choi moi lan di chuyen chi co the di chuyen sang phai hoac len tren
//co bao nheiu cach de nguoi choi di tu diem duoi cung ben trai len diem tren cung ben phai chi voi m+n buoc
public class DemSoBuoc {

    static int giaithua(int a)
    {
        int tong =1;
        for (int i = 1; i <= a ; i++) {
            tong*=i;
        }
        return tong;
    }
    static void tinh(int n,int m, int tong)
    {
        int tohop =(giaithua(tong))/(giaithua(n)*giaithua(tong-n));
        System.out.printf("vay co %d cach", tohop);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap chieu ngang va doc cua hinh: ");
        int n = sc.nextInt();// chieu ngang
        int m = sc.nextInt();// chieu doc
        tinh(n,m,n+m);
    }

}
