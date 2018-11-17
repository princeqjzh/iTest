package com.test;

import net.sf.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import com.test.tools.*;

public class InterfaceTest {
    /**
     * 检查返回值参数接口测试
     */
    @Test
    public void checkURLParams(){
        String url = "http://httpbin.org/get";
        String key1 = "param1";
        String key2 = "param2";
        String value1 = "value1";
        String value2 = "value2";

        String requestUrl = url + "?" + key1 + "=" + value1 + "&" + key2 + "=" + value2;
        String responseString = RequestClient.doGet(requestUrl);
        JSONObject jsonObject = JSONObject.fromObject(responseString);
        String urlObj = (String)jsonObject.get("url");
        Assert.assertTrue("Check URL object", urlObj.contains(requestUrl));
    }
}
