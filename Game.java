import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
//	private RedBox redBox;
//	private BlueBox blueBox;
//	private GreenBox greenBox;
//	private ArrayList<Sprite> objectBox;
//	private int tickcount = 0;
	private SquareCollection squareCol;
	private GameBoard board;
	private Ball ball;

	public Game(GameBoard board) {
//		this.objectBox = new ArrayList<Sprite>();
//		THIS.REDBOX = NEW REDBOX(20, 20, 20, 20);
//		THIS.BLUEBOX = NEW BLUEBOX(40, 40, 20, 20);
//		THIS.GREENBOX = NEW GREENBOX(60, 60, 20, 20);
		this.squareCol = new SquareCollection(10, 30);
		this.board = board;
		this.ball = new Ball(150, 150, 20, 20);

	}

	public void update(Keyboard keyboard) {

		// this.tickcount++;
		squareCol.update(keyboard);

		for (Sprite sprite : squareCol.getSquares()) {
			if (board.getHeight() <= sprite.getY()) {
				System.exit(0);
			}

		}

		ball.update(keyboard);
		System.out.println("Ball speed: " + ball.getSpeed());
//		for(Sprite box: objectBox) {
//			box.update(keyboard);
//		}

//		redBox.update(keyboard);
//		blueBox.update(keyboard);
//		greenBox.update(keyboard);
		
		if (keyboard.isKeyDown(Key.Escape)){
			System.exit(0);
			}

	}

	public void draw(Graphics2D graphics) {

		// if (tickcount % 40 == 0) {

		squareCol.draw(graphics);
		ball.draw(graphics);

//			boolean even = (objectBox.size() % 2) == 0;
//			if (even) {
//			RedBox redBox = new RedBox(20, 20, 20, 20);
//			objectBox.add(redBox);	
//			} else {
//				BlueBox blueBox = new BlueBox(20, 20, 20, 20);
//				objectBox.add(blueBox);	
//			}
		// }
//		for(int i=0;i<objectBox.size();i++) {
//			objectBox.get(i).draw(graphics);
//		}

//		for(Sprite box: objectBox) {
//			box.draw(graphics);
//		}

//		redBox.draw(graphics);
//		blueBox.draw(graphics);
//		greenBox.draw(graphics);
	}
}
