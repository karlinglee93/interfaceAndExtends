package charactor;

public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	public ADHero() {
		System.out.println("AD Hero的构造方法");
	}

	//	实例化一个ADHero()子类, 其构造方法一定会被调用 
	//	其父类的构造方法也会被调用 
	//	并且是父类构造方法先调用 
	//	子类构造方法会默认调用父类的 无参的构造方法
	public static void main(String[] args) {
		new ADHero();
	}

}
