package greatestOfThree;

public class room {
	
	int roomno;
	String roomtype;
	double roomarea;
	boolean acmachine;
	
	public void setdata(int roomno, String roomtype, double roomarea, boolean acmachine)
	{
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.acmachine = acmachine;
	}
	
	void displaydata()
	{
		System.out.println("Room number: "+roomno);
		System.out.println("Room type: "+roomtype);
		System.out.println("Room area: "+roomarea);
		System.out.println("AC machine: "+acmachine);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		room r = new room();
		r.setdata(0,"null",0,false);
		System.out.println(r);
		r.displaydata();

	}

}
