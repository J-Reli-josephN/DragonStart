import java.awt.*;
 
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       DrawingPanel panel = new DrawingPanel(500,500);
       Graphics g = panel.getGraphics();
       
       Dragon fam = new Dragon();
       
       fam.drawDragon(g);
     
       System.out.println("fam");
       
       
    }
}
