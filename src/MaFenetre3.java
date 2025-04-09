import javax.swing.*;
import java.awt.*;
//gridlayout hedi 
/* 
GridLayout is a layout manager that arranges components in a grid of cells. Each component takes up one cell, and all cells are of equal size. You can specify the number of rows and columns in the grid, as well as the horizontal and vertical gaps between the cells.
new GridLayout(rows, columns, hgap, vgap)
rows	How many rows in the grid
columns	How many columns in the grid
hgap	Horizontal space between cells
vgap	Vertical space between cells
*/
public class MaFenetre3 extends JFrame {
    public static final int NBOUTONS = 5;
    private JButton[] boutons;
    public MaFenetre3() {
        this.setTitle("Exemple GridLayout");
        this.setSize(350, 180);
        Container contenu = this.getContentPane();
        contenu.setLayout(new GridLayout(4, 3, 6, 4));
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bouton " + i);
            contenu.add(boutons[i]);
        }
    }
}
