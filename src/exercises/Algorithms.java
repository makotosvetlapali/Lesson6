package exercises;

import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if(egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		return null;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

}
