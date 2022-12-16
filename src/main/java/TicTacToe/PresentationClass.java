package TicTacToe;
import java.util.ArrayList;
import java.util.Scanner;

public class PresentationClass {

    public static void main(String[] args){
        ArrayList<Integer> playerPositions = new ArrayList<Integer>();
        char[][] board = new char[3][3];
        BoardClass boardClass = new BoardClass();
        System.out.println("Welcome in the game! \nIn which box do you want to start (1-9)?");
        while(true){
            firstPlayerTurn(board);

            if(boardClass.isGameOver()){
                break;
            }
            secondPlayerTurn(board);
            if(boardClass.isGameOver()){
                break;
            }
            }
        }

    static void printBoard(char[][] board) {
        int dim = board.length;

        for (int row = 0; row < dim; row++) {
            System.out.print( "| ");
            for (int column = 0; column < dim; column++) {
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
        }
    }

    static void firstPlayerTurn(char[][] board) {
        ArrayList<Integer> playerPositions = new ArrayList<Integer>();
        WinDefeatTie winDefeatTie = new WinDefeatTie();
        Scanner scanner = new Scanner(System.in);
        String s;
        while(true)
            try {
                s = scanner.nextLine();
                int box = Integer.parseInt(s);
                winDefeatTie.nextMove(board, box, "first");
                break;
            } catch (Exception e) {
                System.out.println("Wrong number");
                continue;
            }
    }

    static void secondPlayerTurn(char[][] board) {
        ArrayList<Integer> playerPositions = new ArrayList<Integer>();
        WinDefeatTie winDefeatTie = new WinDefeatTie();
        Scanner scanner = new Scanner(System.in);
        String a;
        while (true){
            try {
                a = scanner.nextLine();
                int box1 = Integer.parseInt(a);
                winDefeatTie.nextMove(board, box1, "second");
                break;
            } catch (Exception e) {
                System.out.println("Wrong number");
                continue;
            }
        }
    }
}
