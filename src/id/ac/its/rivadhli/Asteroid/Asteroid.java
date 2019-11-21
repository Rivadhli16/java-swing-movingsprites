package id.ac.its.rivadhli.Asteroid;

public class Asteroid extends Sprite {
	public Asteroid(int x, int y) {
		super(x,y);
		// TODO Auto-generated constructor stub
		initAsteroid();
	}
	
	private void initAsteroid() {
		loadImage("src/id/asteroid.png");
		getImageDimensions();
	}
}

