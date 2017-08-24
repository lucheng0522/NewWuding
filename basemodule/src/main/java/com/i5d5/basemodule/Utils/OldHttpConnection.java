package com.i5d5.basemodule.Utils;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/**
 * class_name: OldHttpConnection
 * package_name: com.i5d5.salamu.Utils
 * acthor: lucheng
 * time: 2016/6/30 13:54
 */
public class OldHttpConnection {
    private static int TIME_OUT = 10 * 1000;
    private static String CHARSET = "utf-8";
    private static String GET = "GET";
    private static String POST = "POST";

    /**
     * 用HttpURLConnection发送get网络请求
     */
    public static String sendHttpConnection(String url, Context context) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
//        HttpsURLConnection connection = null;
        HttpURLConnection connection = null;
        String data = "";
        try {
            URL httpUrl = new URL(url);
//            connection = (HttpsURLConnection) httpUrl.openConnection();
            connection = (HttpURLConnection) httpUrl.openConnection();
            connection.setConnectTimeout(TIME_OUT);
            connection.setRequestMethod(GET);
            connection.setUseCaches(true);
//            connection.setSSLSocketFactory(getSSLSocketFactory(context));
            connection.addRequestProperty("Cache-Control", "max-age=0");
            inputStream = connection.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream, CHARSET);
            bufferedReader = new BufferedReader(inputStreamReader);
            String flag = "";
            while ((flag = bufferedReader.readLine()) != null) {
                data += flag;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "error";
        } catch (IOException e) {
            return "error";
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (connection != null) {
                    connection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    /**
     * 发送post请求
     *
     * @param url
     * @param param
     * @return
     */
    public static String sendHttpConnPost(String url, HashMap<String, String> param, Context context) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
        HttpURLConnection conn = null;
//        HttpsURLConnection conn = null;
        String data = "";

        try {
            URL httpUrl = new URL(url);
            conn = (HttpURLConnection) httpUrl.openConnection();
//            conn = (HttpsURLConnection) httpUrl.openConnection();
//            conn.connect();
            // 设置是否向connection输出，因为这个是post请求，参数要放在
            // http正文内，因此需要设为true
            conn.setDoOutput(true);
            // Read from the connection. Default is true.
            conn.setDoInput(true);
            conn.setRequestMethod(POST);
//            conn.setSSLSocketFactory(getSSLSocketFactory(context));
            // Post 请求不能使用缓存
            conn.setUseCaches(false);

            // 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
            // 意思是正文是urlencoded编码过的form参数，下面我们可以看到我们对正文内容使用URLEncoder.encode
            // 进行编码
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
            // 要注意的是connection.getOutputStream会隐含的进行connect。
            conn.connect();

            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            // The URL-encoded contend
            // 正文，正文内容其实跟get的URL中 '? '后的参数字符串一致
            String content = "";
            for (Map.Entry<String, String> entrySet : param.entrySet()) {
                content += "&" + entrySet.getKey() + "="
                        + URLEncoder.encode(entrySet.getValue(), "UTF-8");
            }
            // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写到流里面
            out.writeBytes(content);

            out.close();

            inputStream = conn.getInputStream();

            inputStreamReader = new InputStreamReader(inputStream, CHARSET);

            bufferedReader = new BufferedReader(inputStreamReader);
            String flag = "";
            while ((flag = bufferedReader.readLine()) != null) {
                data += flag;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "error";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        } finally {
            try {
                // 用完记得关闭
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static String testJsonPost(String url) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
        HttpURLConnection conn = null;
//        HttpsURLConnection conn = null;

        try {
            JSONObject obj = new JSONObject();
            obj.put("app_name", "全民大讨论");
            obj.put("app_ip", "10.21.243.234");
            obj.put("app_port", 8080);
            obj.put("app_type", "001");
            obj.put("app_area", "asd");
            URL httpUrl = new URL(url);
            conn = (HttpURLConnection) httpUrl.openConnection();
//            conn = (HttpsURLConnection) httpUrl.openConnection();
//            conn.connect();
            // 设置是否向connection输出，因为这个是post请求，参数要放在
            // http正文内，因此需要设为true
            conn.setDoOutput(true);
            // Read from the connection. Default is true.
            conn.setDoInput(true);
            conn.setRequestMethod(POST);
//            conn.setSSLSocketFactory(getSSLSocketFactory(context));
            // Post 请求不能使用缓存
            conn.setUseCaches(false);

            // 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
            // 意思是正文是urlencoded编码过的form参数，下面我们可以看到我们对正文内容使用URLEncoder.encode
            // 设置维持长连接
            conn.setRequestProperty("Connection", "Keep-Alive");
            // 设置文件字符集:
            conn.setRequestProperty("Charset", "UTF-8");
            //转换为字节数组
            byte[] data = (obj.toString()).getBytes();
            // 设置文件长度
            conn.setRequestProperty("Content-Length", String.valueOf(data.length));

            // 进行编码
            conn.setRequestProperty("Content-Type",
                    "application/json");
            // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
            // 要注意的是connection.getOutputStream会隐含的进行connect。
            conn.connect();

            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            // The URL-encoded contend
            // 正文，正文内容其实跟get的URL中 '? '后的参数字符串一致
            // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写到流里面
            out.write((obj.toString()).getBytes());

            out.close();

            inputStream = conn.getInputStream();

            inputStreamReader = new InputStreamReader(inputStream, CHARSET);

            bufferedReader = new BufferedReader(inputStreamReader);
            String flag = "";
            System.out.println(conn.getResponseCode());

            // 请求返回的状态
            if (conn.getResponseCode() == 200) {
                System.out.println("连接成功");
                // 请求返回的数据
                InputStream in = conn.getInputStream();
                String a = null;
                byte[] data1 = new byte[in.available()];
                in.read(data1);
                // 转成字符串
                a = new String(data1);

            }
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "error";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            try {
                // 用完记得关闭
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static SSLSocketFactory getSSLSocketFactory(Context context) {
        int[] certificates = new int[]{};
        if (context == null) {
            throw new NullPointerException("context == null");
        }

        //CertificateFactory用来证书生成
        CertificateFactory certificateFactory;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509");
            //Create a KeyStore containing our trusted CAs
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);

            for (int i = 0; i < certificates.length; i++) {
                //读取本地证书
                InputStream is = context.getResources().openRawResource(certificates[i]);
                keyStore.setCertificateEntry(String.valueOf(i), certificateFactory.generateCertificate(is));

                if (is != null) {
                    is.close();
                }
            }
            //Create a TrustManager that trusts the CAs in our keyStore
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);

            //Create an SSLContext that uses our TrustManager
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            return sslContext.getSocketFactory();

        } catch (Exception e) {

        }
        return null;
    }

    /**
     * 发送xml参数的post请求
     *
     * @return
     */
    public static byte[] sendXMLConnPost(String urls, String xml) {
        HttpURLConnection conn = null;
        ByteArrayOutputStream out;
        byte[] string = new byte[0];
        try {
            trustAllHosts();
            byte[] xmlbyte = xml.getBytes("UTF-8");
            URL url = new URL(urls);
            HttpsURLConnection https = (HttpsURLConnection) url.openConnection();
            https.setHostnameVerifier(new NullHostNameVerifier());
            conn = https;
            conn.setConnectTimeout(5000);
            conn.setDoOutput(true);// 允许输出
            conn.setDoInput(true);
            conn.setUseCaches(false);// 不使用缓存
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length",
                    String.valueOf(xmlbyte.length));
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");//发送自定义的头信息
            conn.getOutputStream().write(xmlbyte);
            conn.getOutputStream().flush();
            conn.getOutputStream().close();

            if (conn.getResponseCode() != 200)
                throw new RuntimeException("请求url失败");

            InputStream is = conn.getInputStream();// 获取返回数据

            // 使用输出流来输出字符(可选)
            out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            string = out.toByteArray();
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 用完记得关闭
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return string;
    }

    public static String sendHttpConnPost(String url,
                                          String[] name, String[] value) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        InputStream inputStream = null;
        HttpURLConnection conn = null;
        String data = "";

        try {
            URL httpUrl = new URL(url);

            conn = (HttpURLConnection) httpUrl.openConnection();

            // 设置是否向connection输出，因为这个是post请求，参数要放在
            // http正文内，因此需要设为true
            conn.setDoOutput(true);
            // Read from the connection. Default is true.
            conn.setDoInput(true);
            conn.setRequestMethod(POST);
            // Post 请求不能使用缓存
            conn.setUseCaches(false);

            // 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
            // 意思是正文是urlencoded编码过的form参数，下面我们可以看到我们对正文内容使用URLEncoder.encode
            // 进行编码
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
            // 要注意的是connection.getOutputStream会隐含的进行connect。
            conn.connect();

            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            // The URL-encoded contend
            // 正文，正文内容其实跟get的URL中 '? '后的参数字符串一致
            String content = "";

            for (int i = 0; i < name.length; i++) {

                content += "&" + name[i] + "="
                        + URLEncoder.encode(value[i], CHARSET);

            }
            // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写到流里面
            // Log.d("lucheng","content = "+content);
            out.writeBytes(content);


            inputStream = conn.getInputStream();

            inputStreamReader = new InputStreamReader(inputStream, CHARSET);

            bufferedReader = new BufferedReader(inputStreamReader);
            String flag = "";
            while ((flag = bufferedReader.readLine()) != null) {
                data += flag;
            }

            out.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "error";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        } finally {
            try {
                // 用完记得关闭
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    private static void trustAllHosts() {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[]{};
            }

            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }
        }};

        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class NullHostNameVerifier implements HostnameVerifier {

        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }


}
