// 
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with '.' to represent empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Start the backtracking process
        backtrack(board, 0, result);
        
        return result;
    }

    private void backtrack(char[][] board, int row, List<List<String>> result) {
        // If we've placed all queens, add the current configuration to the result
        if (row == board.length) {
            result.add(convertBoardToList(board));
            return;
        }
        
        // Try placing the queen in every column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place the queen
                backtrack(board, row + 1, result); // Recurse to place queens in the next row
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Check if it's safe to place a queen at board[row][col]
    private boolean isSafe(char[][] board, int row, int col) {
        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Convert the board to a list of strings for the result
    private List<String> convertBoardToList(char[][] board) {
        List<String> boardList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            boardList.add(new String(board[i])); // Convert row to string and add it to the list
        }
        return boardList;
    }
}
