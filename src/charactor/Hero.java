package charactor;

public abstract class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	public abstract void attack();

	public static void main(String[] args) {
		// 与匿名类的区别在于，本地类有了自定义的类名
		class SomeHero extends Hero {

			@Override
			public void attack() {
				System.out.println(name + " 新的进攻手段");
			}
		}
		SomeHero someHero = new SomeHero();
		someHero.name = "safari";
		someHero.attack();
	}
}