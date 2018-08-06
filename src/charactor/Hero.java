package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	public void useItem(Item item) {
		System.out.println("hero use item");
		item.effect();
	}

	// 准备显式提供无参构造方法的父类
	public Hero() {
		System.out.println("Hero的构造方法");
	}

	public static void main(String[] args) {
		new Hero();
	}
}
