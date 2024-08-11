public class nqueens {
    public static void main(String args[]){
        // initiate chess board
        int n = 4;
        char[][] chessBoard = new char[n][n];
        
        // initialize chess board with empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }

        // start positioning queens
        position(chessBoard, 0);
    }

    public static void position(char[][] chessBoard, int row){
        // base case
        if (row == chessBoard.length){
            printBoard(chessBoard);
            return;
        }

        // recursion
        for(int j = 0; j < chessBoard.length; j++){
            if (isValid(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q'; // place queen
                position(chessBoard, row + 1);
                chessBoard[row][j] = '.'; // backtrack
            }
        }        
    }

    public static boolean isValid(char[][] chessBoard, int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        // check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        // check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] chessBoard) {
        for(int i = 0; i < chessBoard.length ; i++){
            for(int j = 0; j < chessBoard[i].length; j++){
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_________Chess Board_________");
    }
}
