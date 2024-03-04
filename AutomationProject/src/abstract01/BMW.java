package abstract01;

public class BMW extends Car {
	
	public void engine() {
		
		System.out.println("BMW SECRET");
		
	}
	
	public void brake() {
		
		System.out.println("Braking Performance");
	}

	public static void main(String[] args) {
		
		Car b = new BMW();
		b.engine();
		b.brake();

	}

}
