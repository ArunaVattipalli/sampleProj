
public class AnagramChecking {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcaeb";
		if(sort(s1.toCharArray()).equals((sort(s2.toCharArray())))){
			System.out.println("Is Anagram!");
		}
		else {
			System.out.println("Is not Anagram!");
		}		
	}

	static String sort(char[] c) {
		char temp;

		for(int i=c.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(c[j]>c[j+1]) {
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
		return new String(c);
	}
}
