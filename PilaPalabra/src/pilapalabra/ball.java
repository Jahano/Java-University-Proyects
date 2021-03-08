
package pilapalabra;

import java.awt.Color;
import java.awt.Graphics2D;

public class ball {
    Panel panel;
    
    int x=0, y = 0;
    int xa = 1, ya=1;
    public ball(Panel panel)
    {
        this.panel = panel;
    }
    public void Mover()
    {
        if (x+xa<0)
        {
            xa=1;
        }
        if(x+xa>panel.getWidth()-30)
        {
            xa=-1;
        }
        if (y+ya<0)
        {
            ya=1;
        }
        if(y+xa>panel.getHeight()-30)
        {
            ya=-1;
        }
        x=x+xa;
        y=y+ya;
        
    }
    public void paint(Graphics2D g)
    {
 //       g.setColor(panel.color());
        g.fillOval(x, y, 40, 40);
        
    }
}
