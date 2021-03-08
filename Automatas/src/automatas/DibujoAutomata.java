
package automatas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DibujoAutomata extends JFrame
{
    JPanel panel,panel2;
    JTextField S0,S1,S2,S3,S5,S6;
    public DibujoAutomata()
    {
        iniciar();
    }
    
    public static void main(String[] args) 
    {
        DibujoAutomata dib = new DibujoAutomata();        
    }
    
    public void iniciar()
    {
        //Creando JFrame
        this.setSize(950, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
//        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        S3= new JTextField();
        S3.setSize(100, 30);
        S3.setLayout(null);
        S3.setLocation(30, 700);
        S3.setText(" ");
        this.add(S3);
                
        //Creando Panel
        panel = new JPanel();
        panel.setSize(500, 500);
        panel.setLocation(50,50);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);
        panel.isShowing();
        this.add(panel);
        
        panel2 = new JPanel();
        panel2.setSize(300, 500);
        panel2.setLocation(600,50);
        panel2.setLayout(null);
        panel2.setBackground(Color.BLACK);
        panel2.setVisible(true);
        this.add(panel2);        
                
        
        S0.setLocation(10,40);
        S0.setBackground(Color.white);
        S0.setSize(100, 30);
        S0.setLayout(null);
        S0.setVisible(true);
        S0.setEditable(true);
        S0.setFocusable(true);
        S0.setText("");
        panel.add(S0);
        
        S1.setLocation(10,80);        
        S1.setBackground(Color.white);
        S1.setSize(100, 30);
        S1.setLayout(null);
        S1.setVisible(true);
        S1.setEditable(true);
        S1.setFocusable(true);
        S1.setText("");
        panel.add(S1);
        
        S2.setLocation(10,120);
        S2.setBackground(Color.white);
        S2.setSize(100, 30);
        S2.setLayout(null);
        S2.setVisible(true);
        S2.setEditable(true);
        S2.setFocusable(true);
        S2.setText("");
        panel.add(S2);       
    }
    
}
