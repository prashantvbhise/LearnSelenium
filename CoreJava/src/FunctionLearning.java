
public class FunctionLearning {

	public static void main(String[] args) {
		helloWorld();		
		areaOfCircle(30);		
		areaOfCircle(40);		
		addition(5, 6);
		substraction(20, 10);

	}
	private static void substraction(int i, int j) {
		int k =i-j;
		System.out.println("Substraction of "+i +" & " +j +" is " +k);

	}
	private static void addition(int a, int b) {
		int c =a+b;		 
		System.out.println("Addition of "+a +" & " +b +" is " +c);
	}
	private static void areaOfCircle(int radius) {
		float pi= 3.14f;
		float area = 2*pi*radius;
		System.out.println("Area of circle is " +area);
	}
	private static void helloWorld() {
		System.out.println("Hello World!!");

	}

}
