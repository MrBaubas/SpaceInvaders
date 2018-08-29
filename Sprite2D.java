package SpaceInvaders;

import java.awt.*;

public class Sprite2D {
	//member data
	protected double x,y;
	protected double xSpeed = 0;
	protected Image myImage, myImage2;
	int frameDrawn = 0;
	
	//constructor
	public Sprite2D(Image i, Image i2) {
		myImage = i;
		myImage2 = i2;
	}
	public void setPosition(double xx, double yy) {
		x = xx;
		y = yy;
	}
	public void setXSpeed (double dx) {
		xSpeed = dx;
	}
	 public void paint (Graphics g) {
		 frameDrawn++;
		 if (frameDrawn%100<50)
			 g.drawImage(myImage, (int)x , (int)y, null);
		 else
			 g.drawImage(myImage2, (int)x , (int)y, null);
	 }
}