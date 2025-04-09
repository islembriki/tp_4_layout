import javax.swing.*;
import java.awt.*;


public class Mywindow extends JFrame {
    public Mywindow() {
        this.setTitle("Exemple Layout Managers");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout(10, 10)); 

        
        JPanel boxh = new JPanel();
        boxh.setBorder(BorderFactory.createTitledBorder("BoxLayout Horizontal"));
        boxh.setLayout(new BoxLayout(boxh, BoxLayout.X_AXIS));
        boxh.add(new JButton("Bouton 1"));
        boxh.add(Box.createGlue());
        boxh.add(new JButton("Bouton 2"));
        boxh.add(Box.createHorizontalStrut(5)); // Espace horizontal de 10 pixels
        
        boxh.add(new JButton("Bouton 3"));
       
        content.add(boxh, BorderLayout.NORTH);

        
        JPanel panGrid = new JPanel();
        panGrid.setBorder(BorderFactory.createTitledBorder("GridLayout 2x3"));
        panGrid.setLayout(new GridLayout(2, 3, 5, 5)); 
        for (int i = 1; i <= 6; i++) {
            panGrid.add(new JButton("Bouton " + i));
        }

        JPanel boxv = new JPanel();
        boxv.setBorder(BorderFactory.createTitledBorder("BoxLayout Vertical"));
        boxv.setLayout(new BoxLayout(boxv, BoxLayout.Y_AXIS));
        boxv.add(Box.createVerticalStrut(5));
        boxv.add(new JButton("Premier"));
        boxv.add(Box.createVerticalStrut(10));
        boxv.add(new JButton("Deuxième"));
        boxv.add(Box.createVerticalStrut(10));
        boxv.add(new JButton("Troisième"));
        boxv.add(Box.createVerticalStrut(5));

        JPanel downPanel = new JPanel();
        downPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        downPanel.add(boxv);
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(panGrid, BorderLayout.CENTER);
        centerPanel.add(downPanel, BorderLayout.SOUTH);
        content.add(centerPanel, BorderLayout.CENTER);
        
    }


    
}