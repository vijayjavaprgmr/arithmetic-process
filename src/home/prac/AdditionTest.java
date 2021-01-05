package home.prac;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
	
	@Test
	public void addTwoNumberTest(){
		
		Addition add = new Addition();
		Assert.assertEquals(10, add.addTwoNumber(5,5));
	}

}
