package Ass5;

public class Loadmethod {

	public static void main(String[] args) {
		motor m = new motor();
		m.car();
		m.car(3);
		m.car(4, 5);
		m.car1("rolls royce");
		
		
		
		
		
	}	
	public static  class motor{
		public static void car() {
	System.out.println("limo");

	}
		public static void car(int x) {
			System.out.println("solar car");

			}
		public static void car(int x, int y) {
			System.out.println("hummer");

			}
		public static String car1(String a) {
			
			 return a;
			}
}
}