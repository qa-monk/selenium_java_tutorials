package restart_2024;

public class Array3 {
	
	static int a [] = {22, 2, 21, 44, 22};
	
	
	public static void passingArray() {
		
		int b = a[0];
		
		for(int i =0; i<a.length; i++) {
			if(b>=a[i]) {
				System.out.println(b);
			}else {
				System.out.println("ABCD");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		passingArray();

	}

}
