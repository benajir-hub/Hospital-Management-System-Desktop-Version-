package com.proxyprovider.crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;

//import org.jsoup.Connection.Response;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.jsoup.select.Evaluator.IsEmpty;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import net.sourceforge.htmlunit.cyberneko.HTMLElements;

public class ProxyProviderThree {
	private final String baseUrl = "https://www.proxy-list.download/HTTPS";
//	private Response response;
//	private Document document;
//	private Element element;
//	private Elements elements;

	public ProxyProviderThree() {
		startScraping();
	}

	public void startScraping() {
		System.out.println("Crawler Three! Data Collection Start!!");
		doScraping(baseUrl);
	}

	private void doScraping(String baseUrl) {

		HtmlPage page;
		try (final WebClient webClient = new WebClient()){
			
			webClient.setJavaScriptTimeout(30 * 1000);
			webClient.getOptions().setTimeout(50 * 1000);
			webClient.getOptions().setThrowExceptionOnScriptError(false);
			webClient.getOptions().setCssEnabled(false);
			webClient.getOptions().setUseInsecureSSL(true);
//			webClient.getOptions().setJavaScriptEnabled(false);
			
			page = webClient.getPage(baseUrl);
			webClient.waitForBackgroundJavaScript(15 * 1000);
			
			
//			DomElement element = page.getElementById("tabli");
			List<HtmlElement> htmlElements =  page.getBody().getByXPath("//tbody[@id='tabli']/tr");//div[@role='list']/dl[@role='listitem']/dd
			
			for (HtmlElement tag : htmlElements) {
				System.out.println("ID: "+tag.getElementsByTagName("td").get(0).getTextContent());
				System.out.println("Port: "+tag.getElementsByTagName("td").get(1).getTextContent());
				System.out.println("Anonimity: "+tag.getElementsByTagName("td").get(2).getTextContent());
				System.out.println("Country: "+tag.getElementsByTagName("td").get(3).getTextContent());
			}
			
		} catch (FailingHttpStatusCodeException | IOException e) {
//			e.printStackTrace();
		}
		

		
	}
	/*
	 * try { response = Jsoup.connect(baseUrl).ignoreContentType(true).userAgent(
	 * "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko; compatible; Googlebot/2.1; +http://www.google.com/bot.html) Chrome/W.X.Y.Z‡ Safari/537.36"
	 * ) .referrer("http://www.google.com").timeout(10000).followRedirects(true).
	 * execute(); document = response.parse(); System.out.println("Title: " +
	 * document.title());
	 * 
	 * // element = document.getElementById("tabli");
	 * 
	 * elements = document.select("tbody.table-hover ");
	 * 
	 * System.out.println("Elements Empty? " + elements.isEmpty());
	 * 
	 * int token = 0; for (Element tag : elements) {
	 * 
	 * // System.out.println(token + ". IP: " + tag.child(0).text() + "\t" +
	 * "PORT: " + tag.child(1).text() + "\t" // + "Anonymity: " +
	 * tag.child(2).text() + "\t" + "HTTPs: yes " + "\t" + "Country: " // +
	 * tag.child(3).text()); // System.out.println(tag.outerHtml()); ++token;
	 * System.out.println();
	 * 
	 * }
	 * 
	 * } catch (IOException e) { e.printStackTrace(); }
	 */
}
