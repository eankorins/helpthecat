import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

/**
 * Created by edgars on 11/1/14.
 */
public class Board extends JPanel{

    private Game game;
    private List<Tile> tiles;
    private Tile tileA, tileB;
    private int boardWidth, boardHeight;
    private int score, tileSize, tilesLeft;
    private List<Color> allowedColors;

    public static boolean clickLock;


    public Board(int boardWidth, int boardHeight, int tileSize, Game game){
        super(new GridLayout(boardWidth, boardHeight));
        this.game = game;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.tileSize = tileSize;
        this.setMinimumSize(new Dimension(boardHeight * tileSize, boardWidth * tileSize));
        tiles = new ArrayList<Tile>();
        buildBoard();
    }
    public void buildBoard(){

        buildColorList();
        int boardSize = boardWidth * boardHeight;
        tilesLeft = boardSize;
        Random rand = new Random();
        int colorLength = allowedColors.size();
        int count = 0;

        while(count < boardSize){
            Color c = allowedColors.get(count % colorLength);
            Tile t = new Tile(c, 75);
            Tile t2 = new Tile(c, 75);
            tiles.add(t);
            tiles.add(t2);
            count += 2;
        }
        Collections.shuffle(tiles, rand);
        Collections.shuffle(tiles, rand);
        Collections.shuffle(tiles, rand);
        Collections.shuffle(tiles, rand);
        Collections.shuffle(tiles, rand);
        Collections.shuffle(tiles, rand);

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
        allowedColors.add(Color.green);
        allowedColors.add(Color.magenta);
        allowedColors.add(Color.white);
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
