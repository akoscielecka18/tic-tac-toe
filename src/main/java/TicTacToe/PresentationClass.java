package TicTacToe;
import java.util.Scanner;

public class PresentationClass {
    public static void main(String[] args){

        char[][] board = new char[3][3];
        WinDefeatTie winDefeatTie = new WinDefeatTie();
        System.out.println("Welcome in the game! \nIn which box do you want to start (1-9)?");
        while(true){
            firstPlayerTurn(board);
            if(winDefeatTie.isGameFinished(board)){
                break;
            }
            secondPlayerTurn(board);
            if(winDefeatTie.isGameFinished(board)){
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
