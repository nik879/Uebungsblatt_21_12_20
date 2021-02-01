package Beispiel_3;

public class TicTacToeHelper {
    public static void main(String[] args) {
        char[][] Board = generateEmptyBoard(2);
        char[][] falseBoard = {{'A', 'A','A'},{'A', 'A','A'},{'A', 'A','A'} };
        System.out.println(validateBoard(falseBoard, 3));
        System.out.println("----------------");

        char[][] Testboard = generateEmptyBoard(3);
        printBoard(Testboard);
        Testboard[0][0] = 'X';
        Testboard[0][1] = 'X';
        Testboard[0][2] = 'O';
        Testboard[1][0] = 'X';
//        Testboard[1][1] = ' ';
        Testboard[1][2] = 'O';
        Testboard[2][0] = 'O';
//        Testboard[2][1] = ' ';
        Testboard[2][2] = 'X';
        printBoard(Testboard);


        System.out.println("----------------");
        char[][] Testboard1 = {{'X', 'X', '0'}, {'X', ' ', 'O'}, {'O', ' ', 'X'}};
        printBoard(Testboard1);

    }

    public static char[][] generateEmptyBoard(int size) {
        char[][] Board= new char[size][size] ;
        for (char[] chars : Board) {
            for (char aChar : chars) {
                chars[aChar] = ' ';
            }
        }
        return Board;
    }

    public static boolean validateBoard(char[][] board, int size) {
        int counterX = 0, counterY = 0;
        for (int i = 0; i < board.length; i++) {
            counterX++;
        }
        for (int i = 0; i < board[0].length; i++) {
            counterY++;
        }
        if (size == counterX || size == counterY) {
            if (counterX == counterY) {
                return true;
            } else return false;
        } else return false;

    }

    public static void printBoard(char[][] board) {
        int vct = -1, hzt = 0;
//        for (char[] chars : board) {
//            vct++;
//            hzt=0;
//            for (char aChar : chars) {
//                System.out.print(vct + "" + hzt + ":");
//                System.out.print(chars);
//                System.out.println("");
//                hzt++;
//            }
//        }

        for (int i = 0; i < board.length; i++) {
            vct++;
            hzt=0;
            for (int j = 0; j < board.length; j++) {
                System.out.print(vct + "" + hzt + ":" + board[i][j]);
                System.out.println(" ");
                hzt++;
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");

            }
            System.out.println("");
        }

    }
}
