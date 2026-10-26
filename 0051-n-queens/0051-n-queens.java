class Solution {
    public List<List<String>> res = new ArrayList<>();

    boolean isValid(List<String> board, int row, int col) {
        //upward
        for (int i = row; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        //right diagonal
        for (int i = row, j = col; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;
    }

    void solve(List<String> board, int row, int n) {
        if (row >= n) {
            res.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                //This is wrong as string is immutable
                // board.get(row).charAt(col)='Q';
                // solve(board,row+1,n);
                // board.get(row).charAt(col)='.';
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());
                solve(board, row + 1, n);
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>(n);
        if (n == 0)
            return res;
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append('.');
            }
            board.add(row.toString());
        }
        solve(board, 0, n);
        return res;
    }
}