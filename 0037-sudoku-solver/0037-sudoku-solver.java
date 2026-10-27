class Solution {
    boolean isValid(char[][]board,int row,int col ,int d)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==(char)(d+'0')) return false;
            if(board[row][i]==(char)(d+'0')) return false;
        }
        int start_i=(row/3)*3;
        int start_j=(col/3)*3;
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                if(board[start_i+k][start_j+l]==(char)(d + '0')) return false;
            }
        }
        return true;
    }
    boolean solve(char[][]board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(int k=1;k<=9;k++)
                    {
                        if(isValid(board,i,j,k))
                        {
                            board[i][j] = (char)(k + '0');
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
/*
int
5
'0'
char
Character '0', Unicode value 48
d + '0'
int
5 + 48 = 53
(char)(d + '0')
char
Character '5', Unicode value 53
*/