// Last updated: 09/07/2026, 15:08:29
class Solution {
    public int numRookCaptures(char[][] board) {
        int attack=0;
        //to find rook
        int row=0,col=0;
        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; j++) {
                if(board[i][j]=='R') {
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        //upward
        int r=row; int c=col;
        while(r>=0 && board[r][c]!='B') {
            if(board[r][c]=='p') {
                attack++;
                break;
            }
            r--;
        }
        //downward
        r=row; c=col;
        while(r<=7 && board[r][c]!='B') {
            if(board[r][c]=='p') {
                attack++;
                break;
            }
            r++;
        }
        //left side
        r=row; c=col;
        while(c>=0 && board[r][c]!='B') {
            if(board[r][c]=='p') {
                attack++;
                break;
            }
            c--;
        }
        //right side
        r=row; c=col;
        while(c<=7 && board[r][c]!='B') {
            if(board[r][c]=='p') {
                attack++;
                break;
            }
            c++;
        }
        return attack;
    }
}