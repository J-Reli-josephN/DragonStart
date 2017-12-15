import java.awt.*;
import java.util.Scanner;
 
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       Scanner cc = new Scanner(System.in);
       System.out.print("Hi, how big do you want your dragon: ");
       int size = cc.nextInt();
       DrawingPanel panel = new DrawingPanel(500 + size * 2, 500 + size * 2);
       Graphics g = panel.getGraphics();
       
       Dragon fam = new Dragon();
       
       fam.drawDragon(g);
     
       System.out.println("fam");
       
       
    }
}
