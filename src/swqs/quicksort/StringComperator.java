package swqs.quicksort;

import java.util.Comparator;

public class StringComperator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		if(o1.compareTo(o2) > 0)
			return +1;
		else if(o1.compareTo(o2) < 0)
			return -1;
		return 0;
	}

}
