package charactor;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;

	class BattleScore {
		int kill;
		int die;
		int assit;

		public void legendary() {
			if (kill >= 8) {
				// 作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
				System.out.println(name + "超神");
			} else {
				System.out.println(name + "尚未超神！");
			}
		}
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "safari";

		// 实例化内部类
		// BattleScore对象只有在一个英雄对象存在的时候才有意义
		// 所以其实例化必须建立在一个外部类对象的基础之上
		BattleScore battleScore = hero.new BattleScore();
		battleScore.kill = 8;
		battleScore.legendary();
	}
}