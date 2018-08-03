package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		Hero h = new Hero();
		ADHero ad = new ADHero();
		
		// 类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

		// 把ad引用所指向的对象的类型是ADHero
		// h引用的类型是Hero
		
		// 方法：把右边的当作左边的来用
		
		// 把ADHero当做Hero使用，一定可以
		// 即所有的子类转父类都是说得通的
		h = ad;
	}
}
