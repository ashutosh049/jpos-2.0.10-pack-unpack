package org.iso8583.runners;

import org.jpos.iso.AsciiHexInterpreter;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.AsciiPrefixer;
import org.jpos.iso.EbcdicHexInterpreter;
import org.jpos.iso.EbcdicInterpreter;
import org.jpos.iso.EbcdicPrefixer;
import org.jpos.iso.ISOBasePackager;
import org.jpos.iso.ISOFieldPackager;
import org.jpos.iso.LeftPadder;
import org.jpos.iso.LiteralBinaryInterpreter;
import org.jpos.iso.NullPrefixer;

/**
 * DESCRIPTION GOES HERE<br>
 * <br>
 * Copyright (c) 2018 kumar.ashutosh.dubey@outlook.com
 *
 * @author Ashutosh
 * @created Mar 8, 2018
 * @version $Revision$
 */
public class DF55CustomPackager extends ISOBasePackager {
	
	/*
	 * INTERPRETER :
	 * AsciiInterpreter, BCDInterpreter, EbcdicInterpreter, HEXInterpreter,
	 * LiteralInterpreter, SignedEbcdicNumberInterpreter
	 */
	
	/*
	 * PREFIXER :
	 * AsciiPrefixer, BcdPrefixer, BinaryPrefixer, EbcdicPrefixer,
	 * HexNibblesPrefixer, IF_FBINARY.FullyConsumingPrefixer,
	 * IF_FCHAR.FullyConsumingPrefixer, NullPrefixer
	 */
	
	/*
	 * PADDER :
	 * LeftPadder, NullPadder, RightPadder, RightTPadder
	 * */
	protected ISOFieldPackager fld[] = { 
			 new CustomStringFieldPackager(DF55TagDescriptions.DF55_1, 8, LeftPadder.ZERO_PADDER , AsciiInterpreter.INSTANCE, AsciiPrefixer.LL),
			 new CustomStringFieldPackager(DF55TagDescriptions.DF55_2, 8, LeftPadder.ZERO_PADDER , EbcdicInterpreter.INSTANCE, EbcdicPrefixer.LL),
			 new CustomBinaryFieldPackager(DF55TagDescriptions.DF55_3, 8, EbcdicHexInterpreter.INSTANCE, AsciiPrefixer.LL),
			 new CustomBinaryFieldPackager(DF55TagDescriptions.DF55_4, 4, AsciiHexInterpreter.INSTANCE,  NullPrefixer.INSTANCE),//IFA_BINARY
			 new CustomBinaryFieldPackager(DF55TagDescriptions.DF55_5, 8, LiteralBinaryInterpreter.INSTANCE, NullPrefixer.INSTANCE),//IFB_BINARY
			 new CustomBinaryFieldPackager(DF55TagDescriptions.DF55_6, 8, EbcdicHexInterpreter.INSTANCE,  NullPrefixer.INSTANCE),//IFE_BINARY
			 };

	public DF55CustomPackager() {
		super();
		setFieldPackager(fld);
	}
}