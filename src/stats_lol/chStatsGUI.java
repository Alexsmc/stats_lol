/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stats_lol;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author root
 */
public class chStatsGUI extends JFrame {
    
    Stats_lol ch = new Stats_lol();
    
    String[] columnNames =  {"pick %",
                        "ban %",
                        "win ratio",
                        "lose ratio",};
        Object[][] data = {
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
    {ch.Aatrox, 35,
     10, 70, 30},
};
    
    JTable tblPly = new JTable(data, columnNames);
    
    Container cp = getContentPane();
    
    public chStatsGUI(){
        
        tblPly.setEnabled(false);
             
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 10, 0, 10);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblPly.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblPly, c);
        
        pack();
        
     
    }
}
