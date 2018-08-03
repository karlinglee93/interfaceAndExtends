package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		ADHero ad = new ADHero();

		// ad 指向的对象是ADHero类型，这个类型已经实现了AD接口
		// 把ADHero类型的ad 转换成AD接口，
		// 而AD接口中有physicAttack方法，而ADHero中一定有physicAttack方法的，
		// 所以能够转换成功
		AD adi = ad;
	}
}
