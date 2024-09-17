package caro;

import java.util.Scanner;

class game {
    Scanner sc = new Scanner(System.in);
    board board1 = new board();
    player player1 = new player("X");
    player player2 = new player("O");
    player firstplayer = player1;
    public void play()
    {
        while (true)
        {
            int n=-1;
            while (n>8 || n<0)
            {
                System.out.println("enter the square you wanna tick: ");
                n= sc.nextInt();sc.nextLine();
            }
            if (board1.updateboard(n,firstplayer.type))
            {
                board1.board();
                if (board1.check(firstplayer.type))
                {
                    System.out.println(firstplayer.name + " win!" );
                }
                else {
                    if(firstplayer == player1) firstplayer = player2;
                    else firstplayer = player1;
                }
            }
        }

    }
    public static void main(String[] args) {
        game game = new game();
        game.play();
    }
}
class board {
    private String[] bang = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void board() {
        System.out.println("   " + "| 1" + " | " + "2" + " | " + "3");
        System.out.println(" 1 |" + bang[0] + "  | " + bang[1] + " | " + bang[2]);
        System.out.println("----------------");
        System.out.println(" 2 |" + bang[3] + "  | " + bang[4] + " | " + bang[5]);
        System.out.println("----------------");
        System.out.println(" 3 |" + bang[6] + "  | " + bang[7] + " | " + bang[8]);
    }

    public boolean updateboard(int position, String type)
    {
        if (bang[position]== " ")
        {
            bang[position]= type;
            return true;
        }
        else
        {
            System.out.println("position already selected!");
            return false;
        }
    }

    public boolean check(String type) {
        if ((bang[0] == type && bang[1] == type && bang[2] == type)
                || (bang[3] == type && bang[4] == type && bang[5] == type)
                || (bang[6] == type && bang[7] == type && bang[8] == type)
                || (bang[0] == type && bang[3] == type && bang[6] == type)
                || (bang[1] == type && bang[4] == type && bang[7] == type)
                || (bang[2] == type && bang[5] == type && bang[8] == type)
                || (bang[0] == type && bang[4] == type && bang[8] == type)
                || (bang[2] == type && bang[4] == type && bang[6] == type)) {
            return true;
        } else {
            return false;
        }
    }
}
class player {
    String name;
    String type;
    public player(String type) {
        this.type=type;
        Scanner sc = new Scanner(System.in);
        if (type.equals("X")) {
            System.out.print("you choose X, please enter your name: ");
            this.name = sc.nextLine();
        } else if (type.equals("O")) {
            System.out.print("you choose O, please enter your name: ");
            this.name = sc.nextLine();
        }
    }
}

