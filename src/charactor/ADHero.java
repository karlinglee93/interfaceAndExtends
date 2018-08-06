package charactor;

public class ADHero extends Hero implements AD {

	int moveSpeed = 400;

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	public int getMoveSpeed() {
		return this.moveSpeed;
	}

	public int getMoveSpeedBySuper() {
		return super.moveSpeed;
	}

	// 通过super调用父类的moveSpeed属性
	public static void main(String[] args) {
		ADHero adHero = new ADHero();
		System.out.println(adHero.getMoveSpeed());
		System.out.println(adHero.getMoveSpeedBySuper());
	}
}
