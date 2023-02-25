package lift;
import java.util.*;



public class Lift {
	private int currentFloor;
	private int targetFloor;
	private boolean doorOpen;
	private boolean movingUp;
	public Lift()
	{
		currentFloor=0;
		targetFloor=-1;
		doorOpen=true;
		movingUp=true;
	}
	public void closeDoor() {
		if(!doorOpen)
		{
			System.out.println("already door closed");
		   return;
		}
		System.out.println("door is closing");
		doorOpen=false;
	}
	public void movingUp(int floor) {
	
		targetFloor=floor;
		if(currentFloor<0 && currentFloor>9)
		{
			System.out.println("invalid floor");
			return;
		}
		if(currentFloor==targetFloor)
		{
			System.out.println("already in same floor");
			return;
		}
		if(doorOpen)
		{
			System.out.println("please close door");
			return;
		}
		if(currentFloor<targetFloor)
		{
		   movingUp=true;
		}
		else
		{
			movingUp=false;
			
		}
		System.out.println("lift moving to the "+targetFloor+"...");
		while(currentFloor!=targetFloor)
		{
			if(movingUp)
			{
				
				currentFloor++;
			}
			else
			{
				System.out.println("moving down");
				currentFloor--;
			}
			
		}
		System.out.println("lift at the "+targetFloor+" floor");
		openDoor();
		}
		public void openDoor() {
			if(doorOpen)
			{
				System.out.println("door already open");
				return;
			}
			System.out.println("opening door");
			doorOpen=true;
			
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Lift l=new Lift();
		l.closeDoor();
		l.movingUp(n);
		l.openDoor();
		l.closeDoor();
		

	}

}
