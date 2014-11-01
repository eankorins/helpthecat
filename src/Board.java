import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by edgars on 11/1/14.
 */
public class Board extends JPanel{

    private Game game;
    private List<Tile> tiles;
    private Tile tileA, tileB;
    private int boardWidth, boardHeight;
    private int score, tilesLeft;
    private List<Color> allowedColors;

    public static boolean clickLock;


    public Board(int boardWidth, int boardHeight, Game game){
        super(new GridLayout(boardWidth, boardHeight));
        this.game = game;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.setPreferredSize(new Dimension(boardWidth * 75,boardHeight * 75));
        tiles = new ArrayList<Tile>();
        buildBoard();
    }
    public void buildBoard(){

        buildColorList();
        int boardSize = boardWidth * boardHeight;
        tilesLeft = boardSize;
        Random rand = new Random();
        int runs = boardSize / 2;
        int colorLength = allowedColors.size();
        for(int i = 0; i < runs; i++){
            Color c = allowedColors.get(rand.nextInt(colorLength));
            Tile t = new Tile(c, 75);
            Tile t2 = new Tile(c, 75);
            tiles.add(t);
            tiles.add(t2);
        }
        for(Tile t : tiles){
            this.add(t);
        }
    }
    public void buildColorList(){
        allowedColors = new ArrayList<Color>();
        allowedColors.add(Color.blue);
        allowedColors.add(Color.red );
        allowedColors.add(Color.cyan);
        allowedColors.add(Color.yellow);
        allowedColors.add(Color.orange);
        allowedColors.add(Color.pink);
    }

    public void click(Tile t){
        if(tileA == null){
            tileA = t;
        }
        else{
            tileB = t;
            clickLock = true;
            if(tileA.getColor() == tileB.getColor()){
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        tileA.take();
                        tileB.take();
                        tilesLeft -= 2;
                        score++;
                        if(tilesLeft == 0){
                            clickLock = false;
                            game.gameOver();
                        }
                        else{
                            tileA = tileB = null;
                            clickLock = false;
                        }
                    }
                });
            }
            else{
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        sleep(500);
                        tileA.click();
                        tileB.click();
                        tileA = tileB = null;
                        clickLock = false;
                    }
                });

            }
        }
    }

    public List<Tile> getTiles(){
        return tiles;
    }
    public int getScore(){
        return score;
    }
    public void sleep(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
