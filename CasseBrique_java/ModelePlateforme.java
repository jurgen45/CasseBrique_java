import java.awt.event.*;

public class ModelePlateforme extends MouseAdapter implements MouseMotionListener{
	private int posX;
	public ModelePlateforme(){
		this.posX = 0;
	}
	public int getPosition(){
		return this.posX;
	}
	public int getCenterX(){
		int Etat = 0;
		return this.posX+20;
	}
	public void setPosition(int x){
		this.posX = x-30;
		System.out.println(x);
		if (x>=454) {
			posX=425;
		}
		else if (x<=30) {
			posX=0;
		}
	}
	public void setCenter(int y){
		
	}
}