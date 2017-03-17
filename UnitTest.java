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

	
	//@Test
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

	@Test
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
}