package method;

public class Son extends Parent {

	public void marriage() {
		System.out.println("MY DECISION");
	}

	public static void main(String[] args) {
		
		Parent p = new Son();
		p.property();
		p.marriage();



	}

}
