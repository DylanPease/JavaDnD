package combat;

public class Main {
	public static void main(String[] args) {
		Goblin g1 = new Goblin("Grexo", 12, 4, 12);
		Goblin g2 = new Goblin("Nott", 17, 5, 15);
		Player p = new Player("Hero", 15, 3, 18, 8);
		
		while (g1.isAlive()  && g2.isAlive())  {
			Turn.incTurn();
			System.out.println("Turn: " + Turn.getTurn());
			if (g2.toHit(g1)) {
				g1.damage(g2.attackDamage());
				if(g1.isAlive() != true) {
					break;
				}
			}
			if (g1.toHit(g2)) {
				g2.damage(g2.attackDamage());
				if(g2.isAlive() != true) {
					break;
				}
			}
		}
		//p.action("attack", g1);
		//p.action("attack", g2);
		
	}
}