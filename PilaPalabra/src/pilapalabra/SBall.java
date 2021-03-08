/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilapalabra;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class SBall {
    Panel panel;
    int x = 0, y = 0;
    
    public SBall(Panel panel)
    {
        this.panel=panel;
    }
    
    public void Paint(Graphics2D g)
    {
        g.fillOval(x, y, 60, 60);
    }
    public void mover(KeyEvent e)
    {
        if(e.getKeyChar()== 's')
        {
            y=y+10;
        }
        if(e.getKeyChar()=='w')
        {
            y=y-10;
        }
        if(e.getKeyChar()== 'a')
        {
            x=x-10;
        }
        if(e.getKeyChar()=='d')
        {
            x=x+10;
        }
        
    }
}
