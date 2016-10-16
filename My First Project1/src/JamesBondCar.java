
public class JamesBondCar extends Car {
	// Переопределяем метод    
	   public int drive(int howlong){
	      
	        System.out.println("Как долго нам ехать по времени из Start в Stop " + howlong + " часов");
	        System.out.println("Скорость за бортом составляет " + 60 + " км/ч");
	        System.out.println("Мы проехали " + howlong * 60 + " км");
	        return howlong;
	   }
	}
