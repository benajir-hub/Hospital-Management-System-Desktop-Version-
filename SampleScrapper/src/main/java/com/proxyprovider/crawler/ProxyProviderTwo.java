package com.proxyprovider.crawler;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProxyProviderTwo {
	private final String baseUrl = "http://free-proxy.cz/en/";
	private Response response;
	private Document document;
	private Element element;
	private Elements elements;

	public ProxyProviderTwo() {
		startScraping();
	}

	public void startScraping() {
		System.out.println("Crawler Two! Data Collection Start!!");
		doScraping(baseUrl);
	}

	private void doScraping(String baseUrl) {
		try {
			response = Jsoup.connect(baseUrl).ignoreContentType(true)
					.header("Content-Type", "application/x-www-form-urlencoded").cookie("TALanguage", "ALL")
					.data("mode", "filterReviews").data("filterRating", "").data("filterSegment", "")
					.data("filterSeasons", "").data("filterLang", "ALL").referrer("http://google.com/")
					.header("X-Requested-With", "XMLHttpRequest")
					.userAgent(
							"Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
					.execute();
			;
			document = response.parse();
			System.out.println("Title: " + document.title());

			element = document.getElementById("proxy_list");

			elements = element.getElementsByTag("tr");

			int token = 1;
			for (Element tag : elements) {

				if (tag.childNodeSize() > 1) {

					System.out.println(token);

//					System.out.println("IP: " + tag.child(0));

					System.out.println(token + ". IP: " + tag.child(0).text() + "\t" + "PORT: " + tag.child(1).text() + "\t"
							+ "CODE: " + tag.child(2).text() + "\t" + "Anonymity: " + tag.child(4).text() + "\t" + "HTTPs: "
							+ tag.child(6).text());
					++token;

				}

				System.out.println();

			}

		} catch (HttpStatusException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
