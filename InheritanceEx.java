package greatestOfThree;

public class InheritanceEx {
	static class Animal{
		void eat() {
			System.out.println("eating...");
		}
	}
	static class Bird extends Animal{
		void fly() {
			System.out.println("flying...");
		}
	}
	static class sparrow extends Bird{
		void sing() {
			System.out.println("singing...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sparrow sparrow = new sparrow();
		sparrow.eat();
		sparrow.fly();
		sparrow.sing();

	}

}
