import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class testMyStringsUtils extends TestCase {

	@Test
		
	//Tests the default constructor 
	public void testDefaultConstructor()
	{
		MyStringUtils string = new MyStringUtils("Melanie");
		assertEquals("Melanie", string.getMyStr().toString());
		
		
	}
	
	//Test ConvertToUpperCase(). The method should make the string have all upper case letters, but it makes 
	// the string have all lower case letters. 
	public void testConvertToUpperCase()
	{
		MyStringUtils string = new MyStringUtils("Melanie");
		assertFalse("MELANIE".equals(string.convertToUpperCase().toString()));
		assertEquals("melanie", string.convertToUpperCase().toString());
	}

	public void testUpdateToUpperCase() 
	{
		MyStringUtils string = new MyStringUtils("Melanie");
		assertTrue("MELANIE".equals(string.updateToUpperCase().toString()));
		assertFalse("melanie".equals(string.updateToUpperCase().toString()));
	}
	
}
