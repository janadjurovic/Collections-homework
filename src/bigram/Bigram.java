package bigram;

import java.util.Map.Entry;
import java.util.HashMap;

public class Bigram {

	public static void main(String[] args) {
		HashMap<String, Integer> mapaFrekvencija = new HashMap<>();
		String bigram = "abbcceeeeeeabcc";
		
		for (int i = 1; i < bigram.length(); i++) {
			if(mapaFrekvencija.containsKey(bigram.substring(i-1, i+1))){
				mapaFrekvencija.replace(bigram.substring(i-1, i + 1), mapaFrekvencija.get(bigram.substring(i-1, i + 1)) + 1);
			}
			else{
				mapaFrekvencija.put(bigram.substring(i-1, i+1), 1);
			}
			
		}
		for(Entry<String, Integer> entry : mapaFrekvencija.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
