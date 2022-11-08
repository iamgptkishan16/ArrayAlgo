import java.util.*;
public class SubArray {
	public static boolean isSubArray(int arr1[], int arr2[], int n, int m)
	{
		int i = 0;
		int j = 0;
		while(i < n && j < m)
		{
			if(arr1[i] == arr2[j])
			{
				i++;
				j++;
				if(j==m)
				return true;
			}
			else {
				i = i - j + 1;
				j = 0;
			}
		}
		return false;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements for Original Array = ");
		int x =  scan.nextInt();
		System.out.println("Enter the elements for Original Array = ");
		int arr1[] = new int[x];
		int n = arr1.length;
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = scan.nextInt();
		}
		System.out.println("Entered Original Array = ");
		for(int elem1: arr1)
		{
			System.out.println(elem1 + " ");
		}
		System.out.println("Enter the number of elements for the Array to be checked = ");
		int y = scan.nextInt();
		System.out.println("Enter the elements for the Array to be checked = ");
		int arr2[] = new int[y];
		int m = arr2.length;
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = scan.nextInt();
		}
		//System.out.println("Entered Original Array = ");
		//for(int elem1: arr1)
		//{
		//	System.out.println(elem1 + " ");
		//}
		System.out.println("Entered Array to be Checked = ");
		for(int elem2: arr2)
		{
			System.out.println(elem2 + " ");
		}
		System.out.println("Array to be checked is a sub Array of Original Array = ");
		if (isSubArray(arr1, arr2, n, m))
		{
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
     scan.close();
	}

}
