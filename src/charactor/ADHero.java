package charactor;

import property.Item;
import property.LifePotion;

public abstract class ADHero extends Hero implements AD {

	int moveSpeed = 400;

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	public int getMoveSpeed() {
		return this.moveSpeed;
	}

	public int getMoveSpeedBySuper() {
		return super.moveSpeed;
	}

	// 重写userItem，并在其中调用父类的userItem方法
	public void useItem(Item item) {
		System.out.println("ad hero use item");
		super.useItem(item);
	}

	public static void main(String[] args) {
		ADHero adHero = new ADHero();
		LifePotion lifePotion = new LifePotion();

		adHero.useItem(lifePotion);
	}
}
