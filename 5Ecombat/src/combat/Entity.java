package combat;
import java.lang.Math;

/*
 * Each entity has a name, armor class, attack modifier, hit points, and weapon dice.
 * TODO 
 * - Make a proper critical hit system.
 * - Add proper stat interactions. The most important for combat is dexterity.
 */

public class Entity {
	String name;
	int AC, attackMod, hitPoints, weaponDie;
	public Entity(String n, int ac, int atkmod, int hp, int wepd) {
		name = n;
		AC = ac;
		attackMod = atkmod;
		hitPoints = hp;
		weaponDie = wepd;
	}
	
	public int getAC() {
		return AC;
	}
	
	public String getName() {
		return name;
	}
	
	public int rolld20() {
		int max = 20;
		int min = 1;
		int range = max - min + 1;
		
		int roll = (int)(Math.random() * range) + min;
		System.out.println(name + " rolls:");
		System.out.println(roll);
		return roll;
	}
	public boolean toHit(Entity target) {
		
		if (this.rolld20() + attackMod >= target.getAC()){
			System.out.println("+" + attackMod);
			System.out.println(this.getName() + " has hit " + target.getName() + "!");
			
			return true;
		}
		else{
			System.out.println("+" + attackMod);
			System.out.println(this.getName() + " has missed " + target.getName() + ".");
			return false;
		}
	}
	public int attackDamage() {
		int max = weaponDie;
		int min = 1;
		int range = max - min + 1;
		
		int damageRoll = (int)(Math.random() * range) + min;
		System.out.println( damageRoll + " damage.");
		return damageRoll;
	}

	public void damage(int d) {
		hitPoints = hitPoints - d;
		if (this.isAlive() != true){
			System.out.println(name + " has fallen in battle");
		}
	}
	
	public boolean isAlive() {return (hitPoints > 0);}
}
