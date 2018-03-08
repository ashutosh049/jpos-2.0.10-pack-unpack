package org.iso8583.runners;

import java.util.Arrays;

import org.jpos.iso.EbcdicPrefixer;
import org.jpos.iso.ISOUtil;

public class EbcdicPrefixerTest
{
	public static void main(String[] args) throws Exception {
		/* byte[] b = new byte[2];
	        EbcdicPrefixer.LL.encodeLength(21, b);
	        System.out.println(Arrays.toString(b));
	        
		byte[] b = new byte[]{(byte)0xF2, (byte)0xF5};
		System.out.println(new String(b));*/
		
		byte[] barr = ISOUtil.int2byte(21);
		
		for (byte b : barr) {
			System.out.print(b+", ");
		}
		
		System.out.println("\n"+Arrays.toString(barr));
		System.out.println(new String(barr));
		
		int len = 21;
        byte[] b = new byte[2];
        EbcdicPrefixer.LL.encodeLength(len, b);
        System.out.println("\nencodeLength : "+Arrays.toString(b));
        System.out.println(EbcdicPrefixer.LL.decodeLength(b, 0));
		
	}

}