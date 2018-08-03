package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		ADHero ad = new ADHero();
		Support s = new Support();

		// 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
		ad = (ADHero)s;
	}
}
