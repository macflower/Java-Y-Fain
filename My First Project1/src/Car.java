
public class Car {
	
	
	public void start(){
		System.out.println("�������!");
	}

	
	public void stop(){
		System.out.println("Stop!");
	}
	
	
	public int drive(int howlong){
		int distance = howlong*60;
		System.out.println("�������� ��� " + distance + " �");
		return distance;
	}
}
