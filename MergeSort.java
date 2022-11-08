import java.util.*;
public class MergeSort {
	public static void conquer(int arr[], int sidx, int mid, int eidx)
	{
		int merged[] = new int[eidx - sidx + 1];
		int k = 0;//for keeping the track of newly created merged array
		int i = sidx;//for starting index of left array
		int j = mid+1;//for starting index of right array
		while(i <= mid && j <= eidx)
		{
			if(arr[i] <= arr[j])
			{
				merged[k] = arr[i];
				k++;
				i++;
			} else {
				merged[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid)
		{
			merged[k] = arr[i];
			k++;
			i++;
		}
		while(j <= eidx)
		{
			merged[k] = arr[j];
			k++;
			j++;
		}
		//for loop for storing the merged array into the original array
		for(int m = 0, n = sidx; m < merged.length; m++, n++)
		{
			arr[n] = merged[m];
		}
		
	}
	
	public static void divide(int arr[], int sidx, int eidx)//for dividing the original array for required purpose
	{
		if(sidx >= eidx)
		{
			return;
		}
		int mid = sidx + (eidx-sidx)/2;//finding the mid element
		divide(arr, sidx, mid);//left array
		divide(arr, mid + 1, eidx);//right array
		conquer(arr, sidx, mid, eidx);//method for conquer declared above the divide method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements = ");
		int a = scan.nextInt();
		System.out.print("Enter the Elements = ");
		int arr[] = new int[a];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Entered Array is = ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		int p = arr.length;
		
		
		
		System.out.println("Sorted Array =");
		divide(arr, 0, p-1);
		for(int elem:arr)
		{
			System.out.println(elem + " ");
		}
		scan.close();

	}
	

}
