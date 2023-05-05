package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	

/*	@Test
	void wlcmTestName() {
		assertEquals(Welcome.welcome("Bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}

	@Test
	void wlcmTestNullOrEmpty() {
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
	}
	
	@Test
	void wlcmTestUpperCase() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY !");
	}
	
	@Test
	void wlcmTestTwoNames() {
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
	}
	
	@Test
	void wlcmTestSeveralNames() {
		assertEquals(Welcome.welcome("amy,bob,jerry"), "Hello, Amy, Bob, Jerry");
		assertEquals(Welcome.welcome("amy,bob,jerry,tom,Tom, yazid"), "Hello, Amy, Bob, Jerry, Tom, Tom, Yazid");
	}
	
	@Test
	void wlcmTestSeveralNamesScream() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("amy,BOB,JERRY"), "Hello, Amy. AND HELLO, BOB, JERRY !");
		assertEquals(Welcome.welcome("BOB,JERRY,AMY"), "HELLO, BOB, JERRY, AMY !");
	} */ 
	
	//Les anciens tests ne passent plus car on a modifié la forme du message à l'ITER_7
	
	@Test
	void wlcmTestAnd() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob,amy,Jerry"));
		assertEquals("HELLO, AMY AND BOB !", Welcome.welcome("AMY,BOB"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob,AMY,JACK,jerry"));
	}
}
