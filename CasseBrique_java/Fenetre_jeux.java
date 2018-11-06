import java.awt.*;
import javax.swing.*;

public class Fenetre_jeux extends JFrame{
	Dessin panel;
	public Fenetre_jeux(){
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		panel = new Dessin();
		add(panel);
	}
}