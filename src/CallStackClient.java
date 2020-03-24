
public class CallStackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodA();
	}
	
	public static void methodA() {
		System.out.println("In methodA()");
		methodB();
		System.out.println("In methodA()");
	}
	
	public static void methodB() {
		System.out.println("In methodB()");
		methodC();
		System.out.println("In methodB()");
	}
	
	public static void methodC() {
		System.out.println("In methodC()");
	}

}
