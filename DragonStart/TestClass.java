import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
 
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
       System.out.print("How many dragons: ");
       int shadowClown = cc.nextInt();
       System.out.print("where do you want your dragon (x enter, y enter): ");
       int xx = cc.nextInt();
       int yy = cc.nextInt();
       DrawingPanel panel = new DrawingPanel(500 + size * 10, 500 + size * 10);
       Graphics g = panel.getGraphics();
       
       ArrayList<Dragon> ragon = new ArrayList<Dragon>();
        for (int i = 0; i <= shadowClown; i++){
            ragon.add(new Dragon(xx + size * i, yy + size * i, size));
        }
       Dragon fam = new Dragon();
       
       fam.drawDragon(g, size, ragon);
       fam.drawDragon(g, size, xx, yy, ragon);
     
       System.out.println("fam");
       
       
    }
}
