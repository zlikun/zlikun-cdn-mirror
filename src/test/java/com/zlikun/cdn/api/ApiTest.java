package com.zlikun.cdn.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * 测试资源获取API
 * @auther zlikun <zlikun-dev@hotmail.com>
 * @date 2017/7/7 14:02
 */
public class ApiTest {

    OkHttpClient client = new OkHttpClient.Builder().build() ;

    @Test
    public void query() throws IOException {

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

    @Test
    public void library() throws IOException {

        Request request = new Request.Builder()
                .url("https://api.cdnjs.com/libraries/jquery")
                .build() ;

        Response response = client.newCall(request).execute() ;

        Assert.assertTrue(response.isSuccessful());

        String content = response.body().string() ;

        // {"name":"jquery","filename":"jquery.min.js","version":"3.2.1","description":"JavaScript library for DOM operations","homepage":"http://jquery.com/","keywords":["jquery","library","ajax","framework","toolkit","popular"],"namespace":"jQuery","repository":{"type":"git","url":"https://github.com/jquery/jquery.git"},"license":"MIT","author":{"name":"jQuery Foundation and other contributors","url":"https://github.com/jquery/jquery/blob/master/AUTHORS.txt"},"autoupdate":{"type":"npm","target":"jquery"},"assets":[{"version":"3.2.1","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.2.0","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.1.1","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.1.0","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.0.0-rc1","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.0.0-beta1","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"3.0.0-alpha1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"3.0.0","files":["core.js","jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"2.2.4","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.2.3","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"2.2.2","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"2.2.1","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"2.2.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.4","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.3","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.1-rc2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.1-rc1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.1-beta1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.0-rc1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.0-beta3","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.0-beta2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.1.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.0.3","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.0.2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.0.1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"2.0.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.12.4","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.12.3","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"1.12.2","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"1.12.1","files":["jquery.js","jquery.min.js","jquery.min.map","jquery.slim.js","jquery.slim.min.js","jquery.slim.min.map"]},{"version":"1.12.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.3","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.1-rc2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.1-rc1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.1-beta1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.0-rc1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.0-beta3","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.11.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.10.2","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.10.1","files":["jquery.js","jquery.min.js","jquery.min.map","themes/base/images/animated-overlay.gif","themes/base/images/ui-bg_flat_0_aaaaaa_40x100.png","themes/base/images/ui-bg_flat_75_ffffff_40x100.png","themes/base/images/ui-bg_glass_55_fbf9ee_1x400.png","themes/base/images/ui-bg_glass_65_ffffff_1x400.png","themes/base/images/ui-bg_glass_75_dadada_1x400.png","themes/base/images/ui-bg_glass_75_e6e6e6_1x400.png","themes/base/images/ui-bg_glass_95_fef1ec_1x400.png","themes/base/images/ui-bg_highlight-soft_75_cccccc_1x100.png","themes/base/images/ui-icons_222222_256x240.png","themes/base/images/ui-icons_2e83ff_256x240.png","themes/base/images/ui-icons_454545_256x240.png","themes/base/images/ui-icons_888888_256x240.png","themes/base/images/ui-icons_cd0a0a_256x240.png","themes/base/jquery.ui.accordion.css","themes/base/jquery.ui.accordion.min.css","themes/base/jquery.ui.all.css","themes/base/jquery.ui.all.min.css","themes/base/jquery.ui.autocomplete.css","themes/base/jquery.ui.autocomplete.min.css","themes/base/jquery.ui.base.css","themes/base/jquery.ui.base.min.css","themes/base/jquery.ui.button.css","themes/base/jquery.ui.button.min.css","themes/base/jquery.ui.core.css","themes/base/jquery.ui.core.min.css","themes/base/jquery.ui.datepicker.css","themes/base/jquery.ui.datepicker.min.css","themes/base/jquery.ui.dialog.css","themes/base/jquery.ui.dialog.min.css","themes/base/jquery.ui.menu.css","themes/base/jquery.ui.menu.min.css","themes/base/jquery.ui.progressbar.css","themes/base/jquery.ui.progressbar.min.css","themes/base/jquery.ui.resizable.css","themes/base/jquery.ui.resizable.min.css","themes/base/jquery.ui.selectable.css","themes/base/jquery.ui.selectable.min.css","themes/base/jquery.ui.slider.css","themes/base/jquery.ui.slider.min.css","themes/base/jquery.ui.spinner.css","themes/base/jquery.ui.spinner.min.css","themes/base/jquery.ui.tabs.css","themes/base/jquery.ui.tabs.min.css","themes/base/jquery.ui.theme.css","themes/base/jquery.ui.theme.min.css","themes/base/jquery.ui.tooltip.css","themes/base/jquery.ui.tooltip.min.css"]},{"version":"1.10.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.9.1","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.9.0","files":["jquery.js","jquery.min.js","jquery.min.map"]},{"version":"1.8.3","files":["jquery.js","jquery.min.js"]},{"version":"1.8.2","files":["jquery.js","jquery.min.js"]},{"version":"1.8.1","files":["jquery.js","jquery.min.js"]},{"version":"1.8.0","files":["jquery-1.8.0.js","jquery-1.8.0.min.js","jquery.js","jquery.min.js"]},{"version":"1.7.2","files":["jquery.min.js"]},{"version":"1.7.1","files":["jquery.min.js"]},{"version":"1.7","files":["jquery.min.js"]},{"version":"1.6.4","files":["jquery.js","jquery.min.js"]},{"version":"1.6.3","files":["jquery.js","jquery.min.js"]},{"version":"1.6.2","files":["jquery.js","jquery.min.js"]},{"version":"1.6.1","files":["jquery.js","jquery.min.js"]},{"version":"1.5.1","files":["jquery.js","jquery.min.js"]},{"version":"1.4.4","files":["jquery.js","jquery.min.js"]},{"version":"1.4.3","files":["jquery.js","jquery.min.js"]},{"version":"1.4.2","files":["jquery.js","jquery.min.js"]},{"version":"1.4.1","files":["jquery.js","jquery.min.js"]},{"version":"1.4.0","files":["jquery.js","jquery.min.js"]},{"version":"1.3.2","files":["jquery.js","jquery.min.js"]},{"version":"1.3.1","files":["jquery.js","jquery.min.js"]},{"version":"1.3.0","files":["jquery.js","jquery.min.js"]},{"version":"1.2.6","files":["jquery.js","jquery.min.js"]},{"version":"1.2.3","files":["jquery.js","jquery.min.js"]}]}
        System.out.println(content);

    }

}
