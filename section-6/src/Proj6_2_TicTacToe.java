import java.util.*;
public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    }//main

    public static  void runGame(){
        String winner="";
        boolean turn=true;
        int theRow=0;
        int theCol=0;
        String[][] Board=new String[3][3];

        initializeGameBoard(Board);

        printBoard(Board);

        while (winner.equals("")){
            if(turn)
                System.out.println("It's X turn");
            else
                System.out.println("It's O turn");

            Input(turn,Board);
            System.out.println();

            printBoard(Board);
            winner=getWinner(Board);
            turn=!turn;

            if(winner.equals("") && isBoardFull(Board)){
                winner="Cat";
            }
        }
        System.out.println();

        if(winner.equals("Cat"))
            System.out.println("Draw");
        else
            System.out.println("The Winner is "+winner);

    }//runGame

    public static void initializeGameBoard(String[][] Board){
        for(int i=0;i<Board.length;i++){
            for(int j=0;j< Board[i].length;j++){
                Board[i][j]=" ";
            }
        }
    }//initialize

    public static void printBoard(String[][] Board){
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board[i].length;j++){
                System.out.print(Board[i][j]);
                if(j<2)
                    System.out.print(" | ");
            }
            System.out.println();
            if(i<2){
                System.out.print("_ _ _ _ _");
            }
            System.out.println();
        }
    }//print

    public static void Input(boolean turn,String[][] Board){
        Scanner sc=new Scanner(System.in);
        int row=-1,col=-1;
        boolean repeat=true;
        while (repeat){
            System.out.println("Enter row and col");
            row=sc.nextInt();
            col=sc.nextInt();
            sc.nextLine();

            if(row>=0 && row<=2 && col>=0 && col<=2){
                if(!cellAlreadyOccupied(row,col,Board)){
                    repeat=false;
                }
                else{
                    System.out.println("cell is already Occupied");
                }
            }
        }
        if(turn){
            Board[row][col]="X";
        }
        else{
            Board[row][col]="O";
        }
    }//input

    public static boolean cellAlreadyOccupied(int row,int col,String[][] Board){
        return  !Board[row][col].equals(" ");
    }//cellAlreadyOccupied

    public static String getWinner(String[][] Board){
        final int ROWS=Board.length;
        final int COLS=Board[0].length;

        for(int i=0;i<ROWS;i++){
            if(!Board[i][0].equals(" ") && Board[i][0].equals(Board[i][1]) && Board[i][1].equals(Board[i][2])){
                return Board[i][0];
            }
        }

        for(int i=0;i<COLS;i++){
            if(!Board[0][i].equals(" ") && Board[0][i].equals(Board[1][i]) && Board[1][i].equals(Board[2][i])){
                return Board[0][i];
            }
        }

        if(!Board[0][0].equals(" ") && Board[0][0].equals(Board[1][1]) && Board[1][1].equals(Board[2][2])){
            return Board[0][0];
        }

        if(!Board[2][0].equals(" ") && Board[2][0].equals(Board[1][1]) && Board[1][1].equals(Board[0][2])){
            return Board[2][0];
        }

        return "";
    }//getWinner

    public static boolean isBoardFull(String[][] Board){
        int count=0;
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board[i].length;j++){
                if(!Board[i][j].equals(" "))
                    count++;
            }
        }
        return count==9;
    }//isBoardFull

}
