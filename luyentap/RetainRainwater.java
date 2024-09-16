package luyentap;

import java.util.Scanner;

public class RetainRainwater {
    public void maxleft(int a[],int maxleft[])
    {

        for (int i = 0; i < 12; i++) {
            maxleft[i]=0;
            for (int j = i-1; j >0 ; j--) {
                if(a[j]>maxleft[i]) maxleft[i]=a[j];
            }
            System.out.print(maxleft[i]+" ");

        }
        System.out.println();
    }
    public void maxright(int a[], int maxright[])
    {
        for (int i = 0; i < 12; i++) {
            maxright[i]=0;
            for (int j = i+1; j <12 ; j++) {
                if(a[j]>maxright[i]) maxright[i]=a[j];
            }
            System.out.print(maxright[i]+" ");
        }
        System.out.println();
    }
    public void Min(int a[], int b[], int min[])
    {
        for (int i = 0; i < 12; i++) {
            if(a[i]<=b[i]) min[i]=a[i];
            else if (a[i]>=b[i]) min[i]=b[i];
            System.out.print(min[i]+" ");
        }
        System.out.println();
    }
    public void count(int a[], int min[])
    {
        int sum=0;
        int count[] = new int[12];
        for (int i = 0; i < 12; i++) {
            if(min[i]-a[i]<0) count[i]=0;
            else count[i] = min[i]-a[i];
        }
        for (int i = 0; i < 12; i++) {
            sum+=count[i];
        }
        System.out.println("so khoi nuoc duoc tao thanh la: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetainRainwater r1 = new RetainRainwater();
        int ml[] = new int[12];
        int mr[] = new int[12];
        int min[] = new int[12];
        System.out.println("nhap cac phan tu cua mang: ");
        int a[] = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("max left: ");
        r1.maxleft(a,ml);
        System.out.print("max right: ");
        r1.maxright(a,mr);
        System.out.print("Min(L,R): ");
        r1.Min(ml,mr,min);
        r1.count(a,min);
    }
}
