package greatestOfThree;

class beforeStatic
{
	static int a ;
	static
	{
		int a = 10;
		System.out.println("A: "+a);
	}
	static void show() {
		a++;
		System.out.println("A: "+a);
	}
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeStatic.show();
	}

}
