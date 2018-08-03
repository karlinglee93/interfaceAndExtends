package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		Hero h = new Hero();
		ADHero ad = new ADHero();
		Support s = new Support();

		// 从右至左，子类转父类完全可以，此时h指向ADHero ad对象
		h = ad;
		// 所有再将ADHero ad对象的h 强制转换成ADHero ad对象 也不会报错
		ad = (ADHero) h;
		// 此时h指向Support s对象
		h = s;
		// 将Support s对象的h 强制转换成ADHero ad对象 会报错
		// 因为s对象与ad对象不同，且不是父子关系
		ad = (ADHero) h;
		
	}
}
