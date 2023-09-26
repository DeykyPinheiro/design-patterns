package org.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Objects;

public interface HttpAdapter {

    public void post(String url, Map<String, Object> dados) throws IOException;
}
