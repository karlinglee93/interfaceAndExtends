package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

public class Hero {
	public String name;
	public float hp;

	//类方法，静态方法
	//通过类就可以直接调用
	public static void battleWin() {
		System.out.println("hero battle win! ");
	}
}
