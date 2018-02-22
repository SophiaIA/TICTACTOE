import java.awt.*;


public class GamePlay {
    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame();
            }
        });

        Board B=new Board();
        Board.fillBoard(B.board);


    }

}
