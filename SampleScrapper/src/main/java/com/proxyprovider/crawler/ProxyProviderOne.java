package com.proxyprovider.crawler;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProxyProviderOne {
	private final String baseUrl = "https://free-proxy-list.net/";
	private Response response;
	private Document document;
	private Element element;
	private Elements elements;

	public ProxyProviderOne() {
		startScraping();
	}
	public void startScraping() {
		System.out.println("Crawler One! Data Collection Start!!");
		doScraping(baseUrl);
	}

	private void doScraping(String baseUrl) {
		try {
			response = Jsoup.connect(baseUrl).ignoreContentType(true).userAgent(
					"Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko; compatible; Googlebot/2.1; +http://www.google.com/bot.html) Chrome/W.X.Y.Z‡ Safari/537.36")
					.referrer("http://www.google.com").timeout(10000).followRedirects(true).execute();
			document = response.parse();
			System.out.println("Title: "+ document.title());
			
			element = document.getElementById("proxylisttable");
			
			elements = element.getElementsByTag("tr");
			
			int token = 0;
			for (Element tag : elements) {
				
				System.out.println(token+". IP: " + tag.child(0).text() + "\t" + "PORT: " + tag.child(1).text() + "\t" + "CODE: " + tag.child(2).text() + "\t" + "Anonymity: " + tag.child(4).text() +"\t" + "HTTPs: " + tag.child(6).text());
				++token;
				System.out.println();
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
