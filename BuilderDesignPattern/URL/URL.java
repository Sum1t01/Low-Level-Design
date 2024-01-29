package BuilderDesignPattern.URL;
import BuilderDesignPattern.UrlBuilder.*;
public class URL {

    String protocol;
    String hostname;
    String port;
    String path_parameter;
    String query_parameter;

    public URL(UrlBuilder obj)
    {
        this.protocol = obj.protocol;
        this.hostname = obj.hostname;
        this.port = obj.port;
        this.path_parameter = obj.path_parameter;
        this.query_parameter = obj.query_parameter;
    }

    public void display()
    {
        System.out.println("The URL is:");
        System.out.println(protocol+hostname+port+path_parameter+query_parameter);
    }
}
