package util;



public class Base64Util
{

	/**
	 * 得到Base64加密后的字符串
	 * @throws Exception 
	 * 
	 */
	public static String encryptString(String originalString) throws Exception {
		return YayaBase64.encode(originalString.getBytes());
	}
	
	public static String encodeBase64String(byte[] data){
		return YayaBase64.encode(data);
	}

	/**
	 * 得到Base64解密后的字符串
	 * @throws Exception 
	 * 
	 */
	public static String decryptString(String encryptString) throws Exception {
		byte[] arr = YayaBase64.decode(encryptString);
		return new String(arr);
	}
	
	public static byte[] decodeBase64(String encryptString){
		return YayaBase64.decode(encryptString);
	}

}
