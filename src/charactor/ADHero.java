package charactor;

public class ADHero extends Hero implements AD, Mortal {

	@Override
	public void physicAttack() {
		// 重写/覆盖方法在接口中的运用
		System.out.println("进行物理攻击");
	}

	@Override
	public void die() {
		System.out.println("ADHero 阵亡");
	}

}
