
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;
		
		double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        
        System.out.println("Age on Earth: " + seconds / EarthSeconds + " Earth-years");
        System.out.println("Age on Mercury: " + seconds / (EarthSeconds * MercurySeconds) + " Earth-years");
        System.out.println("Age on Venus: " + seconds / (EarthSeconds * VenusSeconds) + " Earth-years");
        System.out.println("Age on Mars: " + seconds / (EarthSeconds * MarsSeconds) + " Earth-years");
        System.out.println("Age on Jupiter: " + seconds / (EarthSeconds * JupiterSeconds) + " Earth-years");
        System.out.println("Age on Saturn: " + seconds / (EarthSeconds * SaturnSeconds) + " Earth-years");
        System.out.println("Age on Uranus: " + seconds / (EarthSeconds * UranusSeconds) + " Earth-years");
        System.out.println("Age on Neptune: " + seconds / (EarthSeconds * NeptuneSeconds) + " Earth-years");
    
        
        
        
	}

}
