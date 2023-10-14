/**
 * 
 */
package string;

/**
 * @author ARUN
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = new String ("Arun"); //Creating using new keyword
		String b = "Arun"; //String Literal
		if (a == b) {
			System.out.println("==");
			System.out.println("Both Object are Same");
		}
		else if (a.equals(b)) {
			System.out.println(".Equals");
			System.out.println("Both values are Same");
		}
	}

}