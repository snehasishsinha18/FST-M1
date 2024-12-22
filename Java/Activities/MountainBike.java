
public class MountainBike extends Bicycle{

	public int seatHeight;
	public MountainBike(int gears, int currentSpeed) {
		super(gears, currentSpeed);
		
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int newValue) {
        seatHeight = newValue;
    }
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
	
	
	



}
