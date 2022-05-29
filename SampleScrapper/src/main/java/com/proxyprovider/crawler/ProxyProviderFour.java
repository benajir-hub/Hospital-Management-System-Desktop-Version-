package com.proxyprovider.crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

//import org.jsoup.Connection.Response;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ProxyProviderFour {
	private final String baseUrl = "http://www.freeproxylists.net/";
//	private Response response;
//	private Document document;
//	private Element element;
//	private Elements elements;
	private static WebClient webClient = null;

	public ProxyProviderFour() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		startScraping();
	}

	public void startScraping() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		System.out.println("Crawler Four! Data Collection Start!!");
		doScraping(baseUrl);
	}

	private void doScraping(String baseUrl) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		HtmlPage page = getWebClient().getPage(baseUrl);
		System.out.println(page.getTitleText());
		List<HtmlElement> ipList = page.getBody().getByXPath("//table[@class='DataGrid']/tbody/tr/td/a");

		int ipToken = 0;
		for (HtmlElement el : ipList) {
			if(ipToken > 9) {
				System.out.println("______________________________-------------------------_____________________________");
				System.out.println(el.getAttribute("href").trim());
				getDetails(el.getAttribute("href").trim());
				
//				System.out.println(el.getFirstElementChild().getLastElementChild().asText());
//				System.out.println(el.getElementsByTagName("td").get(0).getElementsByTagName("a").get(0).getTextContent());
//				System.out.println(el.getChildElementCount());
//				System.out.println(el.getFirstElementChild().getNextElementSibling().asText());
//				System.out.println(el.asText());
			}
			
			
			++ipToken;
		}

	}
	
	private void getDetails(String url) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		
		HtmlPage page = getWebClient().getPage(url);
		
//		List<HtmlElement> ht = page.getBody().;
		
//		
//		List<HtmlElement> ipDetailList = page.getBody().getByXPath("//table[@class='DataGrid']/tbody/tr");
//		System.out.println(url);
//		System.out.println(ipDetailList.isEmpty());
//		System.out.println("______________________________-------------------------_____________________________");
		
//		System.out.println("IP Adress: " + ht.get(0).getElementsByTagName("tr").get(0).getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("Protocol: " + ht.get(0).getElementsByTagName("tr").get(1).getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("Anonymity: " + ht.get(0).getElementsByTagName("tr").get(2).getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("Country: " + ht.get(0).getElementsByTagName("tr").get(3).getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("______________________________-------------------------_____________________________");
//		
		
//		System.out.println("Protocol: " + ht.getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("Anonymity: " + ht.getElementsByTagName("td").get(1).getTextContent());
//		System.out.println("Country: " + ht.getElementsByTagName("td").get(1).getTextContent());
		
		List<HtmlElement> ipDetailList = page.getBody().getByXPath("//table[@class='DataGrid']/tbody/tr");
		System.out.println(ipDetailList.isEmpty());
		
//		for (HtmlElement eld : ipDetailList) {
//			System.out.println("______________________________-------------------------_____________________________");
//			System.out.println("IP Adress: " + eld.getElementsByTagName("td").get(1).getTextContent());
//			System.out.println("Protocol: " + eld.getElementsByTagName("td").get(1).getTextContent());
//			System.out.println("Anonymity: " + eld.getElementsByTagName("td").get(1).getTextContent());
//			System.out.println("Country: " + eld.getElementsByTagName("td").get(1).getTextContent());
//			System.out.println("______________________________-------------------------_____________________________");
//		}
		
	}

	private WebClient getWebClient() {
		if (webClient == null) {
			webClient = new WebClient(BrowserVersion.FIREFOX);
			webClient.waitForBackgroundJavaScript(25 * 1000);
			webClient.waitForBackgroundJavaScriptStartingBefore(10 * 1000);
			webClient.getOptions().setTimeout(30 * 1000);
			webClient.getOptions().setThrowExceptionOnScriptError(false);
			webClient.setJavaScriptTimeout(25 * 1000);
			webClient.getCookieManager().setCookiesEnabled(true);
			webClient.getOptions().setJavaScriptEnabled(true);
		}
		return webClient;
	}
}
