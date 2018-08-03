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
	
	public void kill(Mortal m) {
		m.die();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "盖伦";

		ADHero adHero = new ADHero();
		APHero apHero = new APHero();
		ADAPHero adapHero = new ADAPHero();
		
		// kill() 方法需要传入Mortal接口类型
		// 由于ADHero/APHero/ADAPHero类实现了Mortal接口
		// 传入ADHero/APHero/ADAPHero类的引用也就是允许发生的
		// 因为类的引用到实现的接口是向上转型的关系
		hero.kill(adHero);
		hero.kill(apHero);
		hero.kill(adapHero);
	}
}
