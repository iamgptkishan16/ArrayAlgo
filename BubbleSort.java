import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Elements = ");
		int n = sc.nextInt();
		System.out.print("Enter the elements = ");
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Entered Array is = ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 1; j < arr.length; j++)
			{
				if(arr[j] < arr[j-1])
				{
					//swapping will be done here
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println("Sorted Array is = ");
		for(int elem: arr)
		{
			System.out.print(elem + " ");
		}
		sc.close();

	}

}
