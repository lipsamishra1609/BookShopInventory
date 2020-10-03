import java.util.*;
public class Kth_smallest {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases-->");
		int t = sc.nextInt();
		int[] num = new int[t];
		int q = 0;
 		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the size of array-->");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the elemets of array-->");
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.println("Enter K-->");
			int k = sc.nextInt();
			Arrays.sort(arr);
			num[q] = arr[k-1];
			q++;
			
		}
 		for(int i=0;i<t;i++)
 		{
 			System.out.println(num[i]);
 		}
	}

}
