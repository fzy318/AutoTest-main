package com.course.httpclient.code.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * TestNG组测试
 *  1，方法级别分组的测试，关于在方法上分组的标签注解
 **/

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
   }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3333");
   }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的运行方法");
   }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的运行方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前的运行的方法");
    }
    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是客户端组运行之前的运行的方法");
    }
}
