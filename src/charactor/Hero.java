package charactor;

// Object类是所有类的父类
public class Hero {
	String name;
	float hp;

	public String toString() {
		return name;
	}

	public void finalize() {
		System.out.println("这个英雄正在被回收");
	}

	public static void main(String[] args) {
		// 只有一个引用
		Hero hero;

		// 不断生成新的对象
		// 每创建一个对象，前一个对象就没有引用指向了
		// 那些对象，就满足垃圾回收的条件
		// 当垃圾堆积的比较多的时候，就会触发垃圾回收
		// 一旦这个对象被回收，它的finalize()方法就会被调用
		for (int i = 0; i < 5; i++) {
			hero = new Hero();
		}
	}
}
