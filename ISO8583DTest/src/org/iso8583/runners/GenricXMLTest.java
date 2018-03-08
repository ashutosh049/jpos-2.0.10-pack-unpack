package org.iso8583.runners;

import java.io.InputStream;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;

public class GenricXMLTest {
	
	public static void main(String[] args) throws Exception {
		GenricXMLTest xmlTest = new GenricXMLTest();
		xmlTest.parseISOMessage();
	}
	
	private ISOMsg parseISOMessage() throws Exception {
        try {
            InputStream is = getClass().getResourceAsStream("/DataTypes.xml");
            DF55CustomPackager packager = new DF55CustomPackager();
            GenericPackager gp = new GenericPackager(is);
            ISOMsg isoReq = new ISOMsg("1100");
            isoReq.setPackager(gp);
            
            
            ISOMsg isoMsgDF55 = new ISOMsg(55);
            isoMsgDF55.setPackager(packager);
            
            isoMsgDF55.set(1, "AGNS");
            isoMsgDF55.set(2, "AGNS");
            //isoMsgDF55.set(3, "AGNS");
           /* isoMsgDF55.set(4, "AGNS");
            isoMsgDF55.set(5, "AGNS");
            isoMsgDF55.set(6, "AGNS");*/
            
            byte[] df55Bytes = isoMsgDF55.pack();
            isoMsgDF55.dump (System.out, "");

            
            isoReq.setMTI("1100");
            isoReq.set(2, "374245001751006");
            isoReq.set(3, "004000");
            isoReq.set(4, "000000000200");
            isoReq.set(11, "000394");
            isoReq.set(12, "180227130431");
            isoReq.set(13, "1602");
            isoReq.set(14, "1703");
            isoReq.set(19, "826");
            isoReq.set(22, "510101511344");
            isoReq.set(24, "100");
            isoReq.set(25, "1900");
            isoReq.set(26, "5999");
            isoReq.set(35, "374245001751006=170320115041234500000");
            isoReq.set(41, "00000011");
            isoReq.set(42, "1803351105");
            isoReq.set(49, "826");
            isoReq.set("55",df55Bytes);
            isoReq.pack();
            isoReq.dump (System.out, "");
            //isoMsg.unpack(message.getBytes());
            return isoMsgDF55;
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
