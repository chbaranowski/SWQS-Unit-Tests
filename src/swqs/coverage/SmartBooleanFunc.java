package swqs.coverage;

public final class SmartBooleanFunc {
	
	public static boolean aAndbOrC(boolean A, boolean B, boolean C) {
		if(A && B || C){
			return true;
		}
		else {
			return false;
		}
	}
	
}
