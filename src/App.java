import javax.swing.*;
import java.awt.*;
public class App {
    public static void main(String[] args) throws Exception {
        Fenetre window=new Fenetre();
        window.setVisible(false);
        MaFenetre secondWindow=new MaFenetre();
        secondWindow.setVisible(false);
        MaFenetre2 thirdWindow=new MaFenetre2();
        thirdWindow.setVisible(false);
        MaFenetre3 fourthWindow=new MaFenetre3();
        fourthWindow.setVisible(false);
        MaFenetre4 fifthWindow=new MaFenetre4();
        fifthWindow.setVisible(false);
        MaFenetre5 sixthWindow=new MaFenetre5();
        sixthWindow.setVisible(false);
        calcul cal=new calcul();
        cal.setVisible(false);
//--------------------------------------------------------------------
        calcul cal2=new calcul();
        cal2.setVisible(true);
        third_part thirdPartExample = new third_part();
        thirdPartExample.setVisible(true);
    }
}
