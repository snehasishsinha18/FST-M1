import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> hs= new HashSet<String>();
	hs.add("sinha1");
	hs.add("sinha2");
	hs.add("sinha3");
	hs.add("sinha4");
	hs.add("sinha5");
	hs.add("sinha6");
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.remove("sinha1"));
	System.out.println(hs.remove("sinha7"));
	System.out.println(hs.contains("sinha3"));
	System.out.println(hs);
	}

}
