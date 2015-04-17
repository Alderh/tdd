package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	
	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	
	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	
	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	
	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	
	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	
	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	
	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	
	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	
	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	
	@Test
	public void test_num2text_dix() {
		Assert.assertEquals("dix", Convert.num2text("10"));
	}
	
	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}
	
	@Test
	public void test_num2text_douze() {
		Assert.assertEquals("douze", Convert.num2text("12"));
	}
	
	@Test
	public void test_num2text_treize() {
		Assert.assertEquals("treize", Convert.num2text("13"));
	}
	
	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}
	
	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals("quinze", Convert.num2text("15"));
	}
	
	@Test
	public void test_num2text_seize() {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	
	@Test
	public void test_num2text_dixsept() {
		Assert.assertEquals("dix-sept", Convert.num2text("17"));
	}

	@Test
	public void test_num2text_dixhuit() {
		Assert.assertEquals("dix-huit", Convert.num2text("18"));	
	}
	
	@Test
	public void test_num2text_dixneuf() {
		Assert.assertEquals("dix-neuf", Convert.num2text("19"));
	}
	
	@Test
	public void test_num2text_vingt() {
		Assert.assertEquals("vingt", Convert.num2text("20"));
	}
	
	@Test
	public void test_num2text_vingt_deux() {
		Assert.assertEquals("vingt-deux", Convert.num2text("22"));
	}
	
	@Test
	public void test_num2text_trente_trois() {
		Assert.assertEquals("trente-trois", Convert.num2text("33"));
	}
	
	@Test
	public void test_num2text_quanrante_et_un() {
		Assert.assertEquals("quarante-un", Convert.num2text("41"));
	}
	
	
	@Test
	public void test_num2text_soixante_huit() {
		Assert.assertEquals("soixante-huit", Convert.num2text("68"));
	}

}
