package property;

import charactor.Hero;

public class Item {
	String name;
	int price;

	public void buy() {
		System.out.println("购买");
	}

	public void effect() {
		System.out.println("物品使用后，可以有效果 ");
	}

	public String toString() {
		return this.name + this.price;
	}

	public void fimalize() {
		System.out.println(this.name + "对象正在被回收");
	}

	public boolean equals(Object object) {
		if (object instanceof Item) {
			Item item = (Item) object;
			// this指的是参数Object对象
			return this.price == item.price;
		}
		return false;
	}

	public static void main(String[] args) {
		Item i1 = new LifePotion();
		Item i2 = new MagicPotion();
		System.out.print("i1  是Item类型，执行effect打印:");
		i1.effect();
		System.out.print("i2也是Item类型，执行effect打印:");
		i2.effect();
	}

}