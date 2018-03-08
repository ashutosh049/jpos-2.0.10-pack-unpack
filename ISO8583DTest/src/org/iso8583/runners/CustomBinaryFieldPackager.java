package org.iso8583.runners;

import org.jpos.iso.BinaryInterpreter;
import org.jpos.iso.ISOBinaryFieldPackager;
import org.jpos.iso.ISOStringFieldPackager;
import org.jpos.iso.Interpreter;
import org.jpos.iso.NullPadder;
import org.jpos.iso.Padder;
import org.jpos.iso.Prefixer;

/**
 * DESCRIPTION GOES HERE<br>
 * <br>
 * Copyright (c) 2018 kumar.ashutosh.dubey@outlook.com
 *
 * @author Ashutosh
 * @created Mar 8, 2018
 * @version $Revision$
 */
public class CustomBinaryFieldPackager extends ISOBinaryFieldPackager {

	private int len;
	private String description;
	private BinaryInterpreter bInterpreter;
	private Prefixer prefixer; 
	private int digits;
	
	
	public CustomBinaryFieldPackager(String description, int len, BinaryInterpreter bInterpreter, Prefixer prefixer) {
		super(len, description, bInterpreter, prefixer);
		this.len = len;
		this.description = description;
		this.bInterpreter = bInterpreter;
		this.prefixer = prefixer;
	}

	public void setLength(int len, int digits) {
		checkLength(len, digits);
		super.setLength(len);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Prefixer getPrefixer() {
		return prefixer;
	}

	public void setPrefixer(Prefixer prefixer) {
		this.prefixer = prefixer;
	}

	public int getDigits() {
		return digits;
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}
	
	
}