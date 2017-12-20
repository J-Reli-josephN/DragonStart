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
       System.out.print("How man dragons: ");
       int shadowClown = cc.nextInt();
       DrawingPanel panel = new DrawingPanel(500 + size * 10, 500 + size * 10);
       Graphics g = panel.getGraphics();
       
       ArrayList<Dragon> ragon = new ArrayList<Dragon>();
        for (int i = 0; i <= shadowClown; i++){
            
        }
       Dragon fam = new Dragon();
       
       fam.drawDragon(g, size);
     
       System.out.println("fam");
       
       
    }
}
