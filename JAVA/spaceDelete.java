
public class spaceDelete
{

	public static void main(String[] args)
	{
	StringBuffer s1=new StringBuffer("i am a boy");
	
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)==' ')
		{
			s1=s1.deleteCharAt(i);
		}
	}

	System.out.println(s1);

	}

}
