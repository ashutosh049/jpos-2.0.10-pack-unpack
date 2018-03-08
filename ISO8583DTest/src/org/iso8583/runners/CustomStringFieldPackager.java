package org.iso8583.runners;

import org.jpos.iso.BinaryInterpreter;
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
public class CustomStringFieldPackager extends ISOStringFieldPackager {

	private int len;
	private String description;
	private Padder padder;
	private Interpreter interpreter;
	private Prefixer prefixer; 
	private int digits;

	public CustomStringFieldPackager(String description, int len, Padder padder, Interpreter interpreter, Prefixer prefixer) {
		super(len, description, padder, interpreter, prefixer);
		this.len = len;
		this.description = description;
		this.padder = padder;
		this.interpreter = interpreter;
		this.prefixer = prefixer;
	}
	
	
	public CustomStringFieldPackager(String description, int len, Padder padder, Interpreter interpreter, Prefixer prefixer, int digits) {
		super(len, description, padder, interpreter, prefixer);
		this.len = len;
		this.description = description;
		this.padder = padder;
		this.interpreter = interpreter;
		this.prefixer = prefixer;
		checkLength(len, digits);
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

	public Padder getPadder() {
		return padder;
	}

	public void setPadder(NullPadder padder) {
		this.padder = padder;
	}

	public Interpreter getInterpreter() {
		return interpreter;
	}

	public void setInterpreter(Interpreter interpreter) {
		this.interpreter = interpreter;
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