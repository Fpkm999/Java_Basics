package project1.crawling_test;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static java.rmi.server.LogStream.log;
import static org.jsoup.select.Selector.select;

public class MyCrawler01 {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s"
            );
        }
    }
}
