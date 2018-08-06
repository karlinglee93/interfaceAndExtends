package charactor;

public class Hero {
	String name;
	float hp;

	public String toString() {
		return name;
	}

	public boolean equals(Object object) {
		if (object instanceof Hero) {
			Hero hero = (Hero) object;
			return this.hp == hero.hp;
		}
		return false;
	}

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.hp = 300;
		Hero h2 = new Hero();
		h2.hp = 400;
		Hero h3 = new Hero();
		h3.hp = 300;

		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
	}
}
