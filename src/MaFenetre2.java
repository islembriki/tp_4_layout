import javax.swing.*;
import java.awt.*;
//heda fenetre li fiha flowlayout
//FlowLayout, which does not stretch or resize elements dynamically.


//heda yimchi kif textte chmaaneha kol chay yhotou baahda baadou from left to right ken wfet li blasa yitaada li ligne ili baadha 
class MaFenetre2 extends JFrame {
	public static int NBOUTONS = 5;
	private JButton boutons[];
	public MaFenetre2() {
		this.setTitle("Exemple FlowLayout");
		this.setSize(350, 180);
        this.setLocationRelativeTo(null);
		Container contenu = this.getContentPane();
		contenu.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));//tapliqui flowlayout a container w eka fazet 10 pixels entre les boutons w 5 pixels entre les lignes w eka fazet center 
		/* FlowLayout.LEFT	All buttons align to the left, extra space on right
FlowLayout.RIGHT	All buttons align to the right, extra space on left
FlowLayout.CENTER	Buttons are centered in the row
FlowLayout.LEADING	Aligns to the start of the container's orientation (like LEFT in LTR languages)
FlowLayout.TRAILING	Aligns to the end of the orientation (like RIGHT in LTR languages)*/
        boutons = new JButton[NBOUTONS];
		int n = 1;
		for (int i = 0; i < NBOUTONS; i++) {
			boutons[i] = new JButton("Bouton " + n);
			n *= 10;
			contenu.add(boutons[i]);//basically just zid lil content plan les boutons 
		}
	}
}
