
public class PanagramChecking {
	static boolean[] b1 = new boolean[26];

	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvvbnmlakdeaaqwwertioskdfhgkriejg";
		char[] c1 = s.toLowerCase().toCharArray();
		boolean result = true;
		for(char c : c1) {
			setChar(c);
		}
		for(boolean b:b1 ) {
			result= result && b;
		}
		if(result)
			System.out.println("Is Panagram!");
		else {
			System.out.println("Is Not Panagram!");
		}
	}

	 static void setChar(char c) {
		 if(c>96 && c<123) {
			 int i = c-97;
			 System.out.println(i+"   "+c);
			 b1[i] = true;
		 }
		
	 }

}
