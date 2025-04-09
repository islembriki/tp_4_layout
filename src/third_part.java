import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
public class third_part extends JFrame {
    private Box bh;
    private Box bv;
    public static final int NBOUTONS = 6;
    private JButton[] boutons;
    private JButton b1, b2, b3, b4, b5, b6;
    private JTextField txt;
    private JPanel pangrid;
    private JPanel center;
    private JPanel panbv;
    public third_part() {
        this.setTitle("Exemple Layout Managers");
        this.setSize(500, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout(10, 10));
        bh= Box.createHorizontalBox();
        content.add(bh,BorderLayout.NORTH);
        TitledBorder horizontalTitle = BorderFactory.createTitledBorder("BoxLayout Horizontal");
        bh.setBorder(BorderFactory.createCompoundBorder(horizontalTitle, new EmptyBorder(10, 10, 0, 10)));
        b1 = new JButton("Bouton1");
        b2 = new JButton("Bouton2");
        b3 = new JButton("Bouton3");
        bh.add(b1);
        bh.add(Box.createGlue());
        bh.add(b2);
        bh.add(b3);
        center= new JPanel(new BorderLayout());
        content.add(center,BorderLayout.CENTER);
        pangrid = new JPanel();
        pangrid.setLayout(new GridLayout(2, 3, 5, 5));
        boutons = new JButton[NBOUTONS];
        for (int i = 1; i <= 6; i++) {
            pangrid.add(new JButton("Btn " + i));
        }
        center.add(pangrid,BorderLayout.NORTH);
        TitledBorder gridTitle = BorderFactory.createTitledBorder("GridLayout 2x3");
        pangrid.setBorder(BorderFactory.createCompoundBorder(gridTitle, new EmptyBorder(10, 10, 10, 10)));

        panbv = new JPanel(new BorderLayout());
        panbv.setBorder(new EmptyBorder(0, 250, 0, 20));
        center.add(panbv,BorderLayout.CENTER);
        bv= Box.createVerticalBox();
        //JPanel wrapper = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //wrapper.setBorder(new EmptyBorder(0, 20, 0, 0)); // Left margin of 20px
        panbv.add(bv,BorderLayout.CENTER);
        bv.setBorder(BorderFactory.createTitledBorder("BoxLayout Vertical"));
        b4 = new JButton("premier");
        b5 = new JButton("deuxieme");
        b6 = new JButton("troisieme");
        bv.add(b4);
        bv.add(Box.createVerticalStrut(30));
        bv.add(b5);
        bv.add(Box.createVerticalStrut(16));
        bv.add(b6);
        //wrapper.add(bv);
        //panbv.add(wrapper, BorderLayout.CENTER);
    }
}





