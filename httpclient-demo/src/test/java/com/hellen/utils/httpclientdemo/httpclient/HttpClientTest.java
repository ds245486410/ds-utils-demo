package com.hellen.utils.httpclientdemo.httpclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hellen.utils.httpclientdemo.HttpclientDemoApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class HttpClientTest extends HttpclientDemoApplicationTests {
    Integer CONNECT_TIMEOUT = 6000;
    Integer SOCKET_TIMEOUT = 6000;
    @Test
    public void testpost(){
        String url = "http://localhost:8080/student/getOne";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
        httpPost.setConfig(requestConfig);
        try {
            CloseableHttpResponse execute = httpClient.execute(httpPost);
            String result = EntityUtils.toString(execute.getEntity());
            System.out.println(result);
            JSONObject jsonObject = JSON.parseObject(result);
            Long id = jsonObject.getLong("id");
            String name = jsonObject.getString("name");
            String age = jsonObject.getString("age");
            log.info("id : [{}]",id);
            log.info("name : [{}]",name);
            log.info("age : [{}]",age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
