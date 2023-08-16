package FinalPrjt;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Color;
public class itemGUItest extends itemGUI
{
    itemGUItest()
    {
        JFrame itemGUItest = new JFrame();
        JPanel panel = new JPanel();
        
        itemGUItest.setSize(400,200);
        itemGUItest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //itemGUI testets = new itemGUI();
        itemGUIFrameAccess.setBackground(new Color(207, 106, 204));
        
        itemGUItest.setVisible(true);
    }  
}