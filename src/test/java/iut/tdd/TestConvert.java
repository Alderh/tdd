package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}

	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}

	@Test
	public void test_num2text_dixhuit() {
		Assert.assertEquals("dix-huit", Convert.num2text("18"));	
	}

}
