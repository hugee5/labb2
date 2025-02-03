import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite {
	private int speed = 1;

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void update(Keyboard keyboard) {

		if (keyboard.isKeyDown(Key.Down)) {
			setY(getY() + speed);
		}

		if (keyboard.isKeyDown(Key.Up)) {
			setY(getY() - speed);
		}

		if (keyboard.isKeyDown(Key.Right)) {
			setX(getX() + speed);
		}

		if (keyboard.isKeyDown(Key.Left)) {
			setX(getX() - speed);

		}
		
		if (keyboard.isKeyDown(Key.Space)) {
			speed++;
			}
		
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.red);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());

	}

}
