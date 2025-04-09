//BEKI MOCH WADHA FAZET SHORTCUTS W FARK BIDABTBIDABT BINETHOM JAPANEL W BOX W HAM 
import javax.swing.*;
import java.awt.*;
//boxlayout
// BoxLayout is a layout manager that arranges components in a single row or column. You can specify the alignment of the components within the box, as well as the spacing between them. BoxLayout is useful for creating flexible and responsive layouts that adapt to the size of the container.
//It doesn’t force equal sizes like GridLayout. Each component keeps its preferred size!

public class MaFenetre4 extends JFrame {
    private Box bHor;
    private JButton b1, b2;
    private JTextField txt;
/* kona najmou naamlou bi comande hedi ama hia aamlt box kalt edeka bech nhotou create horizntal w baad zeidtou lin conetu pan ; ama fama hedi zeda :
 * Box bHor = new Box(BoxLayout.X_AXIS); 
bHor.setLayout(new BoxLayout(bHor, BoxLayout.X_AXIS)); // redundant!
Box b = Box.createHorizontalBox(); // same as new Box(BoxLayout.X_AXIS)

 */
    public MaFenetre4() {
        this.setTitle("Exemple BoxLayout horizontal");
        this.setSize(550, 100);
        Container contenu = this.getContentPane();
        bHor = Box.createHorizontalBox();
        contenu.add(bHor);
        b1 = new JButton("Bouton1");
        bHor.add(b1);
        txt = new JTextField(20);
        bHor.add(txt);
        b2 = new JButton("Bouton2");
        bHor.add(b2);
    }
}