package restart_2024;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,45,6};
		
		String s [] = {"Hi", "Ketan"};
		
		Object obj [] = {1,2,3,4,5, "Selenium", 11.45};
		
		System.out.println(a.length);
		System.out.println(s.length);
		System.out.println(obj.length);
		
		System.out.println(a[4]);
		
		System.out.println(s[0]);
		
		System.out.println(obj[6]);
		
		a[4] = 1000; //modifying an array value using index
		
		System.out.println(a[4]);

	}

}
