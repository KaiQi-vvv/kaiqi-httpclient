package util;

import HttpClient.HttpClientUtil;

/**
 * @1.Title:
 * @2.Description:
 * @3.Company:com.yunva
 * @4.Author :jianhai.li
 * @5.Date : 2018/7/31
 */
public class Ip138Get {
    public static void main(String[] args) {
        String url = "http://ip.yayaim.com/query?ip=14.199.255.251";
        System.out.println(HttpClientUtil.HttpGetWithJson(url));
    }
}
