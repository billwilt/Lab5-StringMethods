
public class StringLab {

	/*
	 * @author Bill Wilt
	 */
	
	public static void main(String[] args) {
		
		capitalize();
		System.out.println();
		wheresWaldo();
		System.out.println();
		firstThingsFirst();
		System.out.println();
		reverse();
		System.out.println();
		soLong();
		System.out.println();
		afterMath();
		System.out.println();
		letterize();
		
		
	}

	public static void capitalize() {
		String word = "blAZes";
		String wordLower = word.toLowerCase();
		String wordCap = wordLower.substring(0, 1).toUpperCase() + wordLower.substring(1);
		System.out.println(wordCap);
	}
	
	public static void wheresWaldo() {		
		String phrase = "Striped Waldo!";
		System.out.println(phrase.indexOf("Waldo"));
	}
	
	public static void firstThingsFirst() {		
		String a = "tree";
		String b = "pine";
		int compareValue = (a.compareTo(b));
		if (compareValue > 0) {
			System.out.println(b + " " + a);
		} else
			System.out.println(a + " " + b);
	}
	
	public static void reverse() {
		String s = "happy";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
	}
	
	public static void soLong() {
		String a = "bean";
		String b = "pea";
		int aLength = a.length();
		int bLength = b.length();
		if (aLength > bLength) {
			System.out.println(a);
		} else if (aLength < bLength) {
			System.out.println(b);
		} else if (aLength == bLength) {
			System.out.println(a + " " + b);
		}
	}
	
	public static void afterMath() {		
		String phrase = "She aced the mathematics test!";
		int mathCount = (phrase.indexOf("math"));
		int phraseLength = (phrase.length());
		System.out.println(phrase.substring(mathCount, phraseLength));
	}
	
	public static void letterize() {		
		String word = "Java";
		for(int i=0; i<=word.length()-1; i++) {
			System.out.println(word.charAt(i));
		}
	}
	
}

