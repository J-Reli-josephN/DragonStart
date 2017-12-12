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
    private String talk; 

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 250;
        y = 250;
        size = 1;
        talk = "hello";
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
        g.fillRect(x + size * 60, y , size * 20, size * 25);
        g.fillRect(x + size * 80, y , size * 30, size * 15);
        g.fillRect(x + size * 110, y , size * 30, size * 8);
        g.fillRect(x, y + size * 30, size * 22, size * 18);
        g.fillRect(x + size * 36, y + size * 30, size * 23, size * 18);
        g.fillRect(x, y + size * 48, size * 11, size * 18);
        g.fillRect(x + size * 54, y + size * 48, size * 12, size * 18);
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
