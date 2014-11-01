import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by edgars on 11/1/14.
 */
public class Game extends JFrame {

    Board board;
    int width, height, tileSize;
    public Game(int width, int height, int tileSize){
        super("Game");
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;
    }


    public void Initialize(){

        board = new Board(width, height, tileSize, this);
        this.setTitle("Game");
        this.setMinimumSize(new Dimension(height * tileSize, width * tileSize));
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
                Game g = new Game(10,10, 100);
                g.Initialize();
                g.setVisible(true);
            }
        });

    }
}
