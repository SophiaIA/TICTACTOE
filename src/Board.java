import javax.swing.*;
import java.awt.*;

public class Board {
    static int board[][];
    public static int currentSymbol;
    final static int x=1;
    final static int o=2;
    public Board(){
        board=new int[3][3];
        currentSymbol=x;
    }

    public static void fillBoard(int[][] board){
        for (int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                board[i][j]=0;
            }
        }
    }

    protected static int getCurrentSymbol(){
        return currentSymbol;
    }

    public static boolean checkIfValidMove(int i, int j){
        if(board[i][j]==0){
            return true;
        }
        else return false;
    }

    public static void makeMove(int i, int j){
        if(checkIfValidMove(i,j)){
            board[i][j]=currentSymbol;
            /*
            if (didIwin()){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "You Won!");

            }
            else if(endOfGame()&&!didIwin()){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "It's a draw.");

            }
            */
            changeCurrentSymbol();
        }
    }

    public static boolean endOfGame() {
        for (int a[] : board) {
            for (int b : a) {
                if (b==0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean didIwin(){
        if((board[0][0]==board[0][1] && board[0][0]==board[0][2]&&board[0][0]!=0)|| (board[1][0]==board[1][1] && board[1][0]==board[1][2]&&board[1][0]!=0) ||
                        (board[2][0]==board[2][1] && board[2][0]==board[2][2]&& board[2][0]!=0) || (board[0][0]==board[1][0] && board[0][0]==board[2][0]&&board[0][0]!=0)
                        || (board[0][1]==board[1][1] && board[0][1]==board[2][1]&&board[0][1]!=0) || (board[0][2]==board[1][2] && board[0][2]==board[2][2]&&board[0][2]!=0)
                        || (board[0][0]==board[1][1] && board[0][0]==board[2][2]&&board[0][0]!=0) || (board[0][2]==board[1][1] && board[0][2]==board[2][0]&&board[0][2]!=0)
                ) {
            return true;
                }
                return false;
        }

    public static void changeButtonColor(JButton button){
        button.setBackground(Color.YELLOW);
    }

    public static void changeCurrentSymbol(){
        if(currentSymbol==x){
            currentSymbol=o;
        }
        else currentSymbol=x;
    }


    public static void changeButtonSymbol(JButton b){
        //if(b.getText().equals("X")|| b.getText().equals("O")){
        //    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Field taken!");}
        if (getCurrentSymbol()==x){
            b.setText("X");    }
        else b.setText("O");
    }


}



