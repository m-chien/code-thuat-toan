package keobuabao;
import java.util.Scanner;

public class chon {
    Scanner sc = new Scanner(System.in);
    private String user;
    private String robot;
    public void choose()
    {
        do {
            System.out.print("chon keo,bua,bao: ");
            user = sc.nextLine();
        }while(user.equals("keo") || user.equals("bao") || user.equals("bua"));
        int randomNumber = (int) (Math.random() * 3 + 1);
        if(randomNumber==1)
        {
            robot = "keo";
        }
        else if(randomNumber ==2)
        {
            robot = "bua";
        }
        else
        {
            robot = "bao";
        }
        System.out.println("robot chon: "+robot);
        if(user.equals(robot))
        {
            System.out.println("draw");
        }
        else if(user.equals("bao") && robot.equals("bua"))
        {
            System.out.println("win");
        }
        else if(user.equals("keo") && robot.equals("bao"))
        {
            System.out.println("win");
        }
        else if(user.equals("bua") && robot.equals("keo"))
        {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }

    public static void main(String[] args) {
        chon dt1 = new chon();
        dt1.choose();
    }
}
