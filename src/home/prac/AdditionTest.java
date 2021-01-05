package home.prac;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
	@Test
	public void addTwoNumberTest(){
		Assert.assertEquals(10, Addition.addTwoNumber(5,5));}
}