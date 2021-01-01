package programmers.level2.p38_friends4block;

import java.util.ArrayList;

class Solution {
    public class Pos{
        int m;
        int n;
        public Pos(int m, int n){
            this.m = m;
            this.n = n;
        }
    }

    public boolean chkSquare(char [][] board, int m, int n){
        char []b = new char[4];
        b[0] = board[m][n];
        b[1] = board[m + 1][n];
        b[2] = board[m][n + 1];
        b[3] = board[m + 1][n + 1];
        for(int i = 1; i < 4; i++){
            if(b[i] != b[i - 1])
                return false;
        }
        return true;
    }
    public void setZero(char [][]board, int m, int n){
        board[m][n] = '0';
        board[m + 1][n] = '0';
        board[m][n + 1] = '0';
        board[m + 1][n + 1] = '0';
    }
    public int cntBlock(char [][] board, int m, int n){
        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '0')
                    cnt++;
            }
        }
        return cnt;
    }
    public int fndNonZero(char [][]board, int m, int n){
        int i = m;
        while(i >= 0 && board[i][n] == '0' && board[i][n] != '1'){
            i--;
        }
        return i;
    }
    public void eraseBlock(char [][]board, int m, int n){
        for(int i_m = m - 1; i_m >= 0; i_m--){
            for(int i_n = 0; i_n < n; i_n++){
                if(board[i_m][i_n] == '0'){
                    int nonZeroIdx = fndNonZero(board, i_m, i_n);
                    if(nonZeroIdx >= 0){
                        board[i_m][i_n] = board[nonZeroIdx][i_n];
                        board[nonZeroIdx][i_n] = '0';
                    }
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '0')
                    board[i][j] = '1';
            }
        }
    }
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        ArrayList<Pos> posList = null;
        char [][] b = new char[m][n];
        for(int i = 0; i < m; i++){
            b[i] = board[i].toCharArray();
        }
        do{
            posList = new ArrayList<>();
            for(int i_m = 0; i_m < m - 1; i_m++){
                for(int i_n = 0; i_n < n - 1; i_n++){
                    if(b[i_m][i_n] != '1' && chkSquare(b, i_m, i_n)){
                        posList.add(new Pos(i_m, i_n));
                    }
                }
            }
            for(Pos p : posList){
                setZero(b, p.m, p.n);
            }
            answer += cntBlock(b, m, n);
            eraseBlock(b, m, n);
        }while(posList.size() != 0);
        return answer;
    }

    public int solution2(int m, int n, String[] board) {
        int answer = 0;
        char[][] boardArr = new char[m+2][n+2];
        int answerbefor = -1;
        for(int  i =0; i<m; i++){
            for(int  j =0; j<n; j++){
            boardArr[i][j]= board[i].toCharArray()[j];
           }  
        }
        while(true){
            if(answer == answerbefor){
                break;
            }
            answerbefor = answer;
            boolean[][] boardCleaner = new boolean[m+2][n+2];
            for(int  i =0; i<m; i++){
                for(int  j =0; j<n; j++){
                    if(boardArr[i][j]==boardArr[i][j+1]&&boardArr[i][j]!=' '){
                        if(boardArr[i][j]==boardArr[i+1][j+1]){
                            if(boardArr[i][j]==boardArr[i+1][j]){
                                boardCleaner[i][j] = true;
                                boardCleaner[i+1][j] = true;
                                boardCleaner[i+1][j+1] = true;
                                boardCleaner[i][j+1] = true;
                            }
                        }
                    }
                }
            }
            for(int  i =0; i<m; i++){
                for(int  j =0; j<n; j++){
                    if(boardCleaner[i][j]){
                        boardArr[i][j] = ' ';
                        answer++;
                        boardCleaner[i][j] = false;
                    }
                }  
            }
            for(int k = 0; k<m; k++){
                for(int  i =m; i>0; i--){
                    for(int  j =0; j<n; j++){
                        if(boardArr[i][j]==' '){
                            boardArr[i][j] = boardArr[i-1][j];
                            boardArr[i-1][j] = ' ';
                        }
                    }  
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String [] board = {"CCBDE", 
                           "AAADE", 
                           "AAABF", 
                           "CCBBF"};
        int m = 4;
        int n = 5;
        new Solution().solution(m, n, board);
    }
}