package co.edu.udea.codebreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodeBreakerTest {
	CodeBreaker cbreaker;
	String r;
	@Test
	public void todoX() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("1234");
		assertEquals(" X X X X", r);
	}
	
	@Test
	public void tresX() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("1534");
		assertEquals(" X X X", r);
	}
	
	@Test
	public void dosX() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("1637");
		assertEquals(" X X", r);
	}
	
	@Test
	public void unaX() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("9538");
		assertEquals(" X", r);
	}
	
	@Test
	public void dosXDos_() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("1243");
		assertEquals(" X X _ _", r);
	}
	
	@Test
	public void UnaXTres_() {
		cbreaker= new CodeBreaker();
		r= cbreaker.breaker("1342");
		assertEquals(" X _ _ _", r);
	}
	
	@Test
	public void cuatro_() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("2143");
		assertEquals(" _ _ _ _", r);
	}
	
	@Test
	public void sinAcierto() {
		cbreaker=new CodeBreaker();
		r= cbreaker.breaker("5689");
		assertEquals("", r);
	}

}
