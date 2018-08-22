package util;

public class EncrypUtil {
    
    public static String decryptString(String content) throws Exception{
        String str = AESUtils.decode(content);//先aes解密
        return Base64Util.decryptString(str);//在base64解密
    }
    
	public static String encryptString(String content) throws Exception{
		String str = Base64Util.encryptString(content);//先base64加密
		return AESUtils.encode(str);//再aes加密
	}


    public static String decryptStringTwo(String content) throws Exception{
        String str = AESUtilsTwo.decode(content);//先aes解密
        return Base64Util.decryptString(str);//在base64解密
    }
	
	
    public static String encryptStringTwo(String content) throws Exception{
        String str = Base64Util.encryptString(content);//先base64加密
        return AESUtilsTwo.encode(str);//再aes加密
    }

   
}
