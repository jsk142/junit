import java.util.Random;
import java.util.Vector;

public class BetterSlot {
	
	public int[] pullTheLever() {
		Random r = new Random();
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(50) + 1;
		}
		
		return array;
	}
	
	public int payOff( int[] values ) {
		int payoff = 0;
		boolean[] valid = new boolean[5];
		Vector<Integer> frequency = new Vector<Integer>();
		
		for (int i = 0; i < values.length; i++) {
			valid[i] = true;
		}
		
		for (int i = 0; i < values.length; i++) {
			if (valid[i] == true) {
				int count = 1;
				
				for (int j = i + 1; j < values.length; j++) {
					if (values[i] == values[j]) {
						valid[j] = false;
						count++;
					}
				}
				
				frequency.add(count);
			}
		}
		
		boolean fiveOfAKind = false;
		boolean fourOfAKind = false;
		boolean fullHouse = false;
		boolean threeOfAKind = false;
		boolean pair = false;
		
		for (int i = 0; i < frequency.size(); i++) {
			if (frequency.elementAt(i) == 5) {
				fiveOfAKind = true;
			}
		}
		
		for (int i = 0; i < frequency.size(); i++) {
			if (frequency.elementAt(i) == 4) {
				fourOfAKind = true;
			}
		}
		
		for (int i = 0; i < frequency.size(); i++) {
			if (frequency.elementAt(i) == 3) {
				threeOfAKind = true;
				
				for (int j = 0; j < frequency.size(); j++) {
					if (frequency.elementAt(j) == 2) {
						fullHouse = true;
					}
				}
			}
		}
		
		for (int i = 0; i < frequency.size(); i++) {
			if (frequency.elementAt(i) == 2) {
				pair = true;
			}
		}
		
		if (fiveOfAKind) {
			payoff = payoff + 1000000;
		}
		else if (fourOfAKind) {
			payoff = payoff + 10000;
		}
		else if (fullHouse) {
			payoff = payoff + 5000;
		}
		else if (threeOfAKind) {
			payoff = payoff + 100;
		}
		else if (pair) {
			payoff = payoff + 10;
		}
		
		boolean perfectSquare = false;
		boolean fourtyTwo = false;
		boolean powerOfTwo = false;
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 1 || values[i] == 4 || values[i] == 9 || values[i] == 16 || values[i] == 25 ||
				values[i] == 36 || values[i] == 49) {
				perfectSquare = true;
			}
			
			if (values[i] == 42) {
				fourtyTwo = true;
			}
			
			if (values[i] == 1 || values[i] == 2 || values[i] == 4 || values[i] == 8 || values[i] == 16 || 
				values[i] == 32) {
				powerOfTwo = true;
			}
		}
		
		if (perfectSquare) {
			payoff = payoff + 7;
		}

		if (fourtyTwo) {
			payoff = payoff + 2;
		}
		
		if (powerOfTwo) {
			payoff = payoff + 3;
		}
		
		return payoff;
	}

}
