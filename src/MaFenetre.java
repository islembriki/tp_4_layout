import javax.swing.*;
import java.awt.*;
//heda fenetre li fiha borderlayout
/* borderlayout tkasmlik ay container li 5 pariet , north center west east soutch 
 * This layout allows components to expand in all directions (North, Center, etc.).!!!
 */
class MaFenetre extends JFrame {
	public static final int NBOUTONS = 5;
	private JButton[] boutons;

	public MaFenetre() {
		this.setTitle("Exemple BorderLayout");
		this.setSize(300, 180);
        this.setLocationRelativeTo(null);//tiplacilk fi centre

		Container contenu = this.getContentPane();
		boutons = new JButton[NBOUTONS];
		for (int i = 0; i < NBOUTONS; i++) {
			boutons[i] = new JButton("Bouton " + i);
		}
		contenu.add(boutons[0],BorderLayout.NORTH); // au centre par défaut
		contenu.add(boutons[1], BorderLayout.CENTER);
		contenu.add(boutons[2], BorderLayout.SOUTH);
		contenu.add(boutons[3], BorderLayout.WEST);
		contenu.add(boutons[4], BorderLayout.EAST);
	}
}
