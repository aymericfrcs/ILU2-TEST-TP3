package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	

	@Test
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
}
