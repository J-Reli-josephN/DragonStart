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
       System.out.print("where do you want your dragon (x enter): ");
       int xx = cc.nextInt();
       System.out.print("where do you want your dragon (y enter): ");
       int yy = cc.nextInt();
       DrawingPanel panel = new DrawingPanel(500 + size * 1000, 500 + size * 1000);
       Graphics g = panel.getGraphics();
       Dragon fam = new Dragon();
       fam.drawDragon(g, size);
       Dragon zan = new Dragon();
       ArrayList<Dragon> ragon = new ArrayList<Dragon>();
        for (int i = 0; i < shadowClown; i++){
            zan = new Dragon(250 + size * i, 250 + size * i, size);
            ragon.add(zan);
        }
        for(int i = 0; i < shadowClown; i++){
            ragon.get(i).drawDragon(g, xx + size * i, yy + size * i, size, ragon);
        }
       
       fam.drawDragon(g, size, xx, yy, ragon);
     
       System.out.println("fam");
       
       
    }
}
