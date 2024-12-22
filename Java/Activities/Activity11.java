import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String> colours = new HashMap<Integer,String>();
	
	colours.put(1, "Black");
	colours.put(2, "white");
	colours.put(3, "pink");
	colours.put(4, "Red");
	colours.put(5, "Blue");
	
	System.out.println(colours);
	System.out.println(colours.remove(1));
	System.out.println(colours.containsValue("green"));
	System.out.println(colours.size());
	System.out.println(colours);
	
	
	}
}
