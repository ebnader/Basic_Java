import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Junit_Test {
	@Before
	public void methodnameOne(){
		System.out.println("One");
		
	}
	@Test
	public void methodnameTwo(){
		System.out.println("Two");
		
	}
	@After
	public void methodnameThree(){
		System.out.println("Three");
	}

}
