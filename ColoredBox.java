import java.awt.Color;
import java.awt.Graphics2D;

public class ColoredBox extends Sprite {
	private Color color;

	public ColoredBox(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void update(Keyboard keyboard) {
		if(color==Color.red) {
			setX(getX() + 1);
		} else if(color==Color.blue) {
			setY(getY()+ 1);
		} else if (color==Color.green) {
			setWidth(getWidth() + 1);
			setHeight(getWidth()+ 1);
		}

	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());

	}

}
