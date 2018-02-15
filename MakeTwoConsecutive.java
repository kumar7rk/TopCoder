public class MakeTwoConsecutive{
	public static String solve(String S){
		for(int i=0; i<S.length();i++){
			String s1 = S.substring(0,i);
			String s2 = S.substring(i+1);
			
			String finalS = s1+s2;
			
			String value = check(finalS);
			if(value.equals("Possible")) return value;
		}
			return "Impossible";
	}
	public static String check(String finalS){

		for(int i=0;i<finalS.length()-1;i++){
        	char c = finalS.charAt(i);
            char c1 = finalS.charAt(i+1);
			if(c==c1) return "Possible";	
		}
		return "Impossible";
	}	
}