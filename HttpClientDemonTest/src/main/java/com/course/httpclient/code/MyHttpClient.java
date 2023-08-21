package com.course.httpclient.code;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        //定义一个变量 用来存放结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这是用来执行get的方法
        HttpClient client = new DefaultHttpClient();
        //获取get请求的返回response
        HttpResponse response = client.execute(get);
        EntityUtils.toString(response.getEntity());
        System.out.println(response+";这是第一个测试用例");
    }

}
