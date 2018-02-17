public class StringHalving{
	public static String lexsmallest(String s){
        char smallest = s.charAt(0);
        char[] count = new char[123];
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)<smallest) smallest = s.charAt(i);
            count[s.charAt(i)]++;
            if(count[s.charAt(i)]==2) return smallest+"";                     
		}
        return "";
	}
}