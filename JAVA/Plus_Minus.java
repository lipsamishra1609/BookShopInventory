import java.util.*;
public class Plus_Minus {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array-->");
		int n = sc.nextInt();
		
		System.out.println("Enter the elemets of array-->");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is-->"+Arrays.toString(arr));
		
		float pos=0,neg=0,zero=0;
		float p,x,z;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				pos++;
			}
			else if(arr[i]<0)
			{
				neg++;
			}
			else if(arr[i]==0)
			{
				zero++;
			}
		}
		p = (float) (pos/n);
		x = (float) (neg/n);
		z = (float) (zero/n);
		System.out.format("%.6f", p);
		System.out.format("%.6f", x);
		System.out.format("%.6f", z);
		
	}
}
