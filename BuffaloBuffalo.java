public class BuffaloBuffalo{
	public String check(Strng s){
		String ng = "Not good";
		String g = "Good";
		
		if(s.length()<1) return ng;
		
		String trim = s.trim();
		if(!trim.equals(s)) return ng;
		
		String split[] = s.split(" ");
		for(String s1 :split){
			if(!s1.equals("buffalo"){
				return ng;
				
			}
		}
		return g;
			
	}
}