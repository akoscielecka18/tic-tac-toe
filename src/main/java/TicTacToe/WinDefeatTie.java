package TicTacToe;
import static TicTacToe.PresentationClass.printBoard;

public class WinDefeatTie {

    static boolean canIPlayHere(char[][] board, int position) {

        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    static void nextMove(char[][] board, int position, String player1){



        char symbol = ' ';

        if(player1.equals("first")){
            symbol = 'O';
        }else if(player1.equals("second")){
            symbol ='X';
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

    static BoardClass boardClass = new BoardClass();
    public boolean isGameFinished(char[][] board){


        if(boardClass.isGameOver(board, 'O')){
            System.out.println("Player first wins!");
            return true;
        }
        if (boardClass.isGameOver(board, 'X')){
            System.out.println("Player second wins!");
            return true;
        }

//        for(int i = 0; i<board.length; i++ ){
//            for(int j =0; j<board[i].length; j++){
//                if(board[i][j] == 'X' && board[i][j]=='O'){
//                    System.out.println("It is a tie");
//                    return false;
//                }
//            }
//        }
        if(boardClass.isATie(board)){
            System.out.println("It is a tie");
            return true;
        }
        return false;
    }
}
