
public class String_In_Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// this is the main method.when you call a method, it has to be under main method
		Test1(); 
	//only Test1() method is called (inside main method).
		
		  
	 }
	 
	 public static void Test1(){ //Simple Method - Called from main method.
	  System.out.println("Test1 Method Executed.");
	}
	 public static void Test2(){ /*Simple Method - Not called from main method.becouse
	  only Test1() is called*/
		  System.out.println("Test2 Method Executed.");
		 }
}
