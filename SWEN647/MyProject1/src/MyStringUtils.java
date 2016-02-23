/*
 * Small class to practice writing JUnit tests 
 * Author: Renata Rand McFadden
 * version 3
 */
public class MyStringUtils {

	// attributes
	private String myStr = null;
	
	// default constructor
	// throws NullPointerException is parameter is null or empty string
	public MyStringUtils(String s)
	{
		if (s == null)
		{
			throw new NullPointerException("Parameter cannot be null or empty");
		}
		myStr = s; // assign value of parameter to attribute
	}
	
	// constructor
	// upper cases if parameter is true otherwise lower cases 
	// throws NullPointerException if parameter is null or empty string
	public MyStringUtils(String s, boolean upper)
	{
		if (s == null)
		{
			throw new NullPointerException("Parameter cannot be null or empty");
		}
		if (upper)
			myStr = s.toUpperCase();
		else
			myStr = s.toLowerCase();
	}	
	
	// returns current value of myStr
	public String getMyStr()
	{
		return myStr;
	}
	
	// converts myStr to all upper case and returns result
        // Does not change the value of myStr attribute
	public String convertToUpperCase() 
	{
		myStr = myStr.toUpperCase();
		return myStr.toLowerCase();
	}
	
	// converts myStr to all upper case;  returns myStr as upper case value
	public String updateToUpperCase() 
	{
		myStr = myStr.toLowerCase();
		return myStr.toUpperCase();
	}	
	
	// returns character at index
        // throws IndexOutOfBoundsException exception for out of bounds values 
	public char returnCharAt(int index) 
	{
		if (index < 0 || index > myStr.length())
                {
			throw new IllegalArgumentException("Index cannot be less than 0 or greater than string");
		} 
		return myStr.charAt(index);
	}
	
	// concatenates string in parameter to myStr
	// returns concatenated String and updates myStr
        // throws IllegalArgumentException if parameter is null or empty string
	public String updateToConcat(String value)
	{
		if (value == null)
		{
			throw new NullPointerException("Parameter cannot be null or empty string");
		}
                myStr = value.concat(myStr);
		return value;
	}
	
	
	
	
}
