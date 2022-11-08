import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to store = " + "");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements = " + "");
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = scan.nextInt();
			
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate Element in Array is = " + arr[j]);
				}
			}
		}
		scan.close();
		

	}

}
