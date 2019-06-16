package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	
	public static void main(String[] args) {
		
		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("Prideful");
		adjectives.add("Greedy");
		adjectives.add("Lustful");
		adjectives.add("Envious");
		adjectives.add("Gluttonous");
		adjectives.add("Wrathful");
		adjectives.add("Slothful");
	
	//I opted for singular nouns here
	
	ArrayList<String> sNoun = new ArrayList<String>();
	sNoun.add("Lucifer");
	sNoun.add("Mammon");
	sNoun.add("Asmodeus");
	sNoun.add("Leviathan");
	sNoun.add("Beelzebub");
	sNoun.add("Satan");
	sNoun.add("Belphegor");
	
	for (int i = 0; i < 7; i++) {
		
		int x = new Random().nextInt(adjectives.size());
		int y = new Random().nextInt(sNoun.size());
		
		System.out.println(adjectives.get(x)+ " " + sNoun.get(y));
		
	}
	
	
}
	

}


	
