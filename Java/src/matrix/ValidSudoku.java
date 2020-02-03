package matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        Set<Character> lista = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (lista.contains(board[i][j])) return false;
                if (board[i][j] != '.'){
                    lista.add(board[i][j]);
                }
            }
            lista.clear();
        }

        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (lista.contains(board[i][j])) return false;
                if (board[i][j] != '.'){
                    lista.add(board[i][j]);
                }
            }
            lista.clear();
        }

        int blocoLinha = 0;
        int blocoColuna = 0;
        while (blocoColuna < board.length && blocoLinha < board.length){
            for (int i = blocoLinha; i <= blocoLinha+2; i++) {
                for (int j = blocoColuna; j <= blocoColuna + 2; j++) {
                    if (lista.contains(board[i][j])) return false;
                    if (board[i][j] != '.') {
                        lista.add(board[i][j]);
                    }
                }
            }
            lista.clear();

            if (blocoColuna == 6){
                blocoLinha+= 3;
                blocoColuna=0;
            } else {
                blocoColuna+= 3;
            }
        }

        return true;

    }

    public static void main(String[] args) {
/*
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };*/
        char[][] board = new char[][]{
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}
        };

/*
[
{'.','.','4','.','.','.','6','3','.'},
{'.','.','.','.','.','.','.','.','.'},
{'5','.','.','.','.','.','.','9','.'},
{'.','.','.','5','6','.','.','.','.'},
{'4','.','3','.','.','.','.','.','1'},
{'.','.','.','7','.','.','.','.','.'},
{'.','.','.','5','.','.','.','.','.'},
{'.','.','.','.','.','.','.','.','.'},
{'.','.','.','.','.','.','.','.','.'}
]

        
 */
        
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(board));
    }
}
