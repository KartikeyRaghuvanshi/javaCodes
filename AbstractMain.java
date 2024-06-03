package greatestOfThree;

abstract class Bike
{
	abstract void run();
}
class Hero extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Hero();
		obj.run();

	}

}
