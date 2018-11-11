import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dessin extends JComponent{
  private ModelePlateforme modele;	
  public ControlPlateforme c;
  private int yP;
  private Image mur;
  public Dessin(){
    this.modele = new ModelePlateforme();
    c = new ControlPlateforme(this,this.modele);
    this.addMouseListener(c);
    this.addMouseMotionListener(c);
    mur = Toolkit.getDefaultToolkit().getImage("mur.png");
    yP = 405;

  }
  @Override
  public void paintComponent(Graphics pinceau) {
  	Graphics pinceau1 = pinceau.create();

    if (this.isOpaque()) {
      // on repeint toute la surface avec la couleur de fond
      pinceau1.setColor(this.getBackground());
      pinceau1.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    pinceau1.drawImage(mur, 0, 0, this);
  	pinceau1.setColor(new Color(130,130,130));
  	pinceau1.fillRect(36,50,30,10);

  	pinceau1.fillRect(68,50,30,10);
  	pinceau1.fillRect(100,50,30,10);
  	pinceau1.fillRect(132,50,30,10);

  	pinceau1.fillRect(110,65,30,10);
  	pinceau1.fillRect(142,65,30,10);
  	pinceau1.fillRect(174,65,30,10);

    pinceau1.drawLine(0,400,500,400);
    pinceau1.fillRect(this.modele.getPosition(),405,60,10);

    pinceau1.fillOval(this.modele.getCentreBalleX()-10,this.modele.getPositionBalleY(),20,20);

  	}
    public void Refresh(){
      repaint();
    }
}