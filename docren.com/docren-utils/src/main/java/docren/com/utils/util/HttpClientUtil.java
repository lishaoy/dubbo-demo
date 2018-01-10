package docren.com.utils.util;

import net.sf.json.JSONObject;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HttpClientUtil {

    private static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    /**
     * 发送get请求
     *
     * @param url
     * @param jsonObjectParam
     * @return
     */
    public static String sendGet(String url, JSONObject jsonObjectParam) {

        CloseableHttpClient httpclient = HttpClients.createDefault();

        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            URIBuilder builder = new URIBuilder(url);

            if (jsonObjectParam != null) {
                Iterator iterator = jsonObjectParam.keys();
                while (iterator.hasNext()) {
                    String key = String.valueOf(iterator.next());
                    String value = String.valueOf(jsonObjectParam.get(key));

                    builder.addParameter(key, value);
                }
            }

            URI uri = builder.build();
            log.info("发送http-get请求:" + uri);
            HttpGet httpGet = new HttpGet(uri);

            response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }


    /**
     * 发送post请求
     *
     * @param url
     * @param jsonObjectParam
     * @return
     */
    public static String sendPost(String url, JSONObject jsonObjectParam) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        int i = 0;
        String str = "";

        try {
            HttpPost httpPost = new HttpPost(url);
            if (jsonObjectParam != null) {
                List<NameValuePair> paramList = new ArrayList<>();

                Iterator iterator = jsonObjectParam.keys();
                while (iterator.hasNext()) {
                    String key = String.valueOf(iterator.next());
                    Object value = jsonObjectParam.get(key);

                    System.out.println(value);
                    System.out.println(value.equals(null));
                    if (i == 0) str += key + "=" + value;
                    else str += "&" + key + "=" + value;
                    i++;
                }
                log.info("发送http-post请求:" + str);
                StringEntity stringEntity = new StringEntity(str);
                httpPost.setEntity(stringEntity);
            }
            response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "utf-8");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return resultString == null ? "" : resultString;
    }

    public static String doHttpsGetJson(String Url) {
        String message = "";
        try {
            URL urlGet = new URL(Url);
            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            http.setDoOutput(true);
            http.setDoInput(true);
            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");//连接超时30秒28
            System.setProperty("sun.net.client.defaultReadTimeout", "30000"); //读取超时30秒29 30
            http.connect();
            InputStream is = http.getInputStream();
            int size = is.available();
            byte[] jsonBytes = new byte[size];
            is.read(jsonBytes);
            message = new String(jsonBytes, "UTF-8");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}