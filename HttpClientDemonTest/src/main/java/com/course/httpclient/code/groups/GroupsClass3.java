package com.course.httpclient.code.groups;


import org.testng.annotations.Test;

/**
 * TestNG组测试
 *  2，类级别分组的测试，把整个类文件进行分组测试
 *      注：把@Test标签添加在类上，就是类测试,@Test(groups = "stu")对类进行分组
 **/

@Test(groups = "teacher")
public class GroupsClass3 {

    public void teacher1(){
        System.out.println("这是GroupsClass3中的teacher1方法运行");
    }

    public void teacher2(){
        System.out.println("这是GroupsClass3中的teacher2方法运行");
    }
}
