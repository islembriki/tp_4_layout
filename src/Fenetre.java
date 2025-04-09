import javax.swing.*;
import java.awt.*;
public class Fenetre extends JFrame {
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		/*pan.add(bouton); // Ajout du bouton au content pane
		this.setContentPane(pan);*///hedi tzid bouton fi wist panel ena naamlou ama thenya tzid bouton fi panel par defaut 
       // this.getContentPane().add(bouton); // Ajout du bouton au content pane
        this.setUndecorated(false);// Enlève la barre de titre
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Top Panel"));
         JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JButton("Click Me"));
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(topPanel, BorderLayout.NORTH);
        contentPane.add(bottomPanel, BorderLayout.SOUTH);
                //this.setVisible(true);
            }
        }

