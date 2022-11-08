import java.util.*;
public class QuickSort {
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j = low; j < high; j++)
		{
			if(arr[j] < pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return (i+1);
	}
	
	
	public static void quickSort(int arr[], int low, int high){
		if(low < high)
		{
			int piv = partition(arr, low, high);
			quickSort(arr, low, piv-1);
			quickSort(arr, piv+1, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements = ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements as per your choice = ");
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered array is = " + "");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int m = arr.length;
		System.out.println("Sorted Array is =");
		quickSort(arr, 0, m-1);
		for(int elem: arr) {
			System.out.print(elem + " ");
		}
		sc.close();
	}

}