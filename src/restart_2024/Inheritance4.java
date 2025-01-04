package restart_2024;

public class Inheritance4 extends Inheritance3{
	
	public void multiply(int x, int y) {
		
		z = x*y;
		System.out.println(z);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 100; int y = 200;
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y);
		i4.substract(50, 22);
		i4.multiply(x, y);

	}

}
