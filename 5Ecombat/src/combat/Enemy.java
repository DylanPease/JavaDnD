package combat;

//doesn't deviate that much from Entity, but if things need to be changed specifically for enemies, it can be done here while keeping the parent in tact.

public class Enemy extends Entity {
	String name;
	int AC, attackMod;
	public Enemy(String n, int ac, int atkmod, int hp, int wepd) {
		super(n, ac, atkmod, hp, wepd);
	}
}
