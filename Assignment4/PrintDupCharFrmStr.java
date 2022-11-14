import java.util.Arrays;

public class PrintDupCharFrmStr {

	public static void main(String[] args) {
		String s = "aesdafegahdeeae";
		char[] chars = s.toCharArray();		
		Arrays.sort(chars);
		s = new String(chars);
		System.out.println(chars);
		int i=0;


		while(i< s.length()) {
			char c = s.charAt(i);

			if(i==s.lastIndexOf(c)) {
				i++;
			}
			else {
				System.out.print(c+" ");
				i = s.lastIndexOf(c)+1;
			}				
		}
	}
}
