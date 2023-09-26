package org.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpAdapterImpl implements HttpAdapter{
    @Override
    public void post(String teste, Map<String, Object> dados) throws IOException {
        URL url  = new URL(teste);
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
    }
}
