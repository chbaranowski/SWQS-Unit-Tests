package swqs.text;

import java.util.HashMap;
import java.util.Map;

public class TextParser {

	public Map<String, Integer> parseTextWordCount(String text) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		if(text != null)
		{
			if(!text.trim().isEmpty())
			{
				String[] words = text.split(" ");
				for (String word : words) {
					word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
					if(result.containsKey(word))
						result.put(word, result.get(word)+1);
					else
						result.put(word, 1);
				}
			}
		}
		return result;
	}

}
