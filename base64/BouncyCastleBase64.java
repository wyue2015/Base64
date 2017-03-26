package base64;

import org.bouncycastle.util.encoders.Base64;

/**
 * 
 * @author wy
 * 使用bouncycastle的jar包bcprov-jdk15on-155.jar，实现Base64加密、解密
 * jar包的下载地址：
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
		String str_encode = BouncyCastleBase64.Base64Encode("Hello World：你好！");
		System.out.println(str_encode);
		String str_decode = BouncyCastleBase64.Base64Decode(str_encode);
		System.out.println(str_decode);
	}
	
}
