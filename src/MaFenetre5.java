import javax.swing.*;
import java.awt.*;
//BoxLayout avec struct et glue
/* 
Box.createStrut(int size)	Adds a fixed space (like a spacer)
Box.createGlue()	Adds a flexible space — expands as much as possible
Box.createHorizontalGlue()	Adds a flexible space that expands horizontally
Box.createVerticalGlue()	Adds a flexible space that expands vertically
*/
//donc glue wechi ; glue mathln andk 10 mitrou ama inti chthot fehom ken hajtin w chyfdlou 8 ; 8 edoukom par defaut yafdlou aa limin ama mohc mizeyna donc glue ken thotou fi wist kbal matazid kaaba thenya yzid le max espace bienthom zouz(espace maximal bitbiaa depends aa size jframe wkoll) yaani haja taa espacement bin les componenets w struct hia kifha ama inti tfixi kadeh thib 
class MaFenetre5 extends JFrame {
	private Box bVert;
	private JButton b1, b2, b3;
	public MaFenetre5() {
		this.setTitle("Exemple strut et glue");
		this.setSize(150, 200);
        this.setLocationRelativeTo(null); // centrer la fenetre
		Container contenu = this.getContentPane();
		bVert = Box.createVerticalBox();
		contenu.add(bVert);
		b1 = new JButton("Bouton1");
		bVert.add(b1);
        bVert.add(Box.createGlue()); // espacement maximal
		//bVert.add(Box.createVerticalStrut(10)); // espace 10 pixels
		b2 = new JButton("Bouton2");
		bVert.add(b2);
		//bVert.add(Box.createGlue()); // espacement maximal
		b3 = new JButton("Bouton3");
		bVert.add(b3);
	}
}
