package luyentap;

import java.util.Scanner;

public class PredictTheWinner {
    player player1 = new player("A");
    player player2 = new player("B");
    player currentplayer = player1;
    player nextplayer = player2;
    public  void sosanh(int a[], int n)
    {
        int count=n;
        int i=0;
        int j =n-1;
        while (count!=2)
        {
            if (a[i+1]-a[i]<a[j-1]-a[j])
            {
                currentplayer.diem+=a[i];
                i+=1;
                count-=1;
            }
            else {
                currentplayer.diem+=a[j];
                j-=1;
                count-=1;
            }
            if (currentplayer == player1)
            {
                currentplayer = player2;
                nextplayer = player1;
            }
            else
            {
                currentplayer = player1;
                nextplayer = player2;
            }
        }
        if (a[i]<a[j])
        {
            currentplayer.diem+=a[j];
            nextplayer.diem +=a[i];
        }
        else
        {
            currentplayer.diem+=a[i];
            nextplayer.diem +=a[j];
        }
        System.out.println(player1.name+":"+player1.diem+" | "+player2.name+":"+player2.diem);
        if(player1.diem <player2.diem) System.out.println(player1.name +" lose"+"\n"+player2.name+" win");
        else System.out.println(player1.name +" win"+"\n"+player2.name+" lose");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("nhap lan luot cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
           a[i]= sc.nextInt();
        }
        PredictTheWinner p1 = new PredictTheWinner();
        p1.sosanh(a,n);
    }
}
class player {
    String name;
    String type;
    int diem=0;
    public player(String type) {
        this.type=type;
        Scanner sc = new Scanner(System.in);
        if (type.equals("A")) {
            System.out.print("you go first, please enter your name: ");
            this.name = sc.nextLine();
        } else if (type.equals("B")) {
            System.out.print("you go second, please enter your name: ");
            this.name = sc.nextLine();
        }
    }
}
