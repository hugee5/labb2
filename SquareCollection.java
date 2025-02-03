import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection {
	private ArrayList<Sprite> squares;

	public SquareCollection(int numSquare, int squareSize) {
		this.squares = new ArrayList<Sprite>();
		for (int i = 0; i < numSquare; i++) {
			BlueBox bluebox = new BlueBox(i * (squareSize * 2), 0, squareSize, squareSize);
			squares.add(bluebox);
		}
	}

	public void update(Keyboard keyboard) {
		for (Sprite sprite : squares) {
			//sprite.setY(sprite.getY() + 1);
			sprite.update(keyboard);

		}

	}
	
	public ArrayList<Sprite> getSquares() {
		return this.squares;
	}

	public void draw(Graphics2D graphics) {
		for (Sprite sprite : squares) {
			sprite.draw(graphics);
		}

	}

}
