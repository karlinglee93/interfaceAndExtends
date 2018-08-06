package charactor;

public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	// 使用关键字super 显式调用父类带参的构造方法
	public ADHero(String name) {
		super(name);
		System.out.println("AD Hero的构造方法");
	}

	public static void main(String[] args) {
		new ADHero("safari");
	}

}
