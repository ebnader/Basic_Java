import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Autorated method stub
		 ArrayList<Object> a = new ArrayList<>();
		a.add(2);
		a.add("alex");
		a.add("Jack");
		System.out.println(a);
		a.add("John");
		System.out.println(a);
		a.remove("John");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.indexOf("alex"));

	}

}
