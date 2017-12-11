import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 250;
        y = 250;
        size = 1;
    }
    public Dragon(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    }
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.fillRect(x, y , size * 60, size * 30);
        g.fillRect(x * size + 30, y * size - 15, size * 30, size * 15);
        g.fillRect(x * size, y * size, size * 10, size * 7);
        g.fillRect(x, y , size * 60, size * 30);
        g.fillRect(x, y , size * 60, size * 30);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size;
    }
}
