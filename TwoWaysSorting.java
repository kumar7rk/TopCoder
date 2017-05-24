package TopCoder;

public class TwoWaysSorting {
	public static void main(String[] args) {
		String[] stringList = 
			{"l", "ikuz", "rkarowluagylidigangqotntwhpolrvgw", "geudeuyjztapwekpdfnrgojgoibirtbemzychccopxsem", "zfdfowfrtylutqdkqoseernymcrrwnjppgxbrkbiesjqjhodno", "zfczbsippgcpfdigbztzedgbypefbypcutmtp", "zakoxt", "jourahqtczxatmcqaigbivigtw", "erxniziblcxysbarxkefywzrudid", "kligxogtotucgtxdfofl", "xpj", "fltikqahxqbyfpikaukayvgwedimcxhusfmfsznpxtvxlydfb", "kfiqmkwbqjuwipqcc", "ljkgsogcbitmkgmrkkogxj", "ifvudksrgjpy", "tqnksklnwazifcyrkfw", "mmhapopctvbtjdfszqfgtyvnylziutaeqxc", "chyklqgoljm", "zawuokqcuczggwnqmxhkgbiepnhrdxxhkbyi", "sqestyahzwgxdd", "bxbzsbzu", "swelcpomqjfrvbfojpgmbdzx", "lttkvcl", "vafyhulsaltibmscwmmmqohajwretdrdmpjacoqurv", "triuevrrdtvtortnhx", "nyxbuccsa", "exwbuzokeyimwmuhoibpooawsqfizpcqmbncotdb", "nsaanblewrciyluhprvcyqedjrplacaxawoctfc", "firuqpdmdzujrvpasliwhqogmlwmcrf", "bwryiwmicyzbappgbauvdcftdiutwnvddy", "xglfncezviqjhmakkqdhvvgxtcgxdjnrfhuatmextdwgedyi", "owbexmaajsfvhkhiarzaubh", "hbvjygbotkeofpasqobbaywtyfageksslasnwfsjm", "ezmzjaecpyitb", "fzrjjcjfig", "istnoxqdlwxkgwzbmdypwkxox", "ecenqcziyzquviffogfpajbsvkr", "oddohwgoevpkyglsonfmzfqgrnrxkygqamtrpoddloxouhl", "uwindmlalxytsxlissrwdklkopwzcf", "mifkavjirorfkepyjkoxmwaexgqgpeqcqsdaamdnvrrx", "pefvhfxxxjgqsrqsxlnllvwvajieenkwesewqrzzrsn", "lvibhpjhbdnfgjfdsftknfijqwnxb", "xiklwohgyahifbelchmsejwnklkxttgpxdxyes", "kpmvhtstgcgxjblqjgeqhbfqlpzpasbsbuasytevuruymw", "fgfmbuywkoczpna", "cjmtdwqzkrxbmuplkfrhn", "qhawn", "au", "pakovgzebahmopgi", "iuiqplzgfdwataqjxmkgyilswhmtoosx"}	
		;
		String res = sortingMethod(stringList);
		System.out.println(res);
	}

	public static String sortingMethod(String[] stringList) {
		boolean lexo = true;
		boolean length = true;
		for (int i = 0; i < stringList.length-1; i++) {
			String s1 = stringList[i];
			String s2 = stringList[i+1];
			if (s1.compareTo(s2)>0) {
				lexo=false;
				break;
			}
		}
		for (int i = 0; i < stringList.length-1; i++) {
			String s1 = stringList[i];
			String s2 = stringList[i+1];
			if (s1.length()>s2.length()) {
				length=false;
				break;
			}
		}
		if (lexo&&length) return "both";
		if (lexo) return "lexicographically";
		if (lexo&&length) return "lengths";
		return "none";
	}
}
