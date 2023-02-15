package SumOfDigits;

public class SumOfDigits {

	public int convert(String number) {
		char[] charArray = number.toCharArray();
		int total = 0;
		for (int i=0; i<charArray.length;i++) {
			int digit = Character.getNumericValue(charArray[i]);
			total += digit;
		}
		return total;
	}
}
