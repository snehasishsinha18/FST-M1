
public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane = new Plane(10);
		plane.onboard("Sinha");
		plane.onboard("Snehasish");
		System.out.println(plane.takeOff());
		System.out.println(plane.getPassengers());
		
		Thread.sleep(5000);
		plane.land();
		
		System.out.println(plane.getLastTimeLanded());
		
	}

}
