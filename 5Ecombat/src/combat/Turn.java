package combat;

//centralized turn tracker and incrementer
public class Turn {
	public static int turn = 0;
	
	public static void incTurn() {
		turn++;
	}
	
	public static int getTurn() {
		return turn;
	}
}
