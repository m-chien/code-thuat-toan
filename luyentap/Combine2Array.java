package luyentap;

import javax.xml.parsers.SAXParser;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Combine2Array {
    public void array1(int a[]) {
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if(a[j]<a[i])
                {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            System.out.print(a[i]+" ");
        }
    }
    public void combine(int a[], int b[])
    {
        int c[] = new int[10];
        for (int i = 0; i < 5; i++) {
            c[i]=a[i];
            for (int j = i+5; j < 10; j++) {
                c[j]=b[i];
            }
        }
        array1(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combine2Array c1 = new Combine2Array();
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.print(" nhap cac phan tu cua a: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print(" nhap cac phan tu cua b: ");
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }
//        Arrays.sort(a);
//        Arrays.sort(b);
//        for(int number: a)
//        {
//            System.out.print(number+" ");
//        }
        c1.combine(a,b);
    }
}
