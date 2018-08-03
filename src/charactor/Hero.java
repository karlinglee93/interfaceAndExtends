package charactor;

import property.LifePotion;
import property.MagicPotion;

public class Hero {
	public String name;
	public float hp;

	public void useLifePotion(LifePotion lifePotion) {
		lifePotion.effect();
	}
	
	public void useMagicPotion(property.MagicPotion magicPotion) {
		magicPotion.effect();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "盖伦";
		
		LifePotion lifePotion = new LifePotion();
		MagicPotion magicPotion = new MagicPotion();
		
		hero.useLifePotion(lifePotion);
		hero.useMagicPotion(magicPotion);
	}
}
