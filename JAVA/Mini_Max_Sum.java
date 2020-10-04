import java.util.*;
public class Mini_Max_Sum {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemets of array of size 5-->");
		long[] arr = new long[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The array is-->"+Arrays.toString(arr));
		long max=0;
		long min=0;
		for(int i=0;i<5;i++)
		{
			if(i!=0)
			{
				max = max + arr[i];
			}
			if(i!=4)
			{
				min = min + arr[i];
			}
			
		}
		System.out.println("The max is-->"+max);
		System.out.println("The min is-->"+min);
		
	}

}
