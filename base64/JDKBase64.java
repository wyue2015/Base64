package base64;

import java.util.Base64;


/**
 * 
 * @author wy
 * ʹ��JDK1.8��JRE1.8�汾ʵ��Base64�ļӽ���
 */
public class JDKBase64 {
	
	public static String base64Encode(String str){
		String str_encode = Base64.getEncoder().encodeToString(str.getBytes());
		return str_encode;
	}
	
	public static String base64Decode(String str){
		byte[] bytes = Base64.getDecoder().decode(str);
		return new String(bytes);
	}
	
	public static void main(String[] args) {
		String str_encode = JDKBase64.base64Encode("Hello World����ã�");
		System.out.println(str_encode);
		
		String str_decode = JDKBase64.base64Decode(str_encode);
		System.out.println(str_decode);
	}
	
}
