package charactor;

public class Hero {
	private String name;
	private float hp;

	public static void main(String[] args) {
		ADHero ad = new ADHero();
		APHero ap = new APHero();
		
		Hero h1 = ad;
		Hero h2 = ap;
		
		System.out.println(h1 instanceof ADHero);
		System.out.println(h2 instanceof APHero);
		System.out.println(h1 instanceof Hero);
	}
}
