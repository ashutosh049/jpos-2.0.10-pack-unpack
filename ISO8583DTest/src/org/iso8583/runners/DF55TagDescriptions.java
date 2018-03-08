package org.iso8583.runners;

/**
 * DESCRIPTION GOES HERE<br>
 * <br>
 * Copyright (c) 2018 kumar.ashutosh.dubey@outlook.com
 *
 * @author Ashutosh
 * @created Mar 8, 2018
 * @version $Revision$
 */
public class DF55TagDescriptions {
    
	public static final String DF55_1=" 9F26 - Application Cryptogram - Cryptogram returned by the ICC in response of the GENERATE AC command";
	public static final String DF55_2=" 9F10 - Issuer Application Data - Contains proprietary application data for transmission to the issuer in an online transaction";
	public static final String DF55_3=" 9F37 - Unpredictable Number - Value to provide variability and uniqueness to the generation of a cryptogram";
	public static final String DF55_4=" 9F36 - Application Transaction Counter (ATC) - Counter maintained by the application in the ICC (incrementing the ATC is managed by the ICC)";
	public static final String DF55_5=" 95 - Terminal Verification Results (TVR) - Status of the different functions as seen from the terminal";
	public static final String DF55_6=" 9A - Transaction Date - Local date that the transaction was authorised";
	public static final String DF55_7=" 9C - Transaction Type - Indicates the type of financial transaction, represented by the first two digits of ISO 8583:1987 Processing Code";
	public static final String DF55_8=" 9F02 - Amount, Authorised (Numeric) - Authorised amount of the transaction (excluding adjustments)";
	public static final String DF55_9=" 5F2A - Transaction Currency Code - Indicates the currency code of the transaction according to ISO 4217";
	public static final String DF55_10=" 9F1A - Terminal Country Code - Indicates the country of the terminal, represented according to ISO 3166";
	public static final String DF55_11=" 82 - Application Interchange Profile - Indicates the capabilities of the card to support specific functions in the application";
	public static final String DF55_12=" 9F03 - Amount, Other (Numeric) - Secondary amount associated with the transaction representing a cashback amount";
	public static final String DF55_13=" 5F34 - Application PAN Sequence Number - Identifies and differentiates cards with the same PAN";
	public static final String DF55_14=" 9F27 - Cryptogram Information Data - Indicates the type of cryptogram and the actions to be performed by the terminal";
	
}
