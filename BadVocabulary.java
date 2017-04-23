package TopCoder;

public class BadVocabulary {

	public static void main(String[] args) {
		String badPrefix = "leyxtuebkyrrhjdnuglixbyszioyeomrumopiuquujmbs";
		String badSuffix = "rqoxbxwfvogfefkstdofudqovklewoznfpmimjnkzupeb";
		String badSubstring = "byuhpbburpqeawapxqwneebpulpqdvtgvpnmqohkgzoix";
		String []vocabulary = {"sjccfacrpfljzkzwqsqsypacebsazbfrkjtsmxjbdwnchmazhq", "kolnkenagsuehrnilwcyvphinhelsgdevothsghzabfhutqiru", "mykyewqwjhsnypchsmexgtxejxtxnfezeoailqgwzajxpmfjal", "nclcyztqeqjkmyaaqojawkqfihgfpcpegchgbawfrhsffsfvip", "ejlremwymqjcheevatolrqaefohadkrjuebaqzaepkgzqluqel", "idjmvaqqlsurkriylesxmtbvraqccrynxhbujrkwlhnxywwlcq", "fsxgugxblwcmzzfgqwlcltxprfmgxbfevelqlkryjvkkupqmld", "wzkugulajpsbcbqvpyrwmdmgmqrlqudpvnjdjxfumxwqymlqmf", "vrnteyvyszqybsjkbdhdlnkktljbgxveqkxvjuvbwlaxfljirq", "jgggnsdgrrlxsplsaylgvkhgiyupiucrdlxqdcywvjtozegzfr", "voerapatklwybbckaupuskqipayhbgqwuwqulspxemvfnzsntj", "eqomnsvgbbluvcnzxshcifquyzsvnytuojgeeckhdybbarayjh", "pknkjjalkctlfelygkucoinuxjxhlibasqmdaoomqhzvnkwtwq", "hceqimpfdxzfoeqnwvrurnekbfrjgwdnaheivtpyspfivyvsvm", "cupsontgijgedwpjatlldrjgujxujhdldsfrizzsifwlbowehk", "tduodgrrcavrwclsxhxpgugfqkshwypsdlijsbawbxnazauwis", "rbsemvbrftcflvgtbszyvwsgnsagaicrjwyxtboyutfhqlarec", "tlgnfqbrcfxfkvboqhutwvamwtkmmsbfdjuizxbdcykovlflvb", "shgzjmbrtuimecoerhxixuwcthswoiljrriafjuyfekjgynxfn", "roobxaqbfpdmzlhpuqdpwrxuirdbmwedmtgjtykanpmnbwcxmh", "grwgfsbqenigunpqvrpwwtwhirupepqkjntohugmkougdlzycq", "lcfxmajxerwzvnjvkuphyntakalwjcmwguuvudsywpzuclrmfg", "gmjnvwwbjqkmufcnmvvvwyzbfvwxdorlcbyzzwblmlxisaxgxt", "bsvyvgagksbyamjpyhxadsuuimmmcebfyweteebpyenztyqtfn", "btrcuyytwbjpplqnlsmmdyzchreezbzauqfrrfknitexgvnrpz", "wprcriejptnzzpfshfgzbouzuqgkbfwzupbnxgxmzmlydtskaa", "leyxtuebkyrrhjdnuglixbyszioyeomrumopiuquujmbszvivk", "tizprosqcuxlpnzendstxbikyrfgmrvfzuuqkojpigaavbgigy", "yfzomjxsqpwhtckakldgtwnlbudislzqsbgekgxbvtiqyuriiw", "ddzlpyeuermzylvveijnxuvzuqaaagzdlyrayvwcoidnwbialt", "nrwgaluoyisswwbkwallagvblblcssogjkmlwiawtuopsqcosp", "ichegcoyacillaevcjeyjlcvxitmiazqfiwllkmlpuzcudyzpe", "fbqttmuwgqzqjpcnonpvhvwllhrujbmqfejyqduyttociqsyfh", "mibjejdjnphrvtmbeicqipgxejthgfqsprdtdgeqwojthwwogy", "pmdatxjstvzygctmvblutvbsidgehpqyctyxsjplermnvfzrim", "knucvjewsfckewgwttoiruwockquzlfjzzluksqexuodtwzoqq", "wjkvzmfpieboqcpdwavpevlvyerasjqruamuptlxzmlpobtndq", "rhhtkoweovivoseimqhxukujodxocggtoopaeleshmnxhthvmp", "vkfihhlpljfsauxcrpjybwynjzuuepezcljjuuafgfzgbwivor", "buxjvpktghpjoaoolymqrpjcltkegopiimrdddzjkouaplpajd", "bxdbeisllxyehuikubjxfahozzzwpfjqfmsjwmuhjulsowclxn", "xnakjytihgqkgkbspdidrymqwzcsubktqkezkzhsgzcolfjair", "sbymhleiteqxycvybozqpvlucdicwoeopfaxsgfmnxjlbfldvk", "oqmuxefqldqaxtmieelecpcspdslccdqurmuvtmgzchyxvicbu", "nbhpvrubxdtobxjbwcmlprebeagftotisaxnttrqwmezjoahqn", "mnzqzcxsmdoprqwxztsotkfysbypvudhjfakhxdtbtkukgtlbl", "scubgfxtjdhynrmgvpjuaviwyzjpbustxovftuaezhenzqtwhf", "owwnoptavsccwxhjpswiqfgapaqhndkdcgtqyoqvguyeufqlzm", "xyqaunkpzssbkxjjkuvwikrjnnmnodrmejoyyypythzfekorhk", "jbofclxivznuajjczhkwvjkjkncexcfigvqignteoiypujttqd"};
		int res = count(badPrefix,badSuffix,badSubstring,vocabulary);
		System.out.println(res);
	}
	public static int count(String badPrefix, String badSuffix, String badSubstring, String[] vocabulary) {
		int count = 0;
		for (String word : vocabulary) 
			if (word.startsWith(badPrefix) || word.endsWith(badSuffix) || word.matches("^.+"+badSubstring+".+$")) count++;
		return count;
	}
}
