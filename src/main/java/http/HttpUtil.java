package http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {

    public static String doGet(String url) {
        StringBuilder result = new StringBuilder();
        HttpURLConnection conn = null;
        BufferedReader br = null;
        String content;
        try {
            URL u = new URL(url);
            conn = (HttpURLConnection) u.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(60000);
            conn.setConnectTimeout(60000);
            conn.setRequestProperty("Accept", "*/*");
            conn.setRequestProperty("Connection", "close");
            conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64; rv:52.0)" +
                    " Gecko/20100101 Firefox/52.0");
            conn.setRequestProperty("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
            if (conn.getResponseCode() == 200) {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                while ((content = br.readLine()) != null) {
                    result.append(content);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return result.toString();
    }
}
