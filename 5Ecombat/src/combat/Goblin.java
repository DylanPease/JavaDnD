package combat;
// sample enemy type.


public class Goblin extends Enemy {
	private static final int weaponDie = 4;
	
	public Goblin(String n, int ac, int atkmod, int hp) {
		super(n, ac, atkmod, hp, weaponDie);
		// TODO Auto-generated constructor stub
	}

}
