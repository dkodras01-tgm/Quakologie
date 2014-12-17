package kodras_stokic.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import kodras_stokic.MoorEnte;
import kodras_stokic.StockEnte;

import org.junit.Before;
import org.junit.Test;

public class TestStockEnte {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final String seperator = System.getProperty("line.separator");
	
	@Before
	public void setup() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testQuaken() {
		StockEnte me = new StockEnte();
		me.quaken();
		assertEquals("Quack"+seperator,outContent.toString());
	}
	
	@Test
	public void testToString() {
		StockEnte me = new StockEnte();
		assertEquals("StockEnte",me.toString());
	}
}