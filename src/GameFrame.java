import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameFrame extends JFrame {
    public GameFrame(){
        super("TIC TAC TOE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(500,500);
        setLocation(100,100);
        setLayout(new GridLayout(3,3));

        JButton b11 = new JButton("");
        b11.setFont(new Font("Arial",Font.PLAIN,150));
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(0,0)){
                    Board.changeButtonSymbol(b11);
                    Board.makeMove(0,0);
                    checkWinResult();
            }}
        });
        add(b11);

        JButton b12 = new JButton("");
        b12.setFont(new Font("Arial",Font.PLAIN,150));
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(0,1)){
                    Board.changeButtonSymbol(b12);
                    Board.makeMove(0,1);
                    checkWinResult();
            }}
        });
        add(b12);

        JButton b13 = new JButton("");
        b13.setFont(new Font("Arial",Font.PLAIN,150));
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(0,2)){
                    Board.changeButtonSymbol(b13);
                    Board.makeMove(0,2);
                    checkWinResult();
            }}
        });
        add(b13);

        JButton b21 = new JButton("");
        b21.setFont(new Font("Arial",Font.PLAIN,150));
        b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(1,0)){
                    Board.changeButtonSymbol(b21);
                    Board.makeMove(1,0);
                    checkWinResult();
            }}
        });
        add(b21);

        JButton b22 = new JButton("");
        b22.setFont(new Font("Arial",Font.PLAIN,150));
        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(1,1)){
                    Board.changeButtonSymbol(b22);
                    Board.makeMove(1,1);
                    checkWinResult();
            }}
        });
        add(b22);

        JButton b23 = new JButton("");
        b23.setFont(new Font("Arial",Font.PLAIN,150));
        b23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(1,2)){
                    Board.changeButtonSymbol(b23);
                    Board.makeMove(1,2);
                    checkWinResult();
                }

            }
        });
        add(b23);

        JButton b31 = new JButton("");
        b31.setFont(new Font("Arial",Font.PLAIN,150));
        b31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(2,0)){
                    Board.changeButtonSymbol(b31);
                    Board.makeMove(2,0);
                    checkWinResult();

            }}
        });
        add(b31);

        JButton b32 = new JButton("");
        b32.setFont(new Font("Arial",Font.PLAIN,150));
        b32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(2,1)){
                    Board.changeButtonSymbol(b32);
                    Board.makeMove(2,1);
                    checkWinResult();

            }}
        });
        add(b32);

        JButton b33 = new JButton("");
        b33.setFont(new Font("Arial",Font.PLAIN,150));
        b33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Board.checkIfValidMove(2,2)){
                    Board.changeButtonSymbol(b33);
                    Board.makeMove(2,2);
                    checkWinResult();
            }}
        });
        add(b33);


        setVisible(true);
    }


public void checkWinResult(){
    if (Board.didIwin()){
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "You Won!");
        closeCurrentFrameOpenNewOne();
    }
    else if(Board.endOfGame()&&!Board.didIwin()){
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "It's a draw.");
        closeCurrentFrameOpenNewOne();
    }
}


public void closeCurrentFrameOpenNewOne(){
dispose();
GameFrame closeCurrentWindow = new GameFrame();
closeCurrentWindow.setVisible(true);
Board.fillBoard(Board.board);
}

    }

