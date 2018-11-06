import java.awt.*;
import javax.swing.*;

public class Dessin extends JPanel{	
	@Override
  	public void paintComponent(Graphics pinceau) {
  		Graphics pinceau1 = pinceau.create();
  		pinceau1.setColor(new Color(130,130,130));
  		pinceau1.fillRect(36,50,30,10);

  		pinceau1.fillRect(68,50,30,10);
  		pinceau1.fillRect(100,50,30,10);
  		pinceau1.fillRect(132,50,30,10);

  		pinceau1.fillRect(110,65,30,10);
  		pinceau1.fillRect(142,65,30,10);
  		pinceau1.fillRect(174,65,30,10);

  	}
}