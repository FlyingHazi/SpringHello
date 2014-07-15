package com.qunar.hazi.context;

import java.util.Date;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldService {

    private String text;

    private Date date;

    private com.qunar.hazi.context.OutputService outputService;

    public void helloWorld() {
        outputService.output(text, date);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
