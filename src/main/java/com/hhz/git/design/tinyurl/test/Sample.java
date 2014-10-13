package com.hhz.git.design.tinyurl.test;

import com.hhz.git.design.tinyurl.service.TinyUrlService;

/**
 * Created by huahan on 10/13/14.
 */
public class Sample {

    public static void main(String[] args) {
        TinyUrlService tinyUrlService = new TinyUrlService();

        String orgUrl = "test";
        String shortUrl = tinyUrlService.put(orgUrl);
        String val = tinyUrlService.get(shortUrl);
        assert val.equals(orgUrl);


    }
}
