import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the number of Elements = ");
		int n = scan.nextInt();
		System.out.println("Enter the Elements = ");
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Entered Array is = ");
		for(int elem: arr)
		{
			System.out.println(elem + " ");
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
			    if(arr[j] < arr[i])
			    {
			    	int temp = arr[i];
			    	arr[i] = arr[j];
			    	arr[j] = temp;
			    }
			}
		}
		System.out.println("Sorted Array is = ");
		for(int array: arr)
		{
			System.out.println(array + " ");
		}
		scan.close();

	}

}
