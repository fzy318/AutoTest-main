package com.course.httpclient.code.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyGetCookies {

    private String url;
    //引入配置文件
    private ResourceBundle bundle;

    @BeforeTest
    public void beforeTestBundle(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test_dev.url");
    }

    @Test
    public void testGetCookies() throws IOException {

        //抽离配置文件逻辑如下
        String result;
        //从配置文件中 获取接口路径uri
        String uri = bundle.getString("get_cookies");
        //拼接组装url
        String testUrl = this.url+uri;

        //测试逻辑代码编写
        //1，上送拼接好的url
        HttpGet get = new HttpGet(testUrl);
        //2,创建HttpClient对象
        HttpClient client = new DefaultHttpClient();
        //3,获取返回
        HttpResponse response = client.execute(get);
        //4,返回值转换为字符串赋值与result
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        //5,打印结果
        System.out.println(result);


    }
}
