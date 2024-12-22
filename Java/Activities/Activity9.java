import java.util.ArrayList;

public class Activity9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myList = new ArrayList<String>();	
		
		myList.add("Sinha1");
		myList.add("Sinha2");
		myList.add("Sinha3");
		myList.add("Sinha4");
		myList.add("Sinha5");
		System.out.println(myList);
		System.out.println(myList.get(2));
		System.out.println(myList.contains("Sinha6"));
		System.out.println(myList.size());
		System.out.println(myList.remove(1));
		System.out.println(myList.size());
	
}
}