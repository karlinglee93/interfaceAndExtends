package charactor;

public abstract class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	public abstract void attack();

	public static void main(String[] args) {
		ADHero adh = new ADHero();
		// 通过打印adh，可以看到adh这个对象属于ADHero类
		adh.attack();
		System.out.println(adh);

		// 匿名类
		Hero h = new Hero() {
			// 当场实现attack方法
			public void attack() {
				System.out.println("新的进攻手段");
			}
		};
		h.attack();
		// 通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名
		System.out.println(h);
	}
}