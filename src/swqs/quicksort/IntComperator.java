package swqs.quicksort;

import java.util.Comparator;

public class IntComperator implements Comparator<Integer> {
	
	protected int compareInt(int o1, int o2) {
		if(o1 > o2)
			return +1;
		else if(o1 < o2)
			return -1;
		return 0;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return compareInt(o1, o2);
	}

}
