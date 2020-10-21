
public class wordCapital
{
     public static void main(String args[])
     {
    	 String s1="java is great";
    	 char str[]=s1.toCharArray();
    	 str[0]=(char) ((int)str[0]-32);
    	 for(int i=0;i<s1.length();i++)
    		 
    	 {
    		 if(str[i]==' ')
    		 {
    			 str[i+1]=(char) ((int)str[i+1]-32);
    		 }
    	 }
    	 for(int i=0;i<str.length;i++)
    	 {
    		 System.out.print(str[i]);
    	 }
     }
	
}
