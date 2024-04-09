
public class ex803 {

	public static void main(String[] args) {
		Car sf = new Car();
		EvCar X = new EvCar();
		
		sf.printDetail();
		
		for (int i = 0; i < 6; i++) {
			sf.drive();
		}
		System.out.println("You have " + sf.getTank() + " L of oil left.");
		System.out.println("You dorve " + sf.getkm() + "km.");
		
		X.printDetail();
		for (int i = 0; i < 20; i++) {
			if (X.getCharge() <= 10) {
			X.charge();
			}
			X.drive();
		}
		System.out.println("You have " + X.getCharge() + " % battary");
		System.out.println("You dorve " + X.getkm() + "km.");
		
	}

}
