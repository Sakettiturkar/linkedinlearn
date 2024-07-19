
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
        int b = 0;
        int c = a + b;
        int d = a * b;
        /*
        1. Exception handling
        2. Error handling (best program will do this)
        */
        int e = 0;  
		if(b == 0) {
        System.out.println("Division is not possible");
        }
		int f = a % b;
        
        System.out.println("Addition: " + c);
        System.out.println("Addition: " + d);
		System.out.println("Addition: " + e);
        System.out.println("Addition: " + f);
	}

}
