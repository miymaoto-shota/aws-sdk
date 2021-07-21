package scraping;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {

	public static void main(String[] args) throws IOException {
		try {
			// Document document = Jsoup.connect("http://www.google.co.jp").get();
			Document document = Jsoup.connect("https://news.yahoo.co.jp/").get();

			Elements newsHeadlines = document.select(".topicsList li.topicsListItem a");

			//System.out.println(document.html());

			for (Element headline : newsHeadlines) {
	            System.out.println("title: " + headline.toString() );
	        }

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
