package restart_2024;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defining  multi dimensional array
		
		int a[][] = {{1,2,3,0,}, {5,6,7,8}, {2,4,6,8}, {3,6,9,1}};
		
		//Total number of row
		int row = a.length;  //lenght is property of an array not a method
		System.out.println("Total rows is " +row);
		
		//total column
		int column = a[0].length;
		System.out.println("Total column is " + column);
		 
		
		//Print all data in matrix form
		
		//outer loop
		for(int i=0; i<row; i++) {
			
			//inner loop
			for(int j = 0; j<column; j++) {
				
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
