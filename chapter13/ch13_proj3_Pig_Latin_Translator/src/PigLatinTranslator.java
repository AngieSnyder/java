
public class PigLatinTranslator {
	private String englishInput;
	private String[] words;
	private String pigLatinOutput;
	
	public PigLatinTranslator(String englishInput) {
		super();
		this.englishInput = englishInput;
	}

	public String getEnglishInput() {
		return englishInput;
	}

	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getPigLatinOutput() {
		return pigLatinOutput;
	}

	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	public String translate() {
		convertToLowercase();
		parseStringToArray();
		removePunctuation();
		for (String s: words) {
			if (startsWithVowel(s)) {
				
			}
			else if (!startsWithVowel(s)) {
				s+="way";
			}
			else if (!startsWithVowel(s)) {
				int i = s.indexOf(ch)
			}
		}	
		return pigLatinOutput;
	}
	private int indexOfFirstVowel(String s) {
		int i = 0;
		for() {
			if (s.startsWith('a')|| s.startsWith('e')|| s.startsWith('i')|| 
					s.startsWith('o')|| s.startsWith('u')) {
				
			}
		}
	}
	private boolean startsWithVowel(String s) {
		boolean startsWithVowel = false;
		if (s.startsWith('a')|| s.startsWith('e')|| s.startsWith('i')|| 
				s.startsWith('o')|| s.startsWith('u')) {
			s += "way";
			startsWithVowel = true;
		return startsWithVowel;
	}
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	private void removePunctuation(); {
		for (String s: words) {
			if (s.endsWith(",")||s.endsWith(".")||s.endsWith("!")||s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0,l-1);
			}
		}
	}
}
