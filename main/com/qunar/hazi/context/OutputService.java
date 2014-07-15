package com.qunar.hazi.context;

import java.util.Date;

/**
 * @author yihua.huang@dianping.com
 */
public class OutputService {

    private com.qunar.hazi.context.HelloWorldService helloWorldService;

    public void output(String text, Date date) {
        System.out.println(text);
        System.out.println(date);
    }

    public void setHelloWorldService(com.qunar.hazi.context.HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
