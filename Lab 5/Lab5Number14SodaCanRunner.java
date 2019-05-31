import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Lab5Number14SodaCanRunner
{
   public static void draw(Graphics g)
   {
     
     int x = 0;
     int y = 0;
     int r1 = 40;
     int r2 = 40;
     
     for (int i = 1; i <= 4; i++)
     {
       for (int j = 1; j <= 6; j++)
       {
         g.drawOval(x, y, r1, r2);
         x += 40;
         
       }
       x = 0;
       y += 40;
     
     }
      
   }

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
          
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }
}
