package TicTacToe;
import java.util.ArrayList;

import static TicTacToe.PresentationClass.printBoard;

public class WinDefeatTie {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();

    public static void nextMove(char[][] board, int position, String player1){
        char symbol = ' ';

        if(player1.equals("first")){
            symbol = 'O';
            playerPositions.add(position);
        }else if(player1.equals("second")){
            symbol ='X';
            playerPositions.add(position);
        }
        switch (position){
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][1] = symbol;
                break;
            case 3:
                board[0][2] = symbol;
                break;
            case 4:
                board[1][0] = symbol;
                break;
            case 5:
                board[1][1] = symbol;
                break;
            case 6:
                board[1][2] = symbol;
                break;
            case 7:
                board[2][0] = symbol;
                break;
            case 8:
                board[2][1] = symbol;
                break;
            case 9:
                board[2][2] = symbol;
                break;

            default:
                break;

        }
        printBoard(board);
    }
}
