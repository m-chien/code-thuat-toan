package luyentap;
// dung de quy
public class TongChuSoChan {
    public static int tong(int n)
    {
        int count= n%10;
        int tinh=0;
        if (n==0) return tinh;
        if(count%2!=0)
            return tong(n/10);
        else
        {
            tinh+=count;
            return tinh + tong(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(tong(31886));

    }
}
