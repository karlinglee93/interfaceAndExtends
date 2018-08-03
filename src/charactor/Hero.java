package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		ADHero ad = new ADHero();
		
		// ad 指向的对象是ADHero类型，adi 引用是AD接口类型。
		// 将ad 转换为AD接口，是实现类转换为接口，是向上转换的
		// 无需强制转换就会成功
		AD adi = ad;

		// adi 指向接口实现类ADHero，所以能够强制转换成功
		ADHero adHero = (ADHero) adi;
		
		// adi 指向的对象adapHero 是ADAPHero类型，所以会转换失败。
		// 注：虽然ADAPHero类型实现了AD接口，
		// 但是假设能够转换成功，那么就可以使用magicAttack方法，
		// 而adi引用所指向的对象ADHero是没有magicAttack方法的。
		ADAPHero adapHero = (ADAPHero) adi;
		adapHero.magicAttack();
	}
}
