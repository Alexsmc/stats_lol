package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//Here is the second GUI called to insert new game, the user puts the bans, winner side and match time
public class insIDGUI extends JFrame{
    
    Stats_lol st = new Stats_lol();
    
    public String w1, w2;
    
    JLabel lblBans = new JLabel("       Bans        "); //Spacement required to put things in the middle
    JLabel lblWin = new JLabel("Winner side");
    JLabel lblTmp = new JLabel("Match time");
    JLabel lbl = new JLabel("                        ");//See above
    JTextField txtBan1 = new JTextField();
    JTextField txtBan2 = new JTextField();
    JTextField txtBan3 = new JTextField();
    JTextField txtBan4 = new JTextField();
    JTextField txtBan5 = new JTextField();
    JTextField txtBan6 = new JTextField();
    JTextField txtTmp = new JTextField();
    JRadioButton rbtBlue = new JRadioButton(st.sideB);
    JRadioButton rbtRed = new JRadioButton(st.sideR);
    ButtonGroup  btgWin = new ButtonGroup(); //This putts the radio buttons inside one thing so they can be used at the same time
    JButton btnNext = new JButton("Next");    
    
    Container cp = getContentPane();
    
    public insIDGUI(int a, int b){ //Recieves the dropboxes index
                      
        btgWin.add(rbtBlue); //Puts the radio button blue insede the buttongroup
        btgWin.add(rbtRed); //Same as above gut the red
        
        rbtBlue.setActionCommand(st.sideB);
        rbtRed.setActionCommand(st.sideR);
        
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblBans, c);
        
        c.gridx = 2;
        
        cp.add(lbl);
        
        c.gridx = 3;
        
        cp.add(lblWin, c);
        
        c.gridx = 0;
        c.gridy = 1;
        
        cp.add(txtBan1, c);
        
        c.gridx = 1;
        
        cp.add(txtBan2, c);
        
        c.gridx = 2;
        
        cp.add(txtBan3, c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        cp.add(txtBan4, c);
        
        c.gridx = 1;
        
        cp.add(txtBan5, c);
        
        c.gridx = 2;
        
        cp.add(txtBan6, c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        
        cp.add(rbtBlue, c);
        
        c.gridy = 2;
        
        cp.add(rbtRed, c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        cp.add(lblTmp, c);
        
        c.gridx = 1;
        
        cp.add(txtTmp, c);
        
        c.gridx = 3;
        c.gridwidth = 1;
        
        cp.add(btnNext, c);
        
        pack();
        
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                st.ban1 = txtBan1.getText();
                st.ban2 = txtBan2.getText();
                st.ban3 = txtBan3.getText();
                st.ban4 = txtBan4.getText();
                st.ban5 = txtBan5.getText();
                st.ban6 = txtBan6.getText();
                //System.out.print(""+st.ban1);
                st.w1 = w1;
                System.out.println(""+w1);
                System.out.println(""+st.w1);
                new insBDGUI(a, b); //Drpoboxes index needed to the next class
                dispose();
               
            }
        });
        rbtBlue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               w1 = e.getActionCommand();
               //System.out.print(""+st.w1);
            }
        });
        rbtRed.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               w1 = e.getActionCommand();
               //System.out.print(""+st.w1);
            }
        });
    }
    
}
