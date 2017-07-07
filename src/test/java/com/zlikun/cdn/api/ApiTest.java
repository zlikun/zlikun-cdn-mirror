package com.zlikun.cdn.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/7/7 14:02
 */
public class ApiTest {

    OkHttpClient client = new OkHttpClient.Builder().build() ;

    @Test
    public void libraries() throws IOException {

        Request request = new Request.Builder()
                .url("https://api.cdnjs.com/libraries?search=jquery")
                .build() ;

        Response response = client.newCall(request).execute() ;

        Assert.assertTrue(response.isSuccessful());

        String content = response.body().string() ;

        /**
         * {
         *  "results":[
         *      {"name":"jquery","latest":"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"},
         *      ...
         *  ],
         *  "total":739
         * }
         */
        System.out.println(content);

    }

}
