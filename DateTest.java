import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testGetMonth() {
		Date fakeDate = new Date("February", 9, 2003);
		int expected = 2;
		assertEquals(fakeDate.getMonth(), expected);
	}
	
	@Test 
	public void testGetDay() {
		Date fakeDay = new Date("March", 23, 2002);
		int expected = 23;
		assertEquals(fakeDay.getDay(), expected);
	}
	
	@Test
	public void testGetYear() {
		Date fakeYear = new Date("September", 19, 2005);
		int expected = 2005;
		assertEquals(fakeYear.getYear(), expected);
	}
	
	@Test
	public void testMonthString() {
		Date fakeDate = new Date();
		int num = 1;
		String expected = "January";
		assertEquals(fakeDate.monthString(num), expected);
		
	}
	
	@Test 
	public void testMonthOk() {
		Date fakeDate = new Date();
		String month = "February";
		assertEquals(fakeDate.monthOK(month), true);
	}
	 
}
