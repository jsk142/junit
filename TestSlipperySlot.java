import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSlipperySlot {

	@Test
	public void fiveOfAKind() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,3,3,3};
		int payoff = s.payOff(array);
		assertEquals(1000000, payoff);
	}
	
	@Test
	public void fourOfAKind() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,3,3,5};
		int payoff = s.payOff(array);
		assertEquals(10000, payoff);
	}
	
	@Test
	public void fullHouse() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,3,5,5};
		int payoff = s.payOff(array);
		assertEquals(5000, payoff);
	}
	
	@Test
	public void threeOfAKind() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,3,5,7};
		int payoff = s.payOff(array);
		assertEquals(100, payoff);
	}
	
	@Test
	public void pair() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,5,7,11};
		int payoff = s.payOff(array);
		assertEquals(10, payoff);
	}
	
	@Test
	public void twoPair() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,3,5,5,11};
		int payoff = s.payOff(array);
		assertEquals(10, payoff);
	}
	
	@Test
	public void perfectSquare() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,5,7,9,11};
		int payoff = s.payOff(array);
		assertEquals(7, payoff);
	}
	
	@Test
	public void fourtyTwo() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,5,7,11,42};
		int payoff = s.payOff(array);
		assertEquals(2, payoff);
	}
	
	@Test
	public void powerOfTwo() {
		SlipperySlot s = new SlipperySlot();
		int[] array = {3,5,7,11,32};
		int payoff = s.payOff(array);
		assertEquals(3, payoff);
	}	

}