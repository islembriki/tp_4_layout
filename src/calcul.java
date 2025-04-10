//sou2el for my self at home: jarb aamlhom maghir manhot les attributs w wehd  njarb nhot kol chay fi wist le const kif eka jtext field ninstancih 
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
//borderlaypout houa ili ykhaleha stretychy w kol w zid ki nbadlou border layout houa bitbiitou ykasmha donc nisthakech naaml box nhot fih txt toul nhitha fi "box north"
public class calcul extends JFrame {
    //private Box bh;
    public static final int NBOUTONS = 20;
    private JButton[] boutons;
    private JTextField txt;
    private JPanel pan;
    public calcul(){
        this.setTitle("calculatrice");
        this.setSize(300, 400);
        Container contenu = this.getContentPane();
        contenu.setLayout(new BorderLayout(10, 20));//10 pixels entre les composants
        pan = new JPanel();
        //bh = Box.createHorizontalBox();
        txt = new JTextField();
        txt.setHorizontalAlignment(JTextField.RIGHT);
        txt.setPreferredSize(new Dimension(0, 40));//stretchy widtch ?  Width = 0 → means the layout will stretch it as needed horizontally
        //contenu.add(txt, BorderLayout.NORTH);
        JPanel txtWrapper = new JPanel(new BorderLayout());
        txtWrapper.setBorder(new EmptyBorder(10, 10, 0, 10)); 
        txtWrapper.add(txt, BorderLayout.CENTER);
        contenu.add(txtWrapper, BorderLayout.NORTH);
        pan.setLayout(new GridLayout(5, 4, 5, 5));
        boutons = new JButton[NBOUTONS];
        String [] b={"C","±","%","÷","7","8","9","x","4","5","6","-","1","2","3","+","0",".","","="};
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton(b[i]);
            pan.add(boutons[i]);
        }
        //contenu.add(bh);
        //bh.add(txt);
        JPanel panWrapper = new JPanel(new BorderLayout());
        panWrapper.setBorder(new EmptyBorder(0, 10, 10, 10));
        panWrapper.add(pan, BorderLayout.CENTER);
        contenu.add(panWrapper, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}







//explication lil padding :
/*
 * The EmptyBorder class is a subclass of Border that creates an empty border with specified insets (top, left, bottom, right).
 * It is often used to create space around components in a Swing GUI.
 * The insets define the amount of space to leave around the component, effectively creating a "padding" effect.
 * For example, if you create an EmptyBorder with insets of (10, 10, 10, 10), it will leave 10 pixels of space on all sides of the component.
 * This is useful for improving the layout and appearance of your GUI by preventing components from being too close to each other or to the edges of their container.
 * You can use EmptyBorder to create space around components in a JPanel, JFrame, or any other Swing container.
 * JPanel panWrapper = new JPanel(new BorderLayout());
        panWrapper.setBorder(new EmptyBorder(0, 10, 10, 10));
        panWrapper.add(pan, BorderLayout.CENTER);

        contenu.add(panWrapper, BorderLayout.CENTER);
        --> This creates a panel with a 10-pixel space on the left and bottom sides of the panel, and no space on the top and right sides. The pan component is then added to this panel, which will have the specified padding around it.
        ✅ You’re creating a wrapper panel (panWrapper) that uses BorderLayout.

This will hold the actual panel of buttons (pan) and allow you to easily add padding around it.
🔲 Adds internal padding around the panWrapper.

new EmptyBorder(top, left, bottom, right)

So this line adds:

0px at the top

10px to the left

10px to the bottom

10px to the right

This makes the buttons panel not stick to the bottom or sides of the window.

You’re adding the actual panel with buttons (pan) into the center of the wrapper.

This is the one that uses GridLayout(5, 4, 5, 5) for the button grid.



        */
