import java.util.Arrays;

public class AllUniqueString {

	public static void main(String[] args) {
		String s = "aesdafegahdeeae";
		char[] chars = s.toCharArray();		
		Arrays.sort(chars);
		int i=0;
		String b = "no";

		while(i<chars.length-1) {

			if(chars[i]==chars[i+1]) {
				b = "";
				break;
			}
			i++;
		}		

		System.out.println(
				String.format("String %s has %s duplicate characters",s,b));
	}

}
