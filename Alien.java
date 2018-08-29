package SpaceInvaders;

import java.awt.Graphics;
import java.awt.Image;

public class Alien extends Sprite2D {

	public boolean isAlive;
	public Alien(Image i, Image i2) {
		super(i, i2);  //invoke constructor on superclass Sprite2D		
	}
	public void paint(Graphics g) {
		if (isAlive)
			super.paint(g);
	}
	public boolean move() {
		x+=xSpeed;
		
		//direction reversal needed
		if (x<=0 || x>=InvadersApplication.WindowSize.width-myImage.getWidth(null))
			return true;
		else
			return false;
	}
	public void reverseDrirection() {
		xSpeed=-xSpeed;
		y+=20;
	}
}
