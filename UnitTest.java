package TopCoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

//	@Test
	public void testIsInteresting() {
		new InterestingNumber();
		assertEquals("Interesting", InterestingNumber.isInteresting("64200246"));
		assertEquals("Interesting", InterestingNumber.isInteresting("25121005"));
		assertEquals("Interesting", InterestingNumber.isInteresting("31413004"));
		assertEquals("Interesting", InterestingNumber.isInteresting("31213200"));
		assertEquals("Interesting", InterestingNumber.isInteresting("63001316"));
		
		assertEquals("Not Interesting", InterestingNumber.isInteresting("60000006"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("5315135"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("20022002"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("2222"));
		assertEquals("Not Interesting", InterestingNumber.isInteresting("401014"));
		
	}
//	@Test
	public void testIsLongest(){
		new Reppity();
		assertEquals(5, Reppity.longest("ABCDEXXXYYYZZZABCDEZZZYYYXXX"));
		assertEquals(6, Reppity.longest("abcdabcdabcdabCD"));
		assertEquals(25, Reppity.longest("abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy"));
		assertEquals(21, Reppity.longest("againANDagainANDagainANDagainANDagainANDagain"));
		assertEquals(0, Reppity.longest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX"));
		assertEquals(4, Reppity.longest("ABCDEFGHIJKLMNOPabcdabcda"));
		assertEquals(4, Reppity.longest("abcdabcdABCDEFGHI"));
		assertEquals(24, Reppity.longest("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
		assertEquals(10, Reppity.longest("RustyoldmanrustyoldmanRustydustyoldman"));
		assertEquals(20, Reppity.longest("aaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbbaaaaabbbbb"));
		assertEquals(16, Reppity.longest("kkdkkdkdkdkdkdkdkdkdkdkdkdkdkdkdkdkdkddkkd"));
	}
//	@Test
	public void testIsFindBest(){
		new MagicSubset();
		assertEquals(1416, MagicSubset.findBest(new int []{-38, 76, 4, 79, -26, -23, 6, -73, 92, -44, 13, -38, -39, -100, 6, 86, 
				  -66, -71, 82, -100, -29, 84, 65, -40, -48, 97, -22, 10, -67, 86, -76,
				  -32,-9, 83, -30, 70, 61, -76, -40, -32, -26, -61, -88, 89, -31, 57, -91,
				   80, 66, 95}));
		assertEquals(51, MagicSubset.findBest(new int []{0, -4, -3, -44, 1}));
		assertEquals(190, MagicSubset.findBest(new int []{10, -1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 4, 2, 5, 7, 8, 2, 10, -1, -42, 13, 41, 1, 1, 1, 1, 1, 3, 5, -24, 4, 1, 5, 2, 4, 4, 6, 8, 9, 4, 2, 6, 7, 9, 1}));
		assertEquals(567, MagicSubset.findBest(new int []{22, 15, -38, 4, -23, -44, -29, -27, 39, -5, -9, -16, 2, -44, 28, -45, -27, -50, -6, 45, 25, 26, -47, -24, -29, -1, 48, 2, 11, -35, 24, -3, -24, -27, 35, 19, -5, 28, -9, 47, 19, 10, -22}));
		assertEquals(527, MagicSubset.findBest(new int []{30, 15, -27, 4, 46, -12, 42, -21, -20, 30, 38, -6, -23, -45, 5, -40, 22, -4, 37, 32, -46, -29, -29, 35, 3, 47, -14, 17, 49, -4, 17, 10, -15, -5, -32, -42, -15, 13, 49, -15, -47, -17, 16}));
		assertEquals(625, MagicSubset.findBest(new int []{-8, 2, -10, -24, -33, -29, -16, 0, 35, 48, -2, 15, 13, 16, 36, -42, 25, -14, -22, 19, -11, 34, -14, -22, -41, 46, -50, 28, 43, 20, 45, -2, 44, -2, 5, 29, -44, -16, 8, -49, 36, 21, -29, -18, -34, -47, -46}));
		assertEquals(565, MagicSubset.findBest(new int []{-43, 10, -40, 17, -16, 7, -47, -48, 35, 7, -21, -8, 32, 47, 11, -34, -25, -4, -31, 17, 30, -16, 19, 2, 35, 40, 25, 26, -13, 47, -39, -42, 6, -47, 33, -48, -4, -5, 36, -34, 27, 2}));
		assertEquals(593, MagicSubset.findBest(new int []{-12, -30, 49, 44, -27, -26, 48, 29, -30, 43, 19, -8, 7, 9, 41, 10, 2, -1, -11, -37, 35, 13, 6, -44, 34, 42, 44, -32, -36, 20, 18, 14, 40, -30, -8, 20, -23, -29, 6, -22, -41}));
		assertEquals(746, MagicSubset.findBest(new int []{-38, 4, 34, 32, 37, -30, -13, -37, 27, 43, 36, -38, -26, 41, -22, 35, 49, 46, -17, 14, -41, -44, 8, 24, -35, 6, 36, -45, 38, 16, -30, -49, 13, -5, -28, 19, 9, 1, 12, -41, 19, 21, 5, 10, 18, -17, -6, 43, 50, -6}	));
		assertEquals(506, MagicSubset.findBest(new int []{24, -17, 16, 3, -7, 41, -31, -25, 46, -41, -37, -2, 3, -17, 14, -4, 12, 29, -38, -29, -26, 45, -25, 0, -46, 49, -21, 15, 1, 34, 48, 13, 33, -25, 20, 40, 44, -29, -1, -49}	));
		}
//	@Test
	public void testIsCanPronounce() {
		new Pronunciation();
		assertEquals("", Pronunciation.canPronounce(new String[]{"All", "of", "these", "are", "not", "difficult"}	));
		assertEquals("REALLY", Pronunciation.canPronounce(new String[]{"The", "word", "REALLY", "is", "really", "hard"}	));
		assertEquals("", Pronunciation.canPronounce(new String[]{"AA", "Aa", "aA", "aa", "EE", "ee", "Ee", "eE", "Ii", "iI", "II", "ii", "OO", "oo", "Oo", "oO", "UU", "Uu", "uU", "uu"}	));
		assertEquals("alsoimpossibletopronounce", Pronunciation.canPronounce(new String[]{"Yumm", "yoop", "buy", "SAY", "yy", "TY", "YAYO", "alsoimpossibletopronounce", "reallydifficult"}	));
		assertEquals("eJoi", Pronunciation.canPronounce(new String[]{"OcTOvmoomtEEE", "AjUmgoLVeeemIIIIFoobw", "LAAbuuuuVfohBETeeejaaaaHv", "OPenifXEEEkeXEEEzxIIqzuuuteemVIIII", "xbIIIIxIIIsuQgooZOqDuSiiii", "opUUUxEEEETEEEEqVuriiiibUUUXtUUU", "ajQooSINPuuuunEjPaaaj", "pxEEE", "oBxaaaaDOOBuuugooJcoooYeMpIIIIqGiiiyUUb", "hQEEEVUUUCiiPugHAASJEEEEH", "eJoi"}	));
		assertEquals("AxUiUUQeeePf", Pronunciation.canPronounce(new String[]{"sjuuuu", "qxOOOdLap", "UNCooNAAAACiiiTD", "JFUCEtOPAAAAddiiiiLipuCYiiii", "AKsOOOOsAlFoooswiiwIIItIIVoooovFEE", "LxOwAANAPOOVqUUhVuuuufIY", "aDMeeSCOOOOKXOOzzUUM", "Vxooorpiiii", "OgDaaatuuuutuuuxDuuuuGaaaamHIIBjaDII", "ogAASUXOOOOYOOOOwoooJgiisUnnUfc", "adjEMJIIItWUUUYCeeeeZ", "eSAAANdoVqeWgUUUS", "lUUUqEEEHiiibiiiicakv", "aQee", "erPIIIIL", "RwAAAAqJagDOOOOxRAAAXICUUUUhtObCEEEV", "hsUUURPIIIquuuSmoooSSAMoooowK", "BSUUUWQ", "YjOOOOWOpb", "DCI", "iDooooJoooohXOOOCAMaahhoooHeeeeCDomUUUHfEv", "KgeefuuuubaaaTbUUUUt", "TaaaQdoopbuPuNrAAAA", "KnAAAlavOteyBeeeRiiziFpIJKooooJFaBAAAlx", "yUUURBafGuuuZyuFMeeGQeejV", "UTeeWJiiiiBZooooWUsGuuuGDEEEDyeeCwUUUU", "IsIIVvaaakDeepOOOO", "rooJmuGaZUUUykaaaP", "UPGIIIIWUqFAAATtoozZUUUU", "NdeeBIIIINuCpaafeeeeX", "QCiiVBIIIpj", "AduuuqEEEEsUUUgIIIMIIIIZItzoooo", "Ree", "AlziiikiiSkuuuuJpuuuuLX", "AxUiUUQeeePf", "TyEEqlAARObLEDxOheeesIIl", "iLjAAAAMoooWBOOOw"}	));
		assertEquals("", Pronunciation.canPronounce(new String[]{"AyGoocoooNXOOOOTqaNGeeeeD", "oKVUUGBaaVIIIxiii", "upeffUUDv", "Urq", "rquuuuYAAAAhaaVEEEEcm", "QdOCMiizdidUUUU", "AfyOOOOrooooHfeeeR", "E", "PIvtooojUUUUpooPeeewAAzjiipCuuFuuufooof", "hLoFAHUUUsLoooBIIIfiiiicGAAAArvUUUU", "uNuhEEEcYELY", "CuuuuRNeeeQiiimWiiiiwUUTCIIlEEEElwEDbuu", "uMiCjiiiVEEEEhIIIID", "iXiicCUUUjteeelaaaJyIIQEEEzZaFkULoooo", "OxVIIIInOOOwEEEEYEEBEEEEpVago", "lHeeTcibeeeeZCaBiiikP", "ZbaQKIPVOOOVLuuuuFiiiicKiPK", "SsasAmiiiVOOOOsezJeeeejtePb", "KUUUqeeCUUUUSi", "wAWUUvAAApOODdaaaaTc", "armEEEE", "ilaaRIIIIYeeexSUUUUYOOO", "IZIIIIKriyEEEEfxEEEETAARlUUUUVaqGooooxnuwB", "aMJOOgV", "vFiiiVUUUMhUCQ", "RiiiiSiiiiZiiiiNgeeeex", "hIcQuKfAAAALIIIpaaaaJOOOgoooJaaTIMKEKE", "GuuuuCAAARaaaQwAAAmGuuuunAAAVquuuHJO"}	));
		assertEquals("igEEEEJiiiiRIIIIgOOgSIIpifkfOOOy", Pronunciation.canPronounce(new String[]{"kAAAAnIbooHPIIIIzx", "EREEEZIIwoooChookUfTIpuuYD", "izQOOOO", "bOOg", "AQMIIItoooofqaYlejeeeeGZEFaaaa", "ytOOOhAABTUUUSOOOVVIIIIY", "ACuuuuvsUSoTinDiiiq", "BuNiii", "ErmUUUUnEETduuuyHuuuumUUUUYipgOOs", "iVJuudfURbUUUURDOOOOk", "SiiiFyUUhOhFetR", "XUUUUyWeevyIIII", "eDAAkaaaaNWOOOPiiiNkIHr", "avIIIFxiiiiXRiiiifXUUUjaaaaqz", "pOOOOjOOvceeeemEEEEqIIMZiiiqfuuuuVUUUv", "igEEEEJiiiiRIIIIgOOgSIIpifkfOOOy", "TAAAr", "SooXiqmaaaa"}	));
		assertEquals("PhinoodooiHdeeeetTuuyiisuFvUUUUzLeeebuuy", Pronunciation.canPronounce(new String[]{"aCyoooJOOOO", "jOOOcmaaaayFEEEXuuXeLOOOcqEEEEmIIIvXuuuu", "YavAAFIIyIITJUU", "pAAAAVraavV", "yLaaaaRIIhaKFAAAAwFuHxeevuupLUUUUQIIIIFboooH", "epPIWNOOOOQvoHOOOOPehIIBEEEErkiiiip", "OVuWuuuveeeebFIB", "aTUUUROsEEEhnUKnIIIIDz", "UQyoSUUNPeeeejAfWoGaaaHUBxIIIIz", "ORVOVMiiikFiiyqaaaak", "OvliHIIXmAcoofuuuumiiif", "oPELARPAAAAKhEZAAAfkEZaaTr", "PhinoodooiHdeeeetTuuyiisuFvUUUUzLeeebuuy"}	));
		assertEquals("preaogative", Pronunciation.canPronounce(new String[]{"irresistable", "preaogative", "uttermost", "importance"}	));
		assertEquals("layhuubiPXAdbucAGmmm", Pronunciation.canPronounce(new String[]{"DJiiiKooCEEEkIIItDuuuD", "iyfoooqMiiTleegIyUUUf", "HaaBIIIILUG", "layhuubiPXAdbucAGmmm"}	));
		assertEquals("AAAAAAAAAAAAAAaarggghh", Pronunciation.canPronounce(new String[]{"a", "Aa", "aaa", "AAaA", "AAAAA", "aAAaAA", "aaaaaaaaaaaaaaaaaaaaaaAA", "aaaaaaaaaaaaaaaaaarg", "AAAAAAAAAAAAAAaarggghh"}	));
		assertEquals("YYY", Pronunciation.canPronounce(new String[]{"THE", "LAST", "WORD", "IS", "YYY"}	));
		
	}
//	@Test
	public void testIsComplete(){
		new TriFibonacci();
		assertEquals(6, TriFibonacci.complete(new int[] {1, 2, 3, -1}	));
		assertEquals(110, TriFibonacci.complete(new int[] {10, 20, 30, 60, -1, 200}	));
		assertEquals(510, TriFibonacci.complete(new int[] {10, 7, 10, 27, 44, 81, 152, 277, -1}	));
		assertEquals(999985	, TriFibonacci.complete(new int[] {-1, 7, 8, 1000000}	));
		assertEquals(3000000, TriFibonacci.complete(new int[]{1000000, 1000000, 1000000, -1}	 ));
		assertEquals(37, TriFibonacci.complete(new int[] {1, 2, 3, 6, 11, 20, -1}	));
		assertEquals(12, TriFibonacci.complete(new int[]{4, 3, 5, -1, 20, 37, 69, 126, 232, 427, 785, 1444, 2656, 4885}	 ));
		assertEquals(6 , TriFibonacci.complete(new int[] {8, 9, -1, 23, 38, 67, 128, 233, 428, 789, 1450, 2667, 4906, 9023, 16596, 30525, 56144}	));
		assertEquals(1, TriFibonacci.complete(new int[] {-1, 1, 1, 3, 5, 9, 17}	));
		assertEquals(30, TriFibonacci.complete(new int[] {10, 20, -1, 60}	));
		assertEquals(7, TriFibonacci.complete(new int[] {1, 2, -1, 10}	));
		assertEquals(200, TriFibonacci.complete(new int[] {-1, 100, 200, 500}	));
		assertEquals(1, TriFibonacci.complete(new int[] {1, 1, -1, 3}		));
		assertEquals(4162, TriFibonacci.complete(new int[] {8, 1, 10, 19, 30, 59, 108, 197, 364, 669, 1230, 2263, -1, 7655, 14080, 25897, 47632, 87609, 161138}		));	
		assertEquals(-1, TriFibonacci.complete(new int[] {1, 2, 3, 5, -1}	));
		assertEquals(-1, TriFibonacci.complete(new int[] {1, 1, -1, 2, 3}	));
		assertEquals(-1, TriFibonacci.complete(new int[] {1, 1, -1, 4, 10}	));
		assertEquals(-1, TriFibonacci.complete(new int[] {-1, 4, 5, 7}	));
		assertEquals(-1, TriFibonacci.complete(new int[]{1, 2, 10, -1, 11, 11, 11, 11}	 ));
		assertEquals(-1, TriFibonacci.complete(new int[]{1, 2, 3, -1, 1000}	 ));
		assertEquals(-1, TriFibonacci.complete(new int[] {-1, 1, 2, 33, 33}	));
		assertEquals(-1, TriFibonacci.complete(new int[] {1, 2, 3, 5, -1, 6}		));
		assertEquals(-1, TriFibonacci.complete(new int[] {5, 5, 6, -1, 3}		));
		assertEquals(-1, TriFibonacci.complete(new int[] {100, 100, -1, 10}		));
		assertEquals(-1, TriFibonacci.complete(new int[] 	{5, 4, 8, 16, 29, 54, -1}		));
		assertEquals(-1, TriFibonacci.complete(new int[] 	{8, 2, 4, 14, 20, 38, 72, 130, 239, 442, 812, -1, 2748, 5054}		));
		
		assertEquals(1, TriFibonacci.complete(new int[] 	{-1, 2, 3, 6, 11}	));
		
		}
	
//	@Test
	public void isMinNumber(){
		new SwappingDigits();
		assertEquals("1491727554", SwappingDigits.minNumber("5491727514"));
		assertEquals("13218910471211292496", SwappingDigits.minNumber("93218910471211292416"));
		assertEquals("18326141480732117541253865198977", SwappingDigits.minNumber("78326141480732117541253865198971"));
		assertEquals("139613437590740162597117122494746452", SwappingDigits.minNumber("539613437590740162597117122494746412"));
		assertEquals("16854862076732652850188638348854394974", SwappingDigits.minNumber("36854862076732652850188638348854194974"));
		assertEquals("194942081261163258228432722866534327494995", SwappingDigits.minNumber("994942081261163258228432722866534327414995"));
		assertEquals("1000000000000000000000000000000000000000000000012", SwappingDigits.minNumber("1100000000000000000000000000000000000000000000002"));
		assertEquals("10234", SwappingDigits.minNumber("10234"));
		assertEquals("1111111111111111111111111151121583579914657455348", SwappingDigits.minNumber("1111111111111111111111111551121583579914617455348"));
		assertEquals("2222222222222222222222222867882774696898476664944", SwappingDigits.minNumber("2222222222222222222222226867882774696898476264944"));
		assertEquals("12346895", SwappingDigits.minNumber("12364895"));
		assertEquals("1224335475686798678976867867", SwappingDigits.minNumber("1234325475686798678976867867"));
		assertEquals("10810384765827364534537652", SwappingDigits.minNumber("12810384765827364534537650"));
		assertEquals("10134132454134522", SwappingDigits.minNumber("10234132454134512"));
		assertEquals("5689", SwappingDigits.minNumber("5986"));
		assertEquals("10218913471211292416", SwappingDigits.minNumber("13218910471211292416"));
		
		assertEquals("18326141480732117541253865198977", SwappingDigits.minNumber("78326141480732117541253865198971"));
		assertEquals("139613437590740162597117122494746452", SwappingDigits.minNumber("539613437590740162597117122494746412"));
		assertEquals("18326141480732117541253865198977", SwappingDigits.minNumber("78326141480732117541253865198971"));
		assertEquals("139613437590740162597117122494746452", SwappingDigits.minNumber("539613437590740162597117122494746412"));
		}
	//@Test
	public void isWinnings(){
		new BlackjackWinner();
		assertEquals(10, BlackjackWinner.winnings(10, 20, 0, 21, 0));
		assertEquals(-26, BlackjackWinner.winnings(26, 21, 1, 21, 0));
		assertEquals(150, BlackjackWinner.winnings(100, 25, 0, 21, 1));
		assertEquals(-78, BlackjackWinner.winnings(78, 22, 0, 23, 0));
		assertEquals(-20, BlackjackWinner.winnings(20, 21, 1, 21, 0));
		assertEquals(0, BlackjackWinner.winnings(20, 21, 1, 21, 1));
		assertEquals(30, BlackjackWinner.winnings(20, 21, 0, 21, 1));
		assertEquals(-80, BlackjackWinner.winnings(80, 24, 0, 24, 0));
		assertEquals(-68, BlackjackWinner.winnings(68, 17, 0, 27, 0));
		assertEquals(-100, BlackjackWinner.winnings(100, 19, 0, 22, 0));
		assertEquals(30, BlackjackWinner.winnings(20, 20, 0, 21, 1));
		assertEquals(0, BlackjackWinner.winnings(2, 21, 1, 21, 1));
		assertEquals(-10, BlackjackWinner.winnings(10, 25, 0, 25, 0));
		
		}

	//@Test
	public void isFind(){
		new SearchBox();
		assertEquals(48, SearchBox.find("aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aaa aa", "aa", "Y", 1));
		assertEquals(17, SearchBox.find("All in all youre just another brick in the wall", "just", "Y", 17	));
		assertEquals(9, SearchBox.find("bAab aaBaBa Ab aa abbb ab ba aaba aab Ba aba aa a", "Ba", "N", 8	));
		assertEquals(7, SearchBox.find("bAab aaBaBa Ab aa abbb ab ba aaba aab Ba aba aa a", "Ba", "N", 6	));
		assertEquals(-1, SearchBox.find("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAB", "N", 0	));
		assertEquals(30, SearchBox.find("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB", "AAAAAAAAAAAAAAAAAAB", "N", 0	));
		assertEquals(0, SearchBox.find("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Y", 0	));
		assertEquals(-1, SearchBox.find("A", "C", "N", 0	));
		assertEquals(-1, SearchBox.find(" abc", "abc", "Y", 5	));//
		assertEquals(1, SearchBox.find(" abc", "abc", "Y", 0	));//
		assertEquals(45, SearchBox.find("WWXY uoOXoy YXUXwwoWYwyWxuxWyUuxyXxy yyOUoWWWXX", "XX", "N", 33	));
		assertEquals(-1, SearchBox.find("wXw wYwOyuyWW", "yWW", "Y", 6	));
		assertEquals(-1, SearchBox.find("yXxWYoOWXWwwOOU O oXOwwx oWwxy OuyOUYYoYwWWwY ", "wwOOUOoXOwwxoWwx", "N", 6	));
		assertEquals(10, SearchBox.find("wWyWWwoW OwXWWOOWyWOU", "wXW", "N", 3	));
		assertEquals(-1, SearchBox.find("XXOxxYWYXUOYYxyoYOYoxOYXuuOyxxUUuXUYuxWWyXOXUxU ", "UUuXU", "N", 43));
		assertEquals(-1, SearchBox.find("UW Xw uUoouXuxO", "o", "Y", 6	));
		assertEquals(-1, SearchBox.find("OWUuWxYyywWuWUyxwXOWoU O", "yywWuWUyxwXOWoU", "N", 22	));
		assertEquals(-1, SearchBox.find("abc", "d", "N", 1	));

		assertEquals(-1, SearchBox.find("abctt rabc uabc", "abc", "Y", 0	));
		assertEquals(5, SearchBox.find("abcd abc", "abc", "Y", 0	));
		assertEquals(8, SearchBox.find("abc abc bc", "bc", "Y", 1	));
		assertEquals(4, SearchBox.find("abc e", "e", "Y", 3	));
		assertEquals(9, SearchBox.find("ab ba ab a", "a", "Y", 0	));
		assertEquals(7, SearchBox.find("a abcd bcd", "bcd", "Y", 3	));
		assertEquals(20, SearchBox.find("Teachers leave them kid", "kid", "Y", 1	));
		assertEquals(31, SearchBox.find("Teachers leave them kids alone kid haha", "kid", "Y", 1	));
		assertEquals(45, SearchBox.find("raising the somehadkj adfhkajdshfjkadfasdklj the", "the", "Y", 15	));
		assertEquals(17, SearchBox.find("yes i am fool so oo you", "oo", "Y", 0	));
		}
	//@Test
	public void isListen(){
		new ListeningSongs();

		assertEquals(4, ListeningSongs.listen(new int[] {300, 200, 100}, new int[]{400, 500, 600},17 ,1 ));
		assertEquals(2, ListeningSongs.listen(new int[]{300, 200, 100}, new int[]{400, 500, 600}, 10, 1	));
		assertEquals(5, ListeningSongs.listen(new int[]{60, 60, 60}, new int[]{60, 60, 60}, 5, 2));
		assertEquals(7, ListeningSongs.listen(new int[]{120, 120, 120, 120, 120}, new int[]{60, 60, 60, 60, 60, 60}, 10, 3));
		assertEquals(22, ListeningSongs.listen(new int[]{196, 147, 201, 106, 239, 332, 165, 130, 205, 221, 248, 108, 60}, new int[]{280, 164, 206, 95, 81, 383, 96, 255, 260, 244, 60, 313, 101}, 60, 3	));
		 
		assertEquals(-1, ListeningSongs.listen(new int[]{100, 200, 300}, new int[]{100, 200, 300}, 2, 1	));
		assertEquals(-1, ListeningSongs.listen(new int[]{100, 200, 300, 400, 500, 600}, new int[]{100, 200}, 1000, 3	));
		assertEquals(171, ListeningSongs.listen(new int[]{1117, 3332, 3314, 1808, 146, 1570, 3390, 3580, 1479, 2261, 402, 1441, 2192, 3369, 1165, 2453, 2316, 3073, 2486, 2587, 2902, 166, 3563, 2653, 189, 1675, 917, 2271, 955, 372, 319, 306, 1938, 1867, 2054, 2025, 1671, 1843, 298, 3090, 2338, 640, 2765, 2765, 2244, 329, 3452, 959, 1637, 2337, 1781, 938, 2444, 1743, 1825, 867, 3358, 976, 3078, 712, 1289, 3337, 2794, 1461, 3438, 1247, 1720, 1508, 1325, 253, 2832, 62, 833, 1997, 1061, 1311, 560, 913, 505, 431, 3190, 2226, 1309, 327}, new int[]{2203, 3075, 1134, 1960, 450, 612, 906, 3514, 2183, 99, 3210, 2021, 3122, 1329, 1763, 2681, 1522, 995, 977, 590, 1226, 1979, 135, 3561, 2832, 2415, 392, 715, 2875, 3476, 983, 1477, 1244, 2057, 1671, 3470, 903, 2518, 3383, 3027, 851, 1286, 3282, 2207, 850, 3279, 1287, 606, 2508, 2205, 2971, 133, 2418, 3047, 1929, 1649, 155, 2261, 598, 2971, 2136, 1521, 847, 3321, 1813, 2459, 1484, 950, 3211, 3101, 2211, 2296, 787, 1892, 903, 1577, 3406, 424, 2123, 2313, 2569, 3329, 2387, 3221, 2775, 2550, 3104}, 7857, 44	));
		assertEquals(-1, ListeningSongs.listen(new int[]{1580, 1563, 1322, 3135, 1610, 2015, 1018, 2501, 3460, 519, 1111, 2155, 1246, 1238, 2998, 1057, 1043, 1657, 1414, 3296, 625, 1142, 376, 246, 2151, 2866, 3290, 3256, 2310, 1626, 189, 290, 1424, 3286, 1659, 2974, 3535, 2618, 168, 3394, 1371, 3055, 1949, 851, 692, 3181, 1848, 3510, 1237, 1496, 1499, 97, 873, 1816, 2118, 1258, 2916, 101, 2748, 3461, 1668, 2878, 1985, 3032, 857, 3584, 699, 792, 895, 808, 2420, 2206, 262, 768, 2997, 2729, 2184, 3079, 2638, 3361, 2810, 536, 1692, 82, 586, 209, 3115, 1737, 2086, 2263, 1597, 153}, new int[]{3375, 1816, 1419, 631, 1799, 2058, 3198, 2635, 1100, 2018, 3075, 1302, 1020, 2472, 2265, 3144, 244, 1302, 2905, 2994, 73, 2831, 1310, 2434, 2981, 825, 570, 1466}, 4467, 85	));
		assertEquals(46, ListeningSongs.listen(new int[]{2157, 1212, 1667, 2191, 1504, 3100, 3060, 2545, 1517, 2534, 2081, 2477, 3240, 2581, 2021, 3425, 2117, 3160, 1112, 2130, 2390, 657, 2799, 64, 3257, 1603, 3305, 978, 1945, 3098, 2014, 2336, 2544, 1915, 2761, 2283, 1414, 2220, 3062, 1165, 2989}, new int[]{3377, 3583, 2628, 2357, 297, 746, 874, 3397, 1799, 1238, 480, 2396, 436, 2320, 2052, 1980, 2024, 1264, 2159, 3357, 3218, 2729, 594, 3367, 1890, 2817, 1181, 2344, 2278, 580, 1732, 349, 562, 760, 2646, 2634, 1446, 3460, 724, 1479, 1098, 1145, 2109, 3309, 3405, 2395, 3523, 122, 3599, 2081, 3419, 1510, 3045, 2248, 1277, 1334, 1464, 692, 1912, 1977, 1212, 3585, 2266, 3550, 2579, 1311, 2583, 2259, 3006, 3248, 138, 2338, 2627, 2187, 340, 725, 982, 263, 787, 2815, 2284, 2441, 725, 1728, 1088, 1942, 1296, 786, 868, 3149, 2703}, 712, 6	));
		assertEquals(160, ListeningSongs.listen(new int[]{405, 2749, 2787, 2604, 2154, 728, 976, 2726, 3295, 1398, 3006, 419, 614, 3209, 2981, 3369, 187, 1821, 493, 149, 2849, 669, 1386, 3576, 1477, 2769, 972, 1732, 2430, 575, 1935, 2775, 3264, 2956, 72, 111, 83, 989, 2777, 1612, 621, 476, 1971, 1175, 85, 1352, 943, 2047, 1407, 3212, 2136, 656, 280, 1756, 2466, 3533, 924, 3378, 3499, 3294, 2187, 127, 762, 1850, 3024, 775, 195, 1341, 3539, 2912, 2894, 559, 3329, 3099, 1674, 1648, 850, 851, 94, 2198, 462, 2170, 1088, 2518, 326, 3494, 744, 3025, 1565, 642, 1013, 152, 709, 3550, 236, 1967, 2559}, new int[]{372, 3249, 2497, 1518, 836, 1290, 3081, 334, 1198, 2963, 2960, 284, 2997, 3392, 686, 3402, 2714, 1438, 1962, 901, 2122, 3221, 2406, 998, 2468, 792, 3483, 2418, 2804, 1849, 1376, 3116, 3332, 2108, 2868, 567, 1632, 643, 2677, 2771, 3546, 330, 2995, 2943, 121, 1915, 1038, 2775, 3294, 2940, 75, 109, 854, 715, 2883, 3263, 1448, 2765, 2080, 651, 2848, 1690, 2001, 2580, 197, 3103, 1381, 1770, 145, 2292, 2775, 91, 2562, 463, 1268, 917}, 4432, 63	));
		assertEquals(-1, ListeningSongs.listen(new int[]{3420, 235, 2190, 2508, 891, 1472, 2170, 573, 2471, 2484, 2999, 1718, 2409, 3234, 2532, 2546, 2736, 313, 2550, 2822, 839, 3559, 1147, 3342, 421, 2355, 2493, 974, 2835, 819, 1219, 948, 994, 1643, 3396, 119, 3055, 260, 632, 1925, 978, 1865, 1878, 3327, 1498, 809, 567, 2469, 1062, 1351, 3525, 136, 1310, 1071, 3418, 3506, 1660, 604, 879, 2729, 1363, 333, 1911, 2298, 1916, 3541, 651, 3206, 200, 1224, 3365, 1119, 1323, 1642, 2680, 2762, 2392, 3187, 1630, 1688, 938, 3389, 1764}, new int[]{2188, 859, 3416, 2093, 753, 420, 1207, 3422, 3558, 1480, 3567, 549, 1630, 3507, 1141, 1235, 1942, 2305, 1000, 1295, 3568, 876, 374, 1023, 1502, 3502, 887, 3131, 839, 675, 3129, 1261, 3309, 1239, 1588, 461, 3434, 2735, 2117, 3391, 2449, 2083, 340, 479, 1990, 1421, 3489, 331, 1960, 2723, 1566, 221, 3540, 174, 1185, 1441, 75, 306, 2806, 2689, 922, 629, 2184, 2465, 1808, 172, 2867, 1641, 1141, 1383, 1431, 1825, 1701, 3546, 538, 1925, 1366, 426, 2196, 3266, 3090, 1996, 1722, 1323, 2110, 2847, 998, 420, 1387, 204, 3049}, 7899, 87	));
		assertEquals(109, ListeningSongs.listen(new int[]{815, 3580, 2215, 690, 2955, 1832, 2061, 1179, 1767, 2007, 1657, 91, 1607, 318, 2227, 3108, 3348, 2457, 1229, 1070, 967, 2310, 2008, 1327, 96, 446, 2610, 580, 2994, 2477, 3469, 2043, 750, 377, 2673, 105, 443, 1134, 3059, 2151, 1375}, new int[]{2951, 2182, 2922, 3209, 2644, 723, 1250, 1500, 1892, 554, 701, 601, 796, 262, 638, 3018, 2813, 2993, 2411, 1689, 2861, 854, 2380, 1472, 1761, 719, 1855, 2835, 2012, 405, 2444, 1362, 2528, 60, 2805, 1571, 723, 454, 1305, 2556, 2783, 1947, 1391, 3520, 2149, 1969, 2937, 1361, 1361, 3582, 1285, 2456, 2670, 1899, 327, 831, 852, 2123, 1900, 2804, 762, 2579, 566, 3230, 2579, 1605, 3035, 1536, 294, 740, 2326, 3017, 921, 117, 1230, 3010, 2026, 2401, 2606}, 2991, 1	));
		assertEquals(-1, ListeningSongs.listen(new int[]{3287, 423, 2580, 2352, 1215, 2937, 652, 418, 98, 1465, 2759, 1563, 443, 764, 2832}, new int[]{213, 998, 1806, 2480, 2249, 2667, 2537, 3420, 371, 2797, 2220, 2917, 2653, 2837, 1441, 1365, 818, 98, 2179, 3110, 3088, 1515, 1996, 3446, 3388, 3401, 899, 3185, 2078, 3438, 2417, 2232, 2670, 622, 1111, 1318, 1524, 3588, 2972, 1835, 1078, 3427, 1151, 131, 2663, 826, 1436, 1715, 2699, 3555, 1225, 2186, 3304, 1455, 2031, 1385, 1256, 1164, 970, 3274, 1001, 1621, 199, 70, 477, 1250, 3164, 1941, 3072, 2535, 175, 550, 2361, 3101, 2456, 3259, 2161}, 5355, 62	));
		assertEquals(75, ListeningSongs.listen(new int[]{832, 3385, 77, 2228, 110, 3237, 1718, 1214, 606, 1391, 450, 461, 3366, 2295, 879, 1015, 1858, 2760, 2322, 2628, 1170, 1106, 1388, 670, 3502, 1046, 1066, 192, 654, 2265, 506, 1426, 2050, 523, 3594, 394, 1994, 3546, 1548, 2541, 3172, 232, 1236, 2937, 2468, 2055, 2186, 2560, 3050, 907, 1587, 619, 1953, 1210, 3064, 1854, 490, 529, 280, 1084, 1029, 726, 2451}, new int[]{1313, 3024, 738, 1647, 1418, 684, 1429, 2193, 255, 1602, 1663, 1426, 2304, 118, 3552, 1263, 1402, 859, 1085, 1961, 1046, 2235, 3259, 2841, 2665, 2023, 1355, 1984, 2992, 316, 834, 2539, 1574, 3347, 585, 1226, 2265, 1954, 1653, 754, 3496, 3257, 2120, 493, 3315, 366, 1697, 1116, 1165, 1016, 1311, 445, 3191, 2804, 1520, 549, 1226, 2816, 2473, 2452, 3072, 1541, 1390, 2880, 3123, 209, 506, 1787, 2104, 2099, 776, 293, 1755}, 1175, 8	));
		assertEquals(12, ListeningSongs.listen(new int[]{658, 819, 835, 1614, 364, 1221, 3039, 3109, 2681, 1822, 2569, 190, 695, 3256, 1496, 470, 2880, 776, 3533}, new int[]{3030, 1222, 3555, 3368, 1555, 730, 60, 3251, 94, 2562, 2954, 1471, 3160, 2008, 540, 3008, 2312}, 123, 4	));
		assertEquals(-1, ListeningSongs.listen(new int[]{2503, 2624, 1041, 1432, 2279, 2478, 1842, 1558, 3194}, new int[]{1775, 987, 2650, 1729, 754, 604, 693, 2590, 2089, 727, 1551, 1443, 432, 2946, 1685, 913, 647, 396, 2683, 1328, 451, 1699, 2065, 3015}, 10, 5	));
		assertEquals(-1, ListeningSongs.listen(new int[]{3528, 3393, 3513, 1485, 1280, 1687, 707, 2164, 1650, 3236, 2708, 2283, 519, 3032, 1245, 305, 2709, 1617, 3191, 793, 764, 237, 1129, 3388, 3340, 3355, 3321, 98, 1063, 695, 3475, 990, 2322, 3388, 710, 3542, 3309, 1357, 2105, 1359, 2827, 3048, 1876, 1581, 773, 3061, 1826, 3422, 2913, 1416, 614, 76, 3428, 3518, 1698, 1462, 3273, 3254, 1500, 735, 348, 3210, 1666, 905, 1291, 610, 2681, 999, 201, 3021, 592, 2968, 2468, 2409, 948, 1475, 1869, 2714, 1296, 1181, 2364, 1850, 3033, 486, 61, 1130, 1888, 3274, 783, 3328, 2244, 2907, 1231, 2144, 211, 2462, 2694, 1126, 3402, 2835}, new int[]{546, 2228, 496, 1248, 1036, 3220, 2663, 2846, 2333, 358, 2261, 2932, 442, 1693, 3358, 444, 1058, 1645, 1952, 75, 3207, 595, 1216, 838, 973, 3202, 1534, 66, 728, 1335, 1135, 1214, 1798, 1572, 2403, 2774, 1191, 1465, 313, 1758, 3599, 2515, 2924, 440, 2442, 2681, 2659, 1734, 2560, 1011, 1750, 2167, 3381, 2906, 1239, 754, 2508, 2713, 2595, 3176, 2283, 1965, 789, 480, 3477, 1426, 3194, 2902, 2832, 1742, 2894, 2830, 656, 2218, 1504, 1332, 1298, 2398, 3007, 258, 3349, 1156, 659, 1423, 2296, 1838, 411, 1203, 2785, 1241, 2613, 1467, 3146, 1637, 1887, 1316, 3003, 3316, 617, 2234}, 742, 38	));
		assertEquals(179, ListeningSongs.listen(new int[]{3298, 347, 2068, 3037, 1619, 3307, 1834, 2860, 1799, 3417, 2250, 2398, 1239, 946, 2470, 3426, 383, 1654, 1066, 1231, 1356, 2446, 2808, 3183, 161, 2210, 1192, 718, 2679, 883, 2403, 670, 3005, 2706, 106, 2859, 706, 1880, 2118, 2445, 1696, 768, 3077, 1170, 3489, 1946, 2830, 271, 1834, 2130, 1442, 3130, 975, 2484, 1007, 1076, 1094, 433, 3569, 2007, 1257, 665, 2617, 661, 3311, 2664, 3460, 416, 2778, 272, 1095, 874, 980, 571, 278, 868, 751, 3048, 2914, 2526, 1577, 2591, 2055, 2492, 1474, 1296, 1802, 802, 1670, 64, 2749, 2867, 2504, 60, 1762, 2215, 2664, 3457, 865, 1841}, new int[]{128, 1901, 949, 2883, 2412, 1167, 1985, 1398, 614, 1298, 323, 425, 2123, 612, 1151, 1832, 143, 2893, 2574, 1753, 1191, 3558, 2854, 95, 3558, 1015, 544, 2621, 2706, 3184, 2696, 2774, 1484, 1880, 350, 2131, 2987, 2275, 3469, 1836, 1808, 2026, 495, 330, 872, 1587, 2102, 955, 879, 2911, 2648, 305, 2868, 195, 2175, 1119, 2986, 953, 1974, 2091, 536, 1069, 3100, 1961, 2889, 3390, 2326, 570, 2065, 488, 640, 272, 2454, 1075, 2377, 1560, 2602, 879, 2456, 1716, 2024, 3338, 255, 3126, 3474, 2370, 644, 2859, 3263, 2558, 3184, 2033, 1861, 2683, 2228, 1150, 2473, 953, 3495, 937}, 4943, 71	));
		assertEquals(5, ListeningSongs.listen(new int[]{300, 200, 100}, new int[]{100, 500, 600}, 20, 2	));
		assertEquals(-1, ListeningSongs.listen(new int[]{300}, new int[]{400}, 17, 100	));
		assertEquals(8, ListeningSongs.listen(new int[]{100, 200, 300, 400, 500, 600}, new int[]{100, 200}, 1500, 2	));
		assertEquals(9, ListeningSongs.listen(new int[]{60, 60, 60, 60, 60}, new int[]{70, 70, 70, 70}, 100, 1	));
		assertEquals(9, ListeningSongs.listen(new int[]{110, 111, 112, 113, 114, 115}, new int[]{61, 62, 63}, 100, 3	));
		assertEquals(10, ListeningSongs.listen(new int[]{60, 60, 60, 60}, new int[]{60, 60, 60, 60, 3600, 3600}, 600, 2	));
		assertEquals(25, ListeningSongs.listen(new int[]{60, 60, 60, 60, 60}, new int[]{70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70}, 12000, 3	));
		assertEquals(8, ListeningSongs.listen(new int[]{120, 180, 240, 300}, new int[]{60, 60, 60, 60, 60, 60}, 12, 2	));
		assertEquals(2, ListeningSongs.listen(new int[]{60}, new int[]{60}, 2, 1));
				
	}
}