package programmingknowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCamTest {

	@Test
	public void Concattest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
