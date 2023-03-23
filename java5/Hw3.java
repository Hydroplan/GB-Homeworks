public class Main {
    
    private static final int BOARD_SIZE = 8;
    private static final char QUEEN = 'x';
    private static final char EMPTY = '0';
    
    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        initializeBoard();
        placeQueens(0);
        printBoard();
    }
    
    private static void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
    }
    
    private static boolean placeQueens(int row) {
        if (row == BOARD_SIZE) {
            return true;
        }
        
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isSafe(row, col)) {
                board[row][col] = QUEEN;
                if (placeQueens(row+1)) {
                    return true;
                }
                board[row][col] = EMPTY;
            }
        }
        
        return false;
    }
    
    private static boolean isSafe(int row, int col) {
        // Check row
        for (int c = 0; c < BOARD_SIZE; c++) {
            if (board[row][c] == QUEEN) {
                return false;
            }
        }
        
        // Check column
        for (int r = 0; r < BOARD_SIZE; r++) {
            if (board[r][col] == QUEEN) {
                return false;
            }
        }
        
        // Check diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == QUEEN) {
                return false;
            }
        }
        for (int r = row, c = col; r >= 0 && c < BOARD_SIZE; r--, c++) {
            if (board[r][c] == QUEEN) {
                return false;
            }
        }
        
        return true;
    }
    
    private static void printBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

}