package charactor;

public class APHero extends Hero implements AP, Mortal {

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

	@Override
	public void die() {
		System.out.println("APHero 阵亡");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}
