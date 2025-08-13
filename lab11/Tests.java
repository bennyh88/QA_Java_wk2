package lab11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {
	Security security;// = new Security();
	
	@BeforeEach
	void setUp() throws Exception {
		security = new Security();
	}

	// userId must not be null
	@Test
	public void testLoginEmptyUserId() {
		String userId = "", password = "Freddy99";
		assertFalse(security.login(userId, password));
	}
	
	// userId must not be spaces. 
	@Test
	public void testLoginSpacesUserId() {
		String userId = "   ", password = "Freddy99";
		assertFalse(security.login(userId, password));
	}
	
	// userId Must be 8 chars minimum.
	@Test
	public void testLoginMinCharsUserId() {
		String userId = "1234567", password = "Freddy99";
		assertFalse(security.login(userId, password));
	}
	
	// password must contain a digit and an upper case char
	@Test
	public void test_login_password_contains_digit_and_upper_char() {
		String userId = "123456789", password = "Freddy99";
		assertTrue(security.login(userId, password));
	}
	
	@Test
	public void test_login_password_contains_digit_no_upper_char() {
		String userId = "123456789", password = "freddy99";
		assertFalse(security.login(userId, password));
	}
	
	@Test
	public void test_login_password_contains_upper_char_no_digit() {
		String userId = "123456789", password = "FreddyNineNine";
		assertFalse(security.login(userId, password));
	}
	
	@Test
	public void test_login_password_contains_no_digit_or_upper_char() {
		String userId = "123456789", password = "freddyninenine";
		assertFalse(security.login(userId, password));
	}
	
	
	@Test
	public void test_password_is_min_8_chars() {
		String userId = "123456789", password = "Freddy9";
		assertFalse(security.login(userId, password));
	}
	
}
