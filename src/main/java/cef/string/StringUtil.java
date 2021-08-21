package cef.string;

public class StringUtil {

	public static boolean isFirstLetterVowel(String word) {

		String firstLetter = word.substring(0, 1);
		if (isCharVowel(firstLetter))
			return true;
		else
			return false;
	}

	public static boolean isCharVowel(String letter) {
		String lowed = letter.toLowerCase();
		if (lowed.equals("a") || lowed.equals("e") || lowed.equals("i") || lowed.equals("o") || lowed.equals("u"))
			return true;
		else
			return false;
	}

}
