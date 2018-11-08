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

	}
	@Override
	public void mouseMoved(MouseEvent e) {
		this.modele.setPosition(e.getX());
		this.vue.repaint();
	}
}