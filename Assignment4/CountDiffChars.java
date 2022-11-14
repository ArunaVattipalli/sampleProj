import java.util.Arrays;

public class CountDiffChars {


	public static void main(String[] args) {
		String s1 = "uasYtRED#$Ijng*";
		char[] c1 = s1.toLowerCase().toCharArray();
		int con = 0;
		int vow = 0;
		int spec = 0;

		for(char c:c1) {
			if(c>97&&c<122) {
				if(c==97||c==101||c==105||c==111||c==117)
					vow++;
				else
					con++;
			}
			else
				spec++;
		}		
		System.out.println(s1);		
		System.out.println("Consonents: "+con);
		System.out.println("Vowels: "+vow);
		System.out.println("Special characters: "+spec);
	}
}
