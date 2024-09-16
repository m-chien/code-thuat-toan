package luyentap;

public class UCLN_DeQuy {
    public static int check(int a , int b)
    {
        int c = b % a;
        if (c==0) return a;
        else return check(c,a);
    }
    public static void main(String[] args) {
        System.out.println(check(105,252));
    }
}
