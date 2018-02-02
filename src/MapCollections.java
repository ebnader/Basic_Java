import java.util.HashMap;

public class MapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put("FirstName", "PNT");
		hm.put("Pass", "234pass");
		System.out.println(hm.get("FirstName"));
		hm.remove("FirstName");
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(0, "Hello");
		System.out.println(hm1.get(0));

	}

}
