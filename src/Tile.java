import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by edgars on 11/1/14.
 */
public class Tile extends JButton{
    private Color faceColor, baseColor = Color.black;
    private int size;
    private boolean taken, clicked;

    public Tile(final Color faceColor, int size){
        super();
        this.faceColor = faceColor;
        this.size = size;
        this.setBackground(baseColor);
        this.setMinimumSize(new Dimension(size, size));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Board.clickLock){
                    Tile t = (Tile)e.getSource();
                    if(!t.isClicked() && !t.isTaken()){
                        t.click();
                        Board board = (Board)t.getParent();
                        board.click(t);
                    }

                }
            }
        });
    }


    public Color getColor(){
        return faceColor;
    }
    public boolean isTaken(){
        return taken;
    }
    public boolean isClicked(){ return clicked; }
    public void take(){
        taken = true;
        Color c = new Color(faceColor.getRed(), faceColor.getGreen(), faceColor.getBlue(), 200);
        setBackground(c);
        this.setEnabled(false);
    }
    public void click(){
        if(!clicked){
            this.setBackground(faceColor);
            this.setEnabled(false);
        }
        else{
            this.setBackground(baseColor);
            this.setEnabled(true);
        }
        clicked = !clicked;
    }
}
