package base64;
import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author wy
 * 使用apache的jar包commons-codec-1.10.jar，实现Base64加密、解密
 * jar包的下载地址：
 * http://commons.apache.org/proper/commons-codec/download_codec.cgi
 */
public class CommonsCodecBase64 {
	
	//调用Base64的静态方法实现Base64加解密
	public static String base64Encode(String str){
		byte[] bytes=null;
		bytes = Base64.encodeBase64(str.getBytes());
		return new String(bytes);
	}
	
	public static String base64Decode(String str){
		byte[] bytes=null;
		bytes = Base64.decodeBase64(str);
		return new String(bytes);
	}
	
	//test
	public static void main(String[] args) {
		String strEncode = CommonsCodecBase64.base64Encode("hello world：你好！");
		System.out.println(strEncode);
		String strDecode = CommonsCodecBase64.base64Decode(strEncode);
		System.out.println(strDecode);
	}
/*	//调用Base64的非静态方法实现Base64加解密
	public static String base64Encode(String str){
		Base64 base64Encode = new Base64();
		byte[] bytes = null;
			bytes = base64Encode.encode(str.getBytes());
		
		return new String(bytes);
	}
	
	public static String base64Decode(String str){
		Base64 base64Decode = new Base64();
		byte[] bytes = null;
			bytes = base64Decode.decode(str);
		
		
		
		return new String(bytes);
	}
	
	public static void main(String[] args) {
		String strEncode = CommonsCodecBase64.base64Encode("Hello World：你好");
		System.out.println(strEncode);
		
		String strDecode = CommonsCodecBase64.base64Decode(strEncode);
		System.out.println(strDecode);
		
	}
*/
}
