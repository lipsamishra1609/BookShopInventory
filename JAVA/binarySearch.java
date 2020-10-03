import java.util.*;
public class binarySearch {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array-->");
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemets of array-->");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is-->"+Arrays.toString(arr));
		
		System.out.println("Enter the elemet to be searched-->");
		int item = sc.nextInt();
		
		System.out.println("Searching..........");
		int mid = binary(arr,n,0,n-1,item);
		if(mid == -1)
			System.out.println("Item not present in array!");
		else
			System.out.println("Item present at index "+mid);
		
		
	}
	
	public static int binary(int[] a,int n,int l,int r,int item)
	{
	
		if(l<=r)
		{
		   	int mid = (l+r)/2;
			
			if(item==a[mid])
				return  mid;
			else if(item>a[mid])
				return binary(a,n,mid+1,r,item);
			else
				return binary(a,n,l,mid-1,item);
		}
		return -1;
	}

}
