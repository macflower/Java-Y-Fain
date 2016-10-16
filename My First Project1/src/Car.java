
public class Car {
	
	
	public void start(){
		System.out.println("Поехали!");
	}

	
	public void stop(){
		System.out.println("Stop!");
	}
	
	
	public int drive(int howlong){
		int distance = howlong*60;
		System.out.println("Проехано уже " + distance + " м");
		return distance;
	}
}
