import java.lang.UnsupportedOperationException;
import java.util.Scanner;
import java.util.Hashtable;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// parse the number of strings
		int numStrings = Integer.parseInt(sc.nextLine());

		// parse each string
		String[] stringsArray = new String[numStrings];
		for (int i = 0; i < numStrings; i++) {
			stringsArray[i] = sc.nextLine();
		}

		// print whether there are duplicates
		System.out.println(hasDuplicates(stringsArray));
	}

	private static boolean hasDuplicates(String[] stringsArray) {
		/*
		 * Given an array of strings
		 * Returns true if there are no duplicates in the array
		 * Returns false if there are duplicates in the array
		 * Should have a linear time complexity
		 * The best datastructure is a hashset
		 */
		Hashtable<String, Integer> uniqueWords = new Hashtable<String, Integer>();

		for (int i = 0; i < stringsArray.length; i++) {//iterate through stringsArrayElements
			if (uniqueWords.put(stringsArray[i], 1) != null) { //put returns the previous value, if it was assigned then it is a duplicate
				return true;
			}
		}
		return false;
	}
	/*
	 * Hash Set Implementation:
	 * Set<String> uniqueWords = new HashSet<String>();
	 * for (int i = 0; i < stringsArray.length; i++) {
	 * 	if (uniqueWords.contains(stringsArray[i]){
	 * 		return true;
	 * }
	 *  else { 
	 *  	uniqueWords.add(stringsArray[i];
	 *  }
	 * }
	 * return false;
	 * 
	 */
}