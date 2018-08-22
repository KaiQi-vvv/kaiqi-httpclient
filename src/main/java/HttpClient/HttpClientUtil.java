package HttpClient;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * @1.Title:
 * @2.Description:
 * @3.Company:com.yunva
 * @4.Author :jianhai.li
 * @5.Date : 2018/7/31
 */
public class HttpClientUtil {
    public static String HttpPostWithJson(String url, String json) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = null;
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try{
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();

            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);

            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json,"utf-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(requestEntity);

            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost,responseHandler); //调接口获取返回值时，必须用此方法

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
    
    /*
    // 接收参数json列表
    DefaultHttpClient httpClient = new DefaultHttpClient();
    HttpPost method = new HttpPost(url);
    
    JSONObject jsonParam = new JSONObject();
    jsonParam.put("chnl_id", "11");// 红谷滩新闻资讯，channelId 77
    jsonParam.put("title", bean.getTitle());// 标题
    jsonParam.put("content", bean.getContent());// 资讯内容
    jsonParam.put("source_url", bean.getSourceUrl());// 资讯源地址
    jsonParam.put("source_name", bean.getSourceFrom());// 来源网站名称
    jsonParam.put("img_urls", bean.getImgUrls());// 采用 url,url,url 的格式进行图片的返回
    
    StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题  
    entity.setContentEncoding("UTF-8");  
    entity.setContentType("application/json");  
    method.setEntity(entity);  
    * */


    public static String HttpGetWithJson(String url) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = null;
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try{
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();

            //第二步：创建HttpGet对象
            HttpGet httpGet = new HttpGet(url);

            //第三步：给HttpGet设置格式的参数
            httpGet.setHeader("Content-type", "application/json");

            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpGet,responseHandler); //调接口获取返回值时，必须用此方法

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
    
    
    
}
