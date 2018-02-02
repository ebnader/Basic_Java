
public class Method_Type {

	/**
	 * @param args
	 */

		 public static void main(String[] args) {
			  Test1(); //Test1() method called inside main method.
			  Test2();
			  Return_Type();
			  
			  
		 }
			 
			 public static void Test1(){ //Simple Method - Called from main method.
			  System.out.println("Test1 Method Executed.");
			 }
			 
			 public static void Test2(){ //Simple Method - Not called from main method.
			  System.out.println("Test2 Method Executed.");
			 }
			 
			 //Return Type:
			 public static int Return_Type(){ //This method has int return type.
				  int i=10;
				  return i;
				 }
			 public static void Login(String user, String Pass){ //Login is the method name.
				  //Block of code
				 }

}

