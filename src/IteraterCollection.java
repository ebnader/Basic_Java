import java.util.HashSet;
import java.util.Iterator;

public class IteraterCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs = new HashSet<>();
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add("milk");
		hs.add("Suger");
		System.out.println(hs);
//		System.out.println(hs.size());
//		System.out.println(hs.remove(3));
//		System.out.println(hs.getClass());
		//hs.add("hello");
		Iterator<Object> i = hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		while(i.hasNext()){
			System.out.println(i.next());
	}

}
}