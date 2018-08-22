
import HttpClient.HttpClientUtil;
import util.EncrypUtil;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @1.Title:
 * @2.Description:
 * @3.Company:com.yunva
 * @4.Author :jianhai.li
 * @5.Date : 2018/7/30
 */
public class getsClient {
    public static void main(String[] args) throws Exception {
        
        Integer environment = 2;//1正式  2测试  3本机
        String url="";
        String json ="";
        if(environment==1){
            url = "http://123.56.176.211:9800/gets";
            json = "{\"appId\":\"6\",\"comement\":\"20180815202437481000002\",\"requestType\":\"jar\",\"uuid\":\"uuid1\",\"appVersion\":\"6.6.6\",\"model\":\"OPPO R7\",\"osType\":1,\"osVersion\":\"5.1\",\"sdkVersion\":\"3.0.1\",\"vendor\":\"OPPO\",\"imsi\":\"460036221800421\",\"imei\":\"862828032520919\",\"mac\":\"c0:9f:05:f1:2b:12\",\"ip\":\"192.168.20.22\",\"connectionType\":\"WIFI\",\"operatorType\":\"电信\"}";
        
        }else if(environment==2){
            url = "http://106.75.63.191:9800/gets";
            json = "{\"appId\":\"6\",\"comement\":\"20180815202437481000002\",\"requestType\":\"jar\",\"uuid\":\"uuid1\",\"appVersion\":\"6.6.6\",\"model\":\"OPPO R7\",\"osType\":1,\"osVersion\":\"5.1\",\"sdkVersion\":\"3.0.1\",\"vendor\":\"OPPO\",\"imsi\":\"460036221800421\",\"imei\":\"862828032520919\",\"mac\":\"c0:9f:05:f1:2b:12\",\"ip\":\"192.168.20.22\",\"connectionType\":\"WIFI\",\"operatorType\":\"电信\"}";

        }else{
            url = "http://127.0.0.1:9800/gets";
            json = "{\"appId\":\"6\",\"comement\":\"20180815202437481000002\",\"requestType\":\"jar\",\"uuid\":\"uuid1\",\"appVersion\":\"6.6.6\",\"model\":\"OPPO R7\",\"osType\":1,\"osVersion\":\"5.1\",\"sdkVersion\":\"3.0.1\",\"vendor\":\"OPPO\",\"imsi\":\"460036221800421\",\"imei\":\"862828032520919\",\"mac\":\"c0:9f:05:f1:2b:12\",\"ip\":\"192.168.20.22\",\"connectionType\":\"WIFI\",\"operatorType\":\"电信\"}";
       
        }
        String jsonEncry = EncrypUtil.encryptString(json);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        System.out.println(sdf.format(new Date()));
        System.out.println();
        System.out.println(EncrypUtil.decryptString(HttpClientUtil.HttpPostWithJson(url, jsonEncry)));
        System.out.println();
        System.out.println(sdf.format(new Date()));
        
        
        System.out.println("");
        System.out.println("end");
    }

    

}
