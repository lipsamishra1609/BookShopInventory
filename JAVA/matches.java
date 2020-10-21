import java.util.regex.*;
import java.util.*;
public class matches 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("Enter your mobile no.");
    s=sc.nextLine();
    Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
    Matcher m=p.matcher(s);
    if(m.find()&&m.group().contentEquals(s))
     {
    	 System.out.println("valid moblie no");
     }
    else
    	 System.out.println("wrong no!!!");
    
  }    
}
