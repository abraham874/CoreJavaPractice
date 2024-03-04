package simple;

public class Instance {
	
	//instance variable
	
	int c =10;
	
	void addtwonumbers(int a, int b) {
		
		//local variable
		int c = 15;
		System.out.println(a+b);
		System.out.println(a+b+c);
		System.out.println(a+b+this.c);
	}

	public static void main(String[] args) {
		
		Instance j = new Instance();
		j.addtwonumbers(30, 45);
		
		

	}

}
