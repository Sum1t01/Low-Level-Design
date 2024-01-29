package BuilderDesignPattern;

import BuilderDesignPattern.UrlBuilder.*;
import BuilderDesignPattern.URL.*;

public class Main {
    public static void main(String args[])
    {
        UrlBuilder url = new UrlBuilder();
        url = url.protocol("https://").hostname("mywebsite.com").port(":8080").path_parameter("/companies").query_parameter("?companyName=xyz");
        URL myURL = url.build();
        myURL.display();
    }
}
