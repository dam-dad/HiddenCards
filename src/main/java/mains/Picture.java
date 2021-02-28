package mains;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Controllador de las imagenes
 * 
 * @author Hidden cards
 *
 */
public class Picture {

	public ImageView zeroZero1;
	public ImageView oneZero1;
	public ImageView twoZero1;
	public ImageView threeZero1;
	public ImageView zeroOne1;
	public ImageView oneOne1;
	public ImageView twoOne1;
	public ImageView threeOne1;
	public Label timeTaken;
	public Label incorrectMatches;

	public void initialize() {
		timeTaken.setText(MemoryGame.getTime());
		zeroZero1.setImage(MemoryGame.getPix().getOriginals().get(0));
		oneZero1.setImage(MemoryGame.getPix().getOriginals().get(2));
		twoZero1.setImage(MemoryGame.getPix().getOriginals().get(4));
		threeZero1.setImage(MemoryGame.getPix().getOriginals().get(6));
		zeroOne1.setImage(MemoryGame.getPix().getOriginals().get(8));
		oneOne1.setImage(MemoryGame.getPix().getOriginals().get(10));
		twoOne1.setImage(MemoryGame.getPix().getOriginals().get(12));
		threeOne1.setImage(MemoryGame.getPix().getOriginals().get(14));
		timeTaken.setText(MemoryGame.getTime());
		incorrectMatches.setText(Integer.toString(MemoryGame.getWrong()));
	}

	public void playAgain() throws Exception {
//        System.out.println("Jugar de nuevo ");
		// new App().start((Stage)timeTaken.getScene().getWindow());

		Stage stage = (Stage) timeTaken.getScene().getWindow();
		stage.close();
//        start((Stage)timeTaken.getScene().getWindow());
	}
}
