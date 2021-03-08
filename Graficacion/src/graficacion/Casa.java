
package graficacion;

import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;
public class Casa extends JFrame
{
//    Graphics2D g2d;
    Graphics g;
    JPanel p,p2;
    JButton b;
    
    boolean pintar=true ;
    int x1=50,x2,y1=50,y2;
    public Casa()
    {
        iniciar();
        g = p.getGraphics();
//        g2d = (Graphics2D)g;
        g.drawOval(50, 50, 5, 5);
        p.repaint();
        
        this.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(pintar == true)
                {
                    Mover(e);
                }
                else
                {
                    moover(e);
                }                
                System.out.println(x1+","+y1);                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
    }
    public static void main(String[] args) 
    {
        Casa c = new Casa();
        
    }
    public void iniciar()
    {
        this.setSize(500 , 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel();
        p.setSize(400,280);
        p.setLocation(30, 30);
        p.setBackground(Color.WHITE);
        
        p2 = new JPanel();
        p2.setSize(400,280);
        p2.setLocation(30, 30);
        p2.setBackground(Color.WHITE);
                
        b=new JButton();
        b.setSize(70,20);
        b.setText("Boton");
        b.setLocation(390, 340); //633 o 601 traer palabras reservadas de MASM  
        this.add(p);
        this.add(b);
        

    }
    public void Mover(KeyEvent e)
    {
        if(e.getKeyChar()=='w')
        {
            y1--;
            g.drawOval(x1, y1,5, 5);
            //p.repaint();
            
        }
        else if (e.getKeyChar()=='s')
        {
            y1++;
            g.drawOval(x1, y1,5, 5);
            //p.repaint();
            
            
        }
        else if(e.getKeyChar()=='a')
        {
            x1--;
            g.drawOval(x1, y1,5, 5);
            //p.repaint();
            
        }
        else if(e.getKeyChar()=='d')
        {
            x1++;
            g.drawOval(x1, y1,5, 5);
            //p.repaint();            
        }
        else if(e.getKeyChar()=='r')
        {
            pintar =false;
        }
       
    }
    public void moover(KeyEvent e)
    {
        p.repaint();
                if(e.getKeyChar()=='w')
        {
            //p.repaint();
            y1--;
            g.drawOval(x1, y1,5, 5);
            
            
        }
        else if (e.getKeyChar()=='s')
        {
            //p.repaint();
            y1++;
            g.drawOval(x1, y1,5, 5);
            
            
            
        }
        else if(e.getKeyChar()=='a')
        {
            //p.repaint();
            x1--;
            g.drawOval(x1, y1,5, 5);
            
            
        }
        else if(e.getKeyChar()=='d')
        {
            //p.repaint();
            x1++;
            g.drawOval(x1, y1,5, 5);
                        
        }
                
        else if(e.getKeyChar()=='r')
        {
            pintar =true;
        }
    }
    
}