package com.course.httpclient.code;

import org.testng.annotations.Test;

/**
 * TestNG之异常测试
 *  什么时候会用到异常测试
 *  预期结果为某一个异常的时候
 *      例如：传入的某些参数不合法。让程序抛出异常
 *      即预期结果为异常，就是这个异常*/

public class ExceptedException {

    //这是一个失败的异常测试 用关键字expectedExceptions
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        //你的预期异常是什么 然后抛出一个异常
        throw new RuntimeException();
    }

}
