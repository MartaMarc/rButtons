
package radiobuttons;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons extends JFrame {
        public RadioButtons () {
     super("My window title");
     
     int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
     int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
     this.setPreferredSize(new Dimension(szer/2,wys/2));  // wymiary
     this.setLocation((szer-(szer/2))/2,(wys-(wys/2))/2); //punkt,wycentrowanie
     this.setDefaultCloseOperation(3);
     this.pack();
     
     initComponents();
     
}
    
 public void initComponents()
    {            
       red.addActionListener(new doSomething(Color.RED));
       yellow.addActionListener(new doSomething(Color.YELLOW));
          
       panel.add(red);
       panel.add(yellow);
       groupButtons.add(red);
       groupButtons.add(yellow);
       this.getContentPane().add(panel);
       pack();
       
       }
    private class doSomething implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            panel.setBackground(color);
        }
        Color color;
        
        public doSomething(Color color){
            this.color=color;
        }
    }
     
        
    JPanel panel= new JPanel();
    JLabel label= new JLabel("Radiobuttons changes my colour");
    JRadioButton red= new JRadioButton("Red");
    JRadioButton yellow = new JRadioButton("yellow");
    ButtonGroup groupButtons = new ButtonGroup();
   
    
    public static void main(String[] args) {
        new RadioButtons().setVisible(true);
    }
    
}
