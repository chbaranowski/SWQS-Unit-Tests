package swqs.coverage;

public final class SumUtil {
	
	public static int sum(int values[], int offset){
		int result = 0;
		for (int value : values) {
			if(offset > 0){
				if(offset < value)
					result += offset;
			}
			result += value;
		}
		return result;
	}
	
}
