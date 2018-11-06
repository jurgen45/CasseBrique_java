import java.awt.event.*;

public class ControlPlateforme extends MouseAdapter implements MouseMotionListener{
	public int xMouse;
	public ControlPlateforme(){
		xMouse = 0;
	}
	@Override
	public void mousePressed(MouseEvent e){

	}
	@Override
	public void mouseMoved(MouseEvent e) {
		xMouse=e.getX();
		
	}
}