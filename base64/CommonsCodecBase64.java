package base64;
import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author wy
 * ʹ��apache��jar��commons-codec-1.10.jar��ʵ��Base64���ܡ�����
 * jar�������ص�ַ��
 * http://commons.apache.org/proper/commons-codec/download_codec.cgi
 */
public class CommonsCodecBase64 {
	
	//����Base64�ľ�̬����ʵ��Base64�ӽ���
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
		String strEncode = CommonsCodecBase64.base64Encode("hello world����ã�");
		System.out.println(strEncode);
		String strDecode = CommonsCodecBase64.base64Decode(strEncode);
		System.out.println(strDecode);
	}
/*	//����Base64�ķǾ�̬����ʵ��Base64�ӽ���
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
		String strEncode = CommonsCodecBase64.base64Encode("Hello World�����");
		System.out.println(strEncode);
		
		String strDecode = CommonsCodecBase64.base64Decode(strEncode);
		System.out.println(strDecode);
		
	}
*/
}
