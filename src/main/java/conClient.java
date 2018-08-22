
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
public class conClient {
    public static void main(String[] args) throws Exception {
        
        Integer environment = 2;//1正式  2测试  3本机
        String url="";
        String json ="";
        if(environment==1){
            url = "http:environment//123.56.176.211:9800/con";
            json = "{\"uuid\":\"uuid1\",\"appId\":\"6\",\"appVersion\":\"6.6.6\",\"sdkVersion\":\"3.0.0\",\"packageName\":\"com.yunva1\",\"signature\":\"sign2\",\"inment\":\"inmentuuid1\",\"osType\":1}";
        }else if(environment==2){
            url = "http://106.75.63.191:9800/con";
            json = "{\"uuid\":\"uuid1\",\"appId\":\"6\",\"appVersion\":\"6.6.6\",\"sdkVersion\":\"3.0.0\",\"packageName\":\"com.yunva1\",\"signature\":\"sign2\",\"inment\":\"inmentuuid1\",\"osType\":1}";

        }else{
            url = "http://127.0.0.1:9800/con";
            json = "{\"uuid\":\"uuid1\",\"appId\":\"6\",\"appVersion\":\"6.6.6\",\"sdkVersion\":\"3.0.0\",\"packageName\":\"com.yunva1\",\"signature\":\"sign2\",\"inment\":\"inmentuuid1\",\"osType\":1}";

        }
        String jsonEncry = EncrypUtil.encryptStringTwo(json);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        System.out.println(sdf.format(new Date()));
        System.out.println();
        System.out.println(EncrypUtil.decryptStringTwo(HttpClientUtil.HttpPostWithJson(url, jsonEncry)));
        System.out.println();
        System.out.println(sdf.format(new Date()));
        
        
        System.out.println("");
        System.out.println("end");
    }

    

}
