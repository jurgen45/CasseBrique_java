import java.awt.event.*;

public class ControlPlateforme extends MouseAdapter implements MouseMotionListener{
	private Dessin vue;
	private ModelePlateforme modele;
	public ControlPlateforme(Dessin v, ModelePlateforme m){
		this.vue = v;
		this.modele = m;
	}
	@Override
	public void mousePressed(MouseEvent e){
		this.modele.setPositionBalle(e.getX(),385,1);
		this.vue.repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		this.modele.setPosition(e.getX());
		this.modele.setCentrePlateforme(e.getX());
		this.vue.repaint();
	}
}