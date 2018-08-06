package charactor;

// Object类是所有类的父类
public class Hero extends Object {
	String name;
	float hp;

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "safari";
		// Object类提供一个toString方法，所以所有的类都有toString方法
		System.out.println(hero.toString());
		// 直接打印对象就是打印该对象的toString()返回值
		System.out.println(hero);
	}
}
