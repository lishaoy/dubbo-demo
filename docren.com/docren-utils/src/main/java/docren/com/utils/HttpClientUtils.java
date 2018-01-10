package docren.com.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by ikong on 2017/1/18.
 */
public class HttpClientUtils {

    private String url = "";

    public HttpClientUtils() {
    }

    public HttpClientUtils(String apiAddress) {
        this.url = apiAddress;
    }

    /*get请求*/
    public String get(String uri, Map<String, Object> params) throws Exception {

        String allUrl = getUrl(uri, params);

        return fetch(new HttpGet(allUrl));
    }

    public String get(String fullUrl) throws Exception {
        return fetch(new HttpGet(fullUrl));
    }

    /*post请求*/
    public String post(String uri, Map<String, Object> params) throws Exception {

        String allUrl = getUrl(uri, params);

        return fetch(new HttpPost(allUrl));
    }

    private String getUrl(String uri, Map<String, Object> params) {
        String allUrl = url + "" + uri + "?";
        for (String key : params.keySet()) {
            allUrl = allUrl + key + "=" + ((String[]) params.get(key))[0] + "&";
        }
        return allUrl;
    }



    private String fetch(HttpUriRequest method) throws Exception {
        // 创建HttpClient实例
        HttpClient httpclient = new DefaultHttpClient();

        HttpUriRequest httpMethod = method;

        HttpResponse response = httpclient.execute(httpMethod);
        HttpEntity entity = response.getEntity();

        InputStream ins = entity.getContent();

        String CHARSET = "UTF-8";
        if (entity != null) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(ins, CHARSET));
                StringBuffer sbf = new StringBuffer();
                String line = null;
                while ((line = br.readLine()) != null) {
                    sbf.append(line);
                }
                return sbf.toString();
            } catch (Exception ex) {
                return ex.toString();
            } finally {
                if (br != null) {
                    br.close();
                }
            }
        }
        return "";
    }

}
