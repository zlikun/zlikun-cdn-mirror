package com.zlikun.cdn.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * 下载资源文件
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/7/7 14:07
 */
public class DownloadTest {

    OkHttpClient client = new OkHttpClient.Builder().build() ;

    @Test
    public void download() throws IOException {

        Request request = new Request.Builder()
                .url("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js")
                .build() ;

        Response response = client.newCall(request).execute() ;

        Assert.assertTrue(response.isSuccessful());

        String content = response.body().string() ;

        System.out.println(content);

    }

}
