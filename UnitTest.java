package TopCoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testIsInteresting() {
		new InterestingNumber();
		assertEquals("Interesting", InterestingNumber.isInteresting("64200246"));
		assertEquals("Interesting", InterestingNumber.isInteresting("25121005"));
		assertEquals("Interesting", InterestingNumber.isInteresting("31413004"));
		assertEquals("Interesting", InterestingNumber.isInteresting("31213200"));
		assertEquals("Interesting", InterestingNumber.isInteresting("63001316"));
		
		assertEquals("Not Interesting", InterestingNumber.isInteresting("60000006"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("5315135"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("20022002"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("2222"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("401014"));
		
	}

}
