package ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		
		Taxi wellTaxi = new Taxi("잘 간다 운수택시");
		
		studentE.take(wellTaxi);
		
		studentE.showInfo();
		wellTaxi.showTaxiInfo();
	}

}
