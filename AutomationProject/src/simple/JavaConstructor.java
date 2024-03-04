package simple;

public class JavaConstructor {

	//parameterized Constructor

	public JavaConstructor(int a) {

		this.a=a;
	}

	public JavaConstructor(int a, String S) {

		this.a=a;
		this.S=S;
	}

	//instance variable
	
	int a;
	String S;
	
	boolean func1() {
		System.out.println(a+"---->"+S);
		return true;
	}


	public static void main(String[] args) {
		
		JavaConstructor jc = new JavaConstructor(10);
		jc.func1();
		
		JavaConstructor jc1 = new JavaConstructor(50,"Apple");
		jc1.func1();


	}

}
