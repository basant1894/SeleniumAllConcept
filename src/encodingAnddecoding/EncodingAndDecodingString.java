package encodingAnddecoding;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingString {
	public static void main(String[] args) {
		
		String str = "test123";
		
		//Encoding 
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String: "+new String(encodedString));
		
		//Decoding
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("Decoded string: "+new String(decodedString));
	}

}
