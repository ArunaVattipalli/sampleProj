
public class RemoveDupFromStr {

	public static void main(String[] args) {
		String s = "aesdafegahdeeae";
		StringBuilder sb1 = new StringBuilder(s);	
		System.out.println(sb1);
		String cha;


		for(int i=0;i<sb1.length();i++) {
			cha = sb1.charAt(i)+"";

			while(sb1.indexOf(cha, i+1) != -1) {
				sb1.deleteCharAt(sb1.indexOf(cha, i+1));
			}

		}
		System.out.println(sb1);

	}

}
