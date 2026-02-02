// class Solution {
//     public static boolean isSafe(int[][] sudoku,int row,int col,int digit){
//         //column
//         for(int i=0;i<=8;i++){
//             if(sudoku[i][col]==digit){
//                 return false;
//             }
//         }
//         //row
//         for(int j=0;j<=8;j++){
//             if(sudoku[row][j]==digit){
//                 return false;
//             }
//         }
//         //grid
//         int sr = (row/3)*3;
//         int sc = (col/3)*3;
//         for(int i=0;i<sr+3;i++){
//             for(int j=0;j<sc+3;j++){
//                 if(sudoku[i][j]==digit){
//                 return false;
//                 }   
//             }
//         }
//         return true;
//     }
//      public static void printSoduku(int soduku[][]){
//         for(int i = 0; i<9;i++){
//             for(int j = 0;j<9;j++){
//                 System.out.print(sudoku[i][j]+" ");
//             }
//             System.out.println();
//         }
//      }






//     public void solveSudoku(char[][] sudoku) {
//         //base case
//         if(row==9&&col==0){
//             return true;
//         }

//         //recursion

//         int nextRow=row;
//         int nextCol=col+1;
//         if(col+1==9){
//             nextRow=row+1;
//             nextCol=0;
//         }

//         if(sudoku[row][col]!=0){
//             return solveSudoku(sudoku,nextRow,nextCol);
//         }

//         for(int digit=1;digit<=9;digit++){
//             if(isSafe(sudoku,row,col,digit)){
//                 sudoku[row][col]=digit;
//                 if(solveSudoku(sudoku,nextRow,nextCol)){//solution exists
//                     return true;
//             }
//             sudoku[row][col]=0;
//         }
//         return false;
//     }
// }
class Solution {

    // Function to check if placing the digit is safe at (row, col)
    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;
            }
        }
        
        // Check the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }
        
        // Check the 3x3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        
        return true;
    }

    // Backtracking function to solve the sudoku
    private boolean solveSudokuHelper(char[][] board, int row, int col) {
        // Base case: if we have filled the entire board
        if (row == 9) {
            return true; // The board is completely filled
        }
        
        // If we've reached the end of the row, go to the next row
        if (col == 9) {
            return solveSudokuHelper(board, row + 1, 0);
        }
        
        // If the current cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            return solveSudokuHelper(board, row, col + 1);
        }
        
        // Try placing digits 1 to 9 in the current empty cell
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit; // Place the digit
                
                // Recursively try to solve the rest of the board
                if (solveSudokuHelper(board, row, col + 1)) {
                    return true; // If solution is found, return true
                }
                
                // Backtrack if placing digit didn't lead to a solution
                board[row][col] = '.'; // Reset the cell
            }
        }
        
        return false; // If no valid digit can be placed, return false
    }
    
    // Function to solve the sudoku puzzle
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board, 0, 0); // Start solving from the top-left cell
    }
}


