
package pilapalabra;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel{
    Random rd = new Random();
    ball ball = new ball(this);
    SBall sball = new SBall(this);
    public Panel()
    {
        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                sball.mover(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        };
        this.setFocusable(true);
        this.addKeyListener(listener);
        this.setBackground(Color.BLACK);
    }
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        
        Panel panel = new Panel();
        panel.setSize(600,400);
        frame.add(panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true)
        {
            panel.repaint();
            panel.move();
            Thread.sleep(10);
            
        }
        
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
//        g.setColor(color());
        Graphics2D dr = (Graphics2D)g;
//        dr.setColor(color());
        ball.paint(dr);
        
        sball.Paint(dr);
        
    }
    public void move()
    {
        ball.Mover();
    }
    public Color color()
    {
        int r,gg,b;
        r=rd.nextInt(254)/2;
        gg=rd.nextInt(254)/2;
        b=rd.nextInt(254)/2;
        
        Color color = new Color(r,gg,b);
        
        return(color);
    }
            
    
}
