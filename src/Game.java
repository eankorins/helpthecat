import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by edgars on 11/1/14.
 */
public class Game extends JFrame {

    Board board;
    public Game(){
        super("Game");
    }


    public void Initialize(){

        board = new Board(4,4, this);
        this.setTitle("Game");
        this.setMinimumSize(new Dimension(400, 400));
        this.add(board);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void newGame(){
        this.remove(board);
        SwingUtilities.updateComponentTreeUI(this);
        Initialize();
    }
    public void gameOver(){
        int result = JOptionPane.showConfirmDialog(this, "Congratz u didz it. New game?", "WIN!!!!!!", JOptionPane.YES_NO_OPTION);
        if(result == 0){
            this.newGame();
        }

    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Game g = new Game();
                g.Initialize();
                g.setVisible(true);
            }
        });

    }
}
