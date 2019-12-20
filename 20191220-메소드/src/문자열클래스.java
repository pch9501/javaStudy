/*
 * String: ¹®ÀÚ¿­À» Á¦¾î
 * 
 *	java.lang => import¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù.
 *	¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹ı
 *	1. String º¯¼ö¸í="Hello Java";
 *	2. String º¯¼ö¸í=new String("Hello Java");  // °°Àº ¹®ÀÚ¿­=> º°µµ·Î ÀúÀå
 *
 * 	String¿¡¼­ Á¦°øÇÏ´Â ±â´É
 * 
 * 	1. equals: ÀúÀåµÈ ¹®ÀÚ¿­ÀÌ °°ÀºÁö¿¡ ´ëÇÑ ¿©ºÎÈ®ÀÎ (true/false)
 * 		ID, PWD => ·Î±×ÀÎ (´ë¼Ò¹®ÀÚ ±¸ºĞ)
 * 		¹®ÀÚ¿­Àº (==)À» »ç¿ëÇÏ¸é ¾ÈµÈ´Ù.
 * 		
 * 		String s="Hello";
 * 		String s1="Hello";
 * 		String s2=new String("Hello");
 * 		if(s.equals(s1))
 * 
 * 		=> ¿øÇü
 * 			boolean equals(String data)
 * 
 * 	2. substring: ¹®ÀÚ¿­À» ÀÚ¸¦ ¶§
 * 			ex)
 * 			String s="0123456789";
 * 			substring(3) => "3456789"
 * 
 * 			String s="112ºĞ, 15¼¼ÀÌ»ó °ü¶÷°¡"
 * 			substring(0,3) => "112" / end-1°ú °°´Ù? (0,1,2)
 * 		
 * 	3. length: ¹®ÀÚ¿­ °³¼ö
 * 		String s="Hello È«±æµ¿"; // s´Â 9±ÛÀÚ.
 * 
 * 	4. trim: ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ Á¦°Å
 * 		String s=" Hello Java ";
 * 			=> s.trim.length // trimÀº ÁÂ,¿ì °ø¹é¸¸ Áö¿ï¼öÀÖ´Ù. ¹®ÀÚ¿­ »çÀÌ °ø¹éÀº Áö¿ï¼ö¾øÀ½.
 * 	5. startsWith, endsWith
 * 
 * 
 * 	6. indexOf, lastIndexof
 * 		¹®ÀÚÀÇ À§Ä¡(indexOf: ¾Õ¿¡¼­, lastIndexOf: µÚ¿¡¼­)
 * 		String s="Hello Java";
 * 				  0123456789
 * 		s.indexOf('a') => 7¹øÀ» Ã£¾Æ¿Â´Ù(a)
 * 		s.lastIndexOf('a') => 9¹øÀ» Ã£¾Æ¿Â´Ù(¸Ç µÚÀÇ a)
 * 
 * 	7. split
 * 		String s="ÀÌº´Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö";
 * 		String[] names=s.split(",")
 * 		
 * 	8. toUpperCase,toLowerCase
 * 		´ë¹®ÀÚ·Î º¯°æ  /  ¼Ò¹®ÀÚ·Î º¯°æ
 * 		ex)
 * 		String s="Hello";
 * 		s.toUpperCase() => HELLO
 * 		s.toLowerCase() => hello
 * 
 * 	9. replace, replaceAll => Á¤±Ô½Ä
 * 				String s="113ºĞ";
 * 				s.replaceAll("[^0-9]","") ==> 113
 * 				s.replaceAll("^[0-9]","") => °ıÈ£ ¾Õ¿¡ ^°¡ ÀÖÀ¸¸é °ıÈ£¸¦ Á¦¿ÜÇÑ
 * 				s.replaceAll("[^°¡-ÆR]","")
 * 				s.replaceAll("[^A-Za-z]","")
 * 
 * 		º¯°æÇÒ ¶§
 *		ex)
 *		String s="Hello Java"
 *		s.replace('a','b') => Hello Jbvb
 *
 *	10. contains(): Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì
 */
import java.util.Scanner;
public class ¹®ÀÚ¿­Å¬·¡½º {
	
	static String[] autoComplete(String data)
	{
		String[] ss= {
				"ÀÚ¹Ù¿Í JSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ 5","Ajax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®",
				"ÀÚ¹Ù ¿À¶óÅ¬","MVC ±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå",
				"ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
				"È¥ÀÚ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇü À¥ ÇÁ·Î±×·¥","À¥ ÇÁ·Î±×·¥","ÀÚ¹Ù À¥ ÇÁ·Î±×·¥","¿À¶óÅ¬ ÀÚ¹Ù"
		};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
			//if(ss[i].startsWith(data)) // µé¾î°£ °Ë»ö¾î·Î ½ÃÀÛÇÏ´Â
			if(ss[i].contains(data)) // µé¾î°£ °Ë»ö¾î ÀüºÎ
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("°Ë»ö¾î ÀÔ·Â: ");
		String data=scan.next();
		
		String[] fd=autoComplete(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
	}

}
