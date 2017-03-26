package base64;

import org.bouncycastle.util.encoders.Base64;

/**
 * 
 * @author wy
 * ʹ��bouncycastle��jar��bcprov-jdk15on-155.jar��ʵ��Base64���ܡ�����
 * jar�������ص�ַ��
 * http://www.bouncycastle.org/latest_releases.html
 */
public class BouncyCastleBase64 {
	
	public static String Base64Encode(String str){
		byte[] bytes = Base64.encode(str.getBytes());
		return new String(bytes);
	}
	
	public static String Base64Decode(String str){
		byte[] bytes = Base64.decode(str);
		return new String(bytes);
	}
	
	public static void main(String[] args) {
		String str_encode = BouncyCastleBase64.Base64Encode("Hello World����ã�");
		System.out.println(str_encode);
		String str_decode = BouncyCastleBase64.Base64Decode(str_encode);
		System.out.println(str_decode);
	}
	
}
