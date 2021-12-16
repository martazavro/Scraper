package scraper;

import scraper.Home;

public interface Scraper {
    Home scrape(String url);
}