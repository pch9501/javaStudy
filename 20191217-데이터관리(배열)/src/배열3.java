import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 겨울왕국 2 (2019) 
Frozen II
평점7.4/10
애니메이션/어드벤처/코미디/판타지/뮤지컬
 미국
2019.11.21 개봉
103분, 전체관람가
(감독) 크리스 벅, 제니퍼 리
(주연) 박지윤, 소연, 이장원, 장민혁, 크리스틴 벨, 이디나 멘젤, 조시 게드, 조나단 그로프
 */
public class 배열3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Movie[] m=new Movie[16];
		Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
		Elements link=doc.select("div.info_tit a.name_movie");
		int k=1;
		for(int i=0;i<link.size();i++)
		{
		 try{
			//System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href");
			System.out.println(link_data);
			
			Document doc2=Jsoup.connect(link_data).get();
//			<div class="subject_movie">
//			<strong class="tit_movie">포드 V 페라리 (2019)</strong>
//			<span class="txt_origin">FORD v FERRARI</span><!-- 2016-04-12 추가 -->
//			<em class="emph_grade">8.7
			Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
			Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
			Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);
			Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
			Element grade=doc2.select("dl.list_movie dd").get(3);
			Element director=doc2.select("dl.list_movie dd").get(4);
			Element actor=doc2.select("dl.list_movie dd").get(5);
				/*
				 * System.out.println("count: "+(k)); System.out.println(title_kr.text());
				 * System.out.println(title_en.text()); System.out.println(score.text());
				 * System.out.println(genre.text()); System.out.println(regdate.text());
				 * System.out.println(grade.text()); System.out.println(director.text());
				 * System.out.println(actor.text());
				 * System.out.println("==========================");
				 */
			m[i]=new Movie();
			m[i].title_kr=title_kr.text();
			m[i].title_en=title_en.text();
			m[i].score=Double.parseDouble(score.text());
			m[i].grade=grade.text();
			m[i].genre=genre.text();
			m[i].regdate=regdate.text();
			m[i].director=director.text();
			m[i].actor=actor.text();
			k++;
		}catch(Exception ex) {k--;}
		
	}
	
		/*
		 * Scanner scan=new Scanner(System.in); System.out.print("영화번호 선택(0 ~ 15): ");
		 * int index=scan.nextInt(); System.out.println("========= 결과 ==========");
		 * System.out.println("영화명: "+m[index].title_kr);
		 * System.out.println("감독: "+m[index].director);
		 * System.out.println("출연: "+m[index].actor);
		 * System.out.println("개봉일: "+m[index].regdate);
		 * System.out.println("장르: "+m[index].genre);
		 */
		double max=0.0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]!=null)
			{
				if(max<m[i].score)
				{
					max=m[i].score;
				}
			}
		}
		
		for(int i=0;i<m.length;i++)
		{
			if(m[i]!=null)
			{
				if(m[i].score==max)
				{
					System.out.println(m[i].title_kr);
				}
			}
		}
//		System.out.println(max);

 }
}