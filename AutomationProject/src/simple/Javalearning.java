package simple;

public class Javalearning {

	public static void main(String[] args) {
		
	/*	int pen = 10;
		int spepen = 20;
		int mycost = 5;
		if(mycost>spepen) {
			System.out.println("You can buy the special pen");
		}
		else if (mycost>pen) {
			System.out.println("You can buy this pen");
		}
		else {
			System.out.println("You cant buy this pen");
		}
		
		
		for(int i=0; i<=5; i++) {
			System.out.println("Batman");
		}
		
		
		
		int a=7;
		while(a>3) {
			System.out.println("While loop");
			a--;
		}
		*/
		
//		String veg[]={"Carrot","Beans","Lemon"};
//		
//		for(String vegs : veg) {
//			System.out.println(vegs.toString());
		
		Javalearning yt = new Javalearning();
		yt.createphone("Apple Iphone 13");
		yt.createphone("Apple iphone 15");
		yt.createphone(58000);
		yt.createphone(80000);
		
		
		}
	public void createphone(String phonename) {
		System.out.println("Phone name is -- "+phonename);
	}

		public void createphone(int phoneprice) {
			System.out.println("Phone price is -- "+phoneprice);
	}

}
