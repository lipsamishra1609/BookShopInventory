package practice;

public class Equals_to {
	String name;
	int roll;
	Equals_to(String name,int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	public boolean equals(Object obj)
	{
		if(obj == this)
		{
			return true;
		}
		if(obj instanceof Equals_to)
		{
			Equals_to s = (Equals_to)obj;
			if(name.equals(s.name) && roll == s.roll)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		Equals_to s1 = new Equals_to("JJ",101);
		Equals_to s2 = new Equals_to("JJJ",102);
		Equals_to s3 = new Equals_to("JJ",101);
		Equals_to s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("JJ"));
		System.out.println(s1.equals(null));
	}

}
