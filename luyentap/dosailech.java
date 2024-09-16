package luyentap;
import java.util.Scanner;

public class dosailech {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[9];
    int[] ss = new int[9];
    int tg=0;;
    System.out.print("nhap mot mang gom 9 phan tu: ");
    for(int i = 0;i<9;i++)
    {
        arr[i]= sc.nextInt();
    }
    System.out.println("do sai lech voi phan tu lon nhat:");
    for(int i=0;i<9;i++)
    {
            if(arr[i]>arr[0])
            {
                tg=arr[i];
            }
    }
    for(int i=0;i<9-1;i++)
    {
        ss[i]=tg-arr[i];
        if(tg!=arr[i])
        {
            System.out.println("ms["+i+"]: "+ss[i]);
        }
        
    }
    }
}
