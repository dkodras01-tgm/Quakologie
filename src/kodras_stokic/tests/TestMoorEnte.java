package kodras_stokic.tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import kodras_stokic.MoorEnte;

import org.junit.Before;
import org.junit.Test;

public class TestMoorEnte {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setup() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testQuaken() {
		MoorEnte me = new MoorEnte();
		me.quaken();
		assertEquals("Quack",outContent.toString());
	}
	
	@Test
	public void testToString() {
		MoorEnte me = new MoorEnte();
		assertEquals("Moor Ente",me.toString());
	}
}