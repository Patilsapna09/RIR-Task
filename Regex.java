package task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
	
	 public static boolean isValid(String s)
	    {
	 
	        Pattern p = Pattern.compile(
	            "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
	 
	        Matcher m = p.matcher(s);
	 
	        return (m.matches());
	    }
	 
	  
	    public static void main(String[] args)
	    {
	 
	        String s = "+1 212 555-3458";
	        String s_1 = "+4934 351 125-3456";
	        
	        if (isValid(s))
	 
	            System.out.println("Valid Number");
	        else
	 
	            System.out.println("Invalid Number");
	 
	     
	        if (isValid(s_1))
	 
	          
	            System.out.println("Valid Number");
	        else
	 
	            
	            System.out.println("Invalid Number");
	    }
	}



