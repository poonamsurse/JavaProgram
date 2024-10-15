package String;

public class StringRevWithNumber {

	public static void main(String[] args)
	{
		System.out.println('a');
		System.out.println('a'+'b');

		String input = "he2llo34";
		char[] chars = input.toCharArray();
		int left = 0;
		int right = chars.length-1;

		while (left < right) {
			// Skip non-alphabetic characters
			while (left < right && !Character.isLetter(chars[left])) {
				left++;
			}
			while (left < right && !Character.isLetter(chars[right])) {
				right--;
			}

			// Swap letters
			if (left < right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(new String(chars));
	}}
