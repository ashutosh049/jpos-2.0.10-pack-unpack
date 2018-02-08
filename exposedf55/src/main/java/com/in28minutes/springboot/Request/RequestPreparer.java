/**
 * 
 */
package com.in28minutes.springboot.Request;

import java.io.InputStream;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;

/**
 * @author Ashutosh.Dubye
 *
 */
public class RequestPreparer {

	public static void main(String[] args) throws ISOException {
		
		RequestPreparer preparer = new RequestPreparer();
	        try {
	            String message = preparer.buildISOMessage();
	            System.out.printf("Message = %s", message);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	private String buildISOMessage() throws Exception {
        try {
            // Load package from resources directory.
            InputStream is = getClass().getResourceAsStream("/fields.xml");
            GenericPackager packager = new GenericPackager(is);

            ISOMsg isoMsg = new ISOMsg();
            isoMsg.setPackager(packager);
            isoMsg.setMTI("0200");

            isoMsg.set(3, "000010");
            isoMsg.set(4, "1500");
            isoMsg.set(7, "1206041200");
            isoMsg.set(11, "000001");
            isoMsg.set(41, "12340001");
            isoMsg.set(49, "840");
            printISOMessage(isoMsg);

            byte[] result = isoMsg.pack();
            return new String(result);
        } catch (ISOException e) {
            throw new Exception(e);
        }
    }
	
	public byte[] getRequestBytes() throws Exception {
        try {
            // Load package from resources directory.
            InputStream is = getClass().getResourceAsStream("/fields.xml");
            GenericPackager packager = new GenericPackager(is);

            ISOMsg isoMsg = new ISOMsg();
            isoMsg.setPackager(packager);
            isoMsg.setMTI("0200");

            isoMsg.set(3, "000010");
            isoMsg.set(4, "1500");
            isoMsg.set(7, "1206041200");
            isoMsg.set(11, "000001");
            isoMsg.set(41, "12340001");
            isoMsg.set(49, "840");
            printISOMessage(isoMsg);

            byte[] result = isoMsg.pack();
            //return new String(result);
            return result;
        } catch (ISOException e) {
            throw new Exception(e);
        }
    }
	 
	 private void printISOMessage(ISOMsg isoMsg) {
	        try {
	            System.out.printf("MTI = %s%n", isoMsg.getMTI());
	            for (int i = 1; i <= isoMsg.getMaxField(); i++) {
	                if (isoMsg.hasField(i)) {
	                    System.out.printf("Field (%s) = %s%n", i, isoMsg.getString(i));
	                }
	            }
	        } catch (ISOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
