package bigram;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class Bigram {

	public static void main(String[] args) {
		HashMap<String, Integer> mapaFrekvencija = new HashMap<>();
		String bigram = "abbcceeeeeeabcc";
		Scanner in = new Scanner(System.in);

		for (int i = 1; i < bigram.length(); i++) {
			if (mapaFrekvencija.containsKey(bigram.substring(i - 1, i + 1))) {
				mapaFrekvencija.replace(bigram.substring(i - 1, i + 1),
						mapaFrekvencija.get(bigram.substring(i - 1, i + 1)) + 1);
			} else {
				mapaFrekvencija.put(bigram.substring(i - 1, i + 1), 1);
			}

		}

		for (Entry<String, Integer> entry : mapaFrekvencija.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("Unesite bigram : \n");
		String unos = in.nextLine();
		char c = ' ';
		for (int i = 0; i < 3; i++) {
			int pom = 0;
			for (Entry<String, Integer> e : mapaFrekvencija.entrySet()) {
				if (e.getKey().charAt(0) == unos.charAt(unos.length() - 1) && e.getValue() > pom) {
					c = e.getKey().charAt(1);
					pom = e.getValue();
				}
			}
			unos += c;
		}
		System.out.println(unos);
	}

}
