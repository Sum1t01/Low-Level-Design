package BuilderDesignPattern.UrlBuilder;
import BuilderDesignPattern.URL.*;
public class UrlBuilder extends Builder {
    
    public UrlBuilder()
    {
        protocol="";
        hostname="";
        port="";
        path_parameter="";
        query_parameter="";
    }

    public UrlBuilder protocol(String protocol)
    {
        this.protocol = protocol;
        return this;

    }

    public UrlBuilder hostname(String hostname)
    {
        this.hostname = hostname;
        return this;
    }

    public UrlBuilder port(String port)
    {
        this.port = port;
        return this;
    }

    public UrlBuilder path_parameter(String path_parameter)
    {
        this.path_parameter = path_parameter;
        return this;
    }

    public UrlBuilder query_parameter(String query_parameter)
    {
        this.query_parameter = query_parameter;
        return this;
    }

    public URL build()
    {
        return new URL(this);
    }
}
