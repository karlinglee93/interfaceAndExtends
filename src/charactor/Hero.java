package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

public class Hero {
	public String name;
	public float hp;

	public void useItem(Item item) {
		item.effect();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "盖伦";

		LifePotion lifePotion = new LifePotion();
		MagicPotion magicPotion = new MagicPotion();

		// 传入Item 类的子类对象的引用
		hero.useItem(lifePotion);
		hero.useItem(magicPotion);
	}
}
