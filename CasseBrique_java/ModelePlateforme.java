import java.awt.event.*;
import java.util.*;

public class ModelePlateforme extends MouseAdapter implements MouseMotionListener{
	private int posX;
	private int posBX;
	private int posBY;
	private int Etat;
	private int centreP;
	public ModelePlateforme(){
		this.posX = 0;
		this.posBY = 0;
		this.Etat = 0;
		this.centreP=0;
	}
	public int getPosition(){
		return this.posX;
	}
	public int getPositionBalleX(){
		if (Etat == 0) {
			return this.posX;	
		}
		return this.posX+10;
	}
	public int getPositionBalleY(){
		if (Etat == 0) {
			posBY = 385;
		}
		return posBY;
	}
	public int getCentreBalleX(){
			if (Etat == 0) {
				return centreP;
			}
			else if (Etat == 1) {
				return centreP;
			}	
		return centreP;
	}
	public int getCentrePlateforme(){	
		return centreP;
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
	public void setPositionBalle(int x, int y, int etat){
		if (etat == 1) {
			Etat = 1;
			while(y!=0){
				posBY = y--;
			}
		}
		else if (etat == 0) {
			posBY = 385;
		}	
	}
	public void setCentrePlateforme(int x){
		centreP = posX + 30;
	}
}