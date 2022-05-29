package com.proxyprovider.main;

import java.io.IOException;
import java.net.MalformedURLException;

import org.jsoup.Connection.Response;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.proxyprovider.crawler.ProxyProviderFour;
import com.proxyprovider.crawler.ProxyProviderOne;
import com.proxyprovider.crawler.ProxyProviderThree;
import com.proxyprovider.crawler.ProxyProviderTwo;

public class Main {

	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		ProxyProviderOne crawlerOne = new ProxyProviderOne();
//		ProxyProviderTwo crawlerTwo = new ProxyProviderTwo();
//		ProxyProviderThree crawlerThree = new ProxyProviderThree();
//		ProxyProviderFour crawlerFour = new ProxyProviderFour();

	}

}
