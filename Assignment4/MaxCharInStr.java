import java.util.Arrays;

public class MaxCharInStr {

	public static void main(String[] args) {
		String s = "aesdafegahdeeae";
		System.out.println(s);
		char[] chars = s.toCharArray();		
		Arrays.sort(chars);
		s = new String(chars);
		System.out.println(s);
		int i=0;
		int max = 0;
		char maxC=' ';

		while(i< s.length()) {
			char c = s.charAt(i);
			int y = s.lastIndexOf(c);

			if(i==y) {
				i++;
			}
			else {
				if(max <(y-i+1)) {
					max = (y-i+1);
					maxC = c;
				}
				i = y+1;
			}				
		}
		
		if(max>0){
			System.out.println(maxC + " - " + max);
		}
		else {
			System.out.println("No Duplicate charatcers in string");
		}			
	}
}
