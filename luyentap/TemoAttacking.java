package luyentap;
import java.util.Scanner;
public class TemoAttacking {
    public static int count(int a[],int n, int k)
    {
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = a[i]; j < a[i]+k; j++) {
                count+=1;
                if (a[i]==a[n-1])
                {
                    count+=k-1;
                    break;
                }
                    if (j==a[i+1])
                    {
                        count-=1;
                        break;
                    }
            }
        }
        return count;
    }
    public static void c2(int a[], int k)
    {
        int duration = k;
        for (int i = 0; i < a.length; i++) {
            if (a[i+1]-a[i]==1) duration+=1;
            else duration+=2;
        }
        System.out.println(duration);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so ptu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap cac ptu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("mhap k: ");
        int k= sc.nextInt();
        System.out.println(count(a,n,k));
    }
}
