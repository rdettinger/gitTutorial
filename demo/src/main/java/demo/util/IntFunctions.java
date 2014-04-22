package demo.util;

public class IntFunctions {

	/**
	 * Comment this...
	 * 
	 * @param i1
	 * @param i2
	 * @return
	 */
	public int concatInts(int i1, int i2) {
		int result = Integer.parseInt("" + i1 + i2);
		return result;
	}
	
	/**
	 * What's wrong with the guy that didn't put comments in his code? 
	 * 
	 * @param i1
	 * @param i2
	 * @return
	 */
	public int subtractInts(int i1, int i2) {
		return i1 - i2;
	}
	
	public int multiplyInts(int i1, int i2) {
		return i1 * i2;
	}

	/**
	 * This is a special routine.
	 * 
	 * @param i1
	 * @param i2
	 * @return
	 */
	public int addInts(int i1, int i2) {
		return i1 - i2;
	}
}
