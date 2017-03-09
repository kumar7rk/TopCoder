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
	@Test
	public void testIsLongest(){
		new Reppity();
		assertEquals(5, Reppity.longest("ABCDEXXXYYYZZZABCDEZZZYYYXXX"));
		assertEquals(6, Reppity.longest("abcdabcdabcdabCD"));
		assertEquals(25, Reppity.longest("abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy"));
		assertEquals(21, Reppity.longest("againANDagainANDagainANDagainANDagainANDagain"));
		assertEquals(0, Reppity.longest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX"));
		assertEquals(4, Reppity.longest("ABCDEFGHIJKLMNOPabcdabcda"));
		assertEquals(4, Reppity.longest("abcdabcdABCDEFGHI"));
		assertEquals(24, Reppity.longest("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		assertEquals(10, Reppity.longest("RustyoldmanrustyoldmanRustydustyoldman"));
		assertEquals(20, Reppity.longest("aaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbb"));
		assertEquals(16, Reppity.longest("kkdkkdkdkdkdkdkdkdkdkdkdkdkdkdkdkdkdkddkkd"));
		
		
		
	}

}
