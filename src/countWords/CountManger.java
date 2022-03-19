package countWords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountManger {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Integer> words=new HashMap<String, Integer>();
		countWords("src/countWords/wordsToCount.txt",words);
		System.out.println(words);
	}

	
	//## Below function coounts the number of words in a file which receives fileName and an object of Map interface####
	static void countWords(String filename, Map<String, Integer>words) throws FileNotFoundException {
		
		Scanner file = new Scanner (new File(filename));
		while (file.hasNext()) {
			
			String word = file.next();  // Getting each words
			Integer count = words.get(word);
			if(count!=null) {   // If word is repating
				count++;
				words.put(word,count);
			}
				else {       // If word is new while the loop runs
				count=1;
				words.put(word,count);
				}
				
			
		}
		file.close();
	}
}
