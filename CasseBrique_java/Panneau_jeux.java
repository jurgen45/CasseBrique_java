import java.awt.*;
import javax.swing.*;

public class Panneau_jeux extends JPanel{
	Dessin draw;
	public Panneau_jeux(){
		setBackground(Color.RED);
		draw = new Dessin();
		add(draw);
	}
}