
public class Palindrome {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("2552");
		StringBuffer s2  = s1.reverse();

		if(s1.compareTo(s2)==0) {
			System.out.println(10+20+" is palindrome!");
		}
		else {
			System.out.println(s1+" is not palindrome!");
		}
	}
}
