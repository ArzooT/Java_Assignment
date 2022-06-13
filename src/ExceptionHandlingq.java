
public class ExceptionHandlingq {

	String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("A");
System.out.println("B");
System.out.println("C");
try
{  int i =9/0;
ExceptionHandlingq q=new ExceptionHandlingq();
q.name=null;
q.name="arzoo";
	}
catch(ArithmeticException e) {
	System.out.println("Arithmatic exception is coming");
	 e.printStackTrace();
	 
	
}
catch(NullPointerException  e) {
	System.out.println("Null exception is coming");
	 e.printStackTrace();
	 
	
}
System.out.println("Bye");
	}

}
