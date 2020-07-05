package Ass5;
interface icecream{
	void chocolate(int x,int y);
	
		void laddu();
	
}
 class halwa implements icecream{
	public void chocolate(int x,int y) {
		int a=3;
		int b =4;
		int area= a*b;
		System.out.println(area);
	}
	public void laddu() {
		System.out.println("mothi choor laddu");
	}
	public void halwas() {
		System.out.println("carrot halwa");
	}
}



public class EEmp extends halwa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          halwa c= new halwa();
          c.chocolate(1,2);
          c.laddu();
          c.halwas();
          EEmp ee =new EEmp();
          ee.laddu();
	}
	public void laddu() {
		super.laddu();
		System.out.println("besan laddu");
	}
}
