package combat;

/* The human player of the game.
TODO implement advantage/disadvantage system to make dodging work accurately.

*/
public class Player extends Entity {
	String[] actions = {"attack", "disengage", "dodge"}; //all the actions the player can take
	public Player(String n, int ac, int atkmod, int hp, int wepd) {
		super(n, ac, atkmod, hp, wepd);
		// TODO Auto-generated constructor stub
	}
	
	public void action(String input) {
		for(int i = 0; i < actions.length; i++) {
			if (input == "attack") {
				System.out.println("no one to hit");
			}
		}
	}
	public void action(String input, Entity t) {
		for(int i = 0; i < actions.length; i++) {
			if (input == "attack") {
				if(this.toHit(t)) {
					t.damage(this.attackDamage());
				}
				break;
			}
			if (input == "dodge") {
				AC++;
				break;
			}
		}
	}


}
